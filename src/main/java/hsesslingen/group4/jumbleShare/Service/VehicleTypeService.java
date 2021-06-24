package hsesslingen.group4.jumbleShare.Service;


import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21VehicleType;

import java.util.List;
import java.util.UUID;

public interface VehicleTypeService
{
    List<Grp4Ss21VehicleType> findAll();
    Grp4Ss21VehicleType getVehicleTypeById(UUID id);
}
