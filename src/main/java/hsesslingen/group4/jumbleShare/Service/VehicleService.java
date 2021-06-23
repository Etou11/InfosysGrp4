package hsesslingen.group4.jumbleShare.Service;

import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21Vehicle;
import hsesslingen.group4.jumbleShare.Web.Dto.CreateVehicleDto;

import java.util.List;

public interface VehicleService {
    void save(CreateVehicleDto createVehicleDto);
    List<Grp4Ss21Vehicle> findAll();
}
