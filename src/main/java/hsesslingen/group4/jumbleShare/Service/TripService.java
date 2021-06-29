package hsesslingen.group4.jumbleShare.Service;

import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21Trip;
import hsesslingen.group4.jumbleShare.Web.Dto.TripDto;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

public interface TripService
{
    Grp4Ss21Trip save(TripDto trip);
    Grp4Ss21Trip findById(UUID id);
    boolean checkoutVehicle(TripDto trip);
    boolean checkinVehicle(TripDto trip);
    boolean importTrips(List<TripDto> trips) throws FileNotFoundException, IOException;

}
