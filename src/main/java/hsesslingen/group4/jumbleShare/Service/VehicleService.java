package hsesslingen.group4.jumbleShare.Service;

import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21Vehicle;
import hsesslingen.group4.jumbleShare.Web.Dto.CreateVehicleDto;

public interface VehicleService {
    Grp4Ss21Vehicle save(CreateVehicleDto createVehicleDto);
}
