package hsesslingen.group4.jumbleShare.Service;

import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21Vehicletype;

import java.util.List;
import java.util.UUID;

public interface VehicleTypeService
{
    List<Grp4Ss21Vehicletype> findAll();
    Grp4Ss21Vehicletype getVehicleTypeById(UUID id);
}
