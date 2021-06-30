package hsesslingen.group4.jumbleShare.Service;

import hsesslingen.group4.jumbleShare.Controller.DbController;
import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21Trip;
import hsesslingen.group4.jumbleShare.Helper.HelperExtension;
import hsesslingen.group4.jumbleShare.JumbleShareApplication;
import hsesslingen.group4.jumbleShare.Repository.Grp4Ss21TripRepository;
import hsesslingen.group4.jumbleShare.Web.Dto.TripDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class TripServiceImpl implements TripService
{
    @Autowired
    private Grp4Ss21TripRepository tripRepository;

    String line = "";

    public TripServiceImpl (Grp4Ss21TripRepository tripRepository)
    {
        super();
        this.tripRepository = tripRepository;
    }

    public void saveTripData() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/importTrip.csv"));
            while((line = br.readLine()) != null) {
                String [] data = line.split(";");
                Grp4Ss21Trip trip = new Grp4Ss21Trip();

                trip.setId(UUID.fromString(data[0]));
                trip.setTimestampStart(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX").parse(data[1]));
                trip.setTimestampEnd(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX").parse(data[2]));
                trip.setLongitudeOrig(new BigDecimal(data[3]));
                trip.setLatitudeOrig(new BigDecimal(data[4]));
                trip.setLongitudeFin(new BigDecimal(data[5]));
                trip.setLatitudeFin(new BigDecimal(data[6]));
                trip.setVehiclePricePerMinute(new BigDecimal(data[7]));
                trip.setUserId(UUID.fromString(data[8]));
                trip.setVehicleId(UUID.fromString(data[9]));
                tripRepository.save(trip);
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Grp4Ss21Trip findById(UUID id)
    {
        var trips = tripRepository.findAll();
        var trip = trips.stream()
                .filter(x -> HelperExtension.UuidEqualityCheck(id.toString(), x.getId().toString()))
                .findFirst()
                .orElse(new Grp4Ss21Trip());
        return trip;
    }

    @Override
    public boolean checkoutVehicle(TripDto trip)
    {
        Grp4Ss21Trip newTrip = new Grp4Ss21Trip(
                UUID.randomUUID(),
                new Timestamp(System.currentTimeMillis()),
                null,
                trip.getLongitudeOrig(),
                trip.getLatitudeOrig(),
                null,
                null,
                trip.getVehiclePricePerMinute(),
                JumbleShareApplication._currentlyActiveUser,
                trip.getVehicleId()
        );
        DbController dbController = new DbController();
        dbController.createTrip(newTrip);

        return true;
    }

    @Override
    public boolean checkinVehicle(TripDto updatedTrip)
    {
        var trips = tripRepository.findAll();
        var trip = trips.stream()
                .filter(x -> HelperExtension.UuidEqualityCheck(x.getId().toString(), updatedTrip.getId().toString()))
                .findFirst()
                .orElse(new Grp4Ss21Trip());

        trip.setLongitudeFin(updatedTrip.getLongitudeFin());
        trip.setLatitudeFin(updatedTrip.getLatitudeFin());
        trip.setTimestampEnd(new Timestamp(System.currentTimeMillis()));

        tripRepository.save(trip);

        return true;
    }

    @Override
    public boolean importTrips(List<TripDto> trips) throws IOException {

        for(var trip : trips)
        {
            checkoutVehicle(trip);
            checkinVehicle(trip);
        }

        return true;
    }

    @Override
    public Grp4Ss21Trip save(TripDto trip)
    {
        Grp4Ss21Trip newTrip = new Grp4Ss21Trip(
                UUID.randomUUID(),
                trip.getTimestampStart(),
                trip.getTimestampEnd(),
                trip.getLongitudeOrig(),
                trip.getLatitudeOrig(),
                trip.getLongitudeFin(),
                trip.getLatitudeFin(),
                trip.getVehiclePricePerMinute(),
                trip.getUserId(),
                trip.getVehicleId()
        );
        return tripRepository.save(newTrip);
    }
}
