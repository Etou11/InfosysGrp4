package hsesslingen.group4.jumbleShare.Service;

import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21Trip;
import hsesslingen.group4.jumbleShare.Helper.HelperExtension;
import hsesslingen.group4.jumbleShare.Repository.Grp4Ss21TripRepository;
import hsesslingen.group4.jumbleShare.Web.Dto.TripDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TripServiceImpl implements TripService
{
    private Grp4Ss21TripRepository tripRepository;

    public TripServiceImpl (Grp4Ss21TripRepository tripRepository)
    {
        super();
        this.tripRepository = tripRepository;
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
                trip.getId(),
                trip.getTimestampStart(),
                null,
                trip.getLongitudeOrig(),
                trip.getLatitudeOrig(),
                null,
                null,
                trip.getVehiclePricePerMinute(),
                trip.getUserId(),
                trip.getVehicleId()
        );
        tripRepository.save(newTrip);

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
        trip.setTimestampEnd(updatedTrip.getTimestampEnd());

        tripRepository.save(trip);

        return true;
    }

    @Override
    public boolean importTrips(List<TripDto> trips)
    {
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
