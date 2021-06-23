package hsesslingen.group4.jumbleShare.Service;

import hsesslingen.group4.jumbleShare.Controller.DbController;
import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21Vehicle;
import hsesslingen.group4.jumbleShare.Repository.Grp4Ss21VehicleRepository;
import hsesslingen.group4.jumbleShare.Web.Dto.CreateVehicleDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class VehicleServiceImpl implements VehicleService {

    private Grp4Ss21VehicleRepository vehicleRepository;

    public VehicleServiceImpl(Grp4Ss21VehicleRepository vehicleRepository) {
        super();
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public void save(CreateVehicleDto createVehicleDto) {
        Grp4Ss21Vehicle vehicle = new Grp4Ss21Vehicle(
                UUID.randomUUID(),
                createVehicleDto.getBrand(),
                createVehicleDto.getPlateOrSerialNumber(),
                createVehicleDto.getPricePerMinute(),
                createVehicleDto.getLatitude(),
                createVehicleDto.getLongitude(),
                createVehicleDto.getVehicleTypeId(),
                createVehicleDto.getUserId()
        );
        DbController dbController = new DbController();
        dbController.createNewVehicle(vehicle);
    }

    @Override
    public List<Grp4Ss21Vehicle> findAll()
    {
        return vehicleRepository.findAll();
    }
}
