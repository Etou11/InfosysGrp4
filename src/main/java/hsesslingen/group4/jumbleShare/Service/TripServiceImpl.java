package hsesslingen.group4.jumbleShare.Service;

import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21Trip;
import hsesslingen.group4.jumbleShare.Helper.HelperExtension;
import hsesslingen.group4.jumbleShare.Repository.Grp4Ss21TripRepository;
import hsesslingen.group4.jumbleShare.Web.Dto.TripDto;
import org.springframework.stereotype.Service;

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
