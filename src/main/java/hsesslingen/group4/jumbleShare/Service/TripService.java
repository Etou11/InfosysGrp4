package hsesslingen.group4.jumbleShare.Service;

import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21Trip;
import hsesslingen.group4.jumbleShare.Web.Dto.TripDto;

import java.util.UUID;

public interface TripService
{
    Grp4Ss21Trip save(TripDto trip);
    Grp4Ss21Trip findById(UUID id);
}
