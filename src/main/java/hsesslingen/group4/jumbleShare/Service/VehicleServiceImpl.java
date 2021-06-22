package hsesslingen.group4.jumbleShare.Service;

import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21Vehicle;
import hsesslingen.group4.jumbleShare.Repository.Grp4Ss21VehicleRepository;
import hsesslingen.group4.jumbleShare.Web.Dto.CreateVehicleDto;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements VehicleService {

    private Grp4Ss21VehicleRepository vehicleRepository;

    public VehicleServiceImpl(Grp4Ss21VehicleRepository vehicleRepository) {
        super();
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public Grp4Ss21Vehicle save(CreateVehicleDto createVehicleDto) {
        Grp4Ss21Vehicle vehicle = new Grp4Ss21Vehicle(
                createVehicleDto.getBrand(),
                createVehicleDto.getPlateOrSerialNumber(),
                createVehicleDto.getAdditionalInformation(),
                createVehicleDto.getPricePerMinute(),
                createVehicleDto.getLatitude(),
                createVehicleDto.getLongitude()
        );
        return vehicleRepository.save(vehicle);
    }
}
