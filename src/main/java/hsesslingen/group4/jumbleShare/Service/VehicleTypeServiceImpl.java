package hsesslingen.group4.jumbleShare.Service;

import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21Vehicletype;
import hsesslingen.group4.jumbleShare.Repository.Grp4Ss21VehicletypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class VehicleTypeServiceImpl implements VehicleTypeService
{

    private Grp4Ss21VehicletypeRepository vehicleTypeRepository;

    public VehicleTypeServiceImpl (Grp4Ss21VehicletypeRepository vehicleTypeRepository)
    {
        super();
        this.vehicleTypeRepository = vehicleTypeRepository;
    }

    @Override
    public List<Grp4Ss21Vehicletype> findAll()
    {
        return vehicleTypeRepository.findAll();
    }

    @Override
    public Grp4Ss21Vehicletype getVehicleTypeById(UUID id)
    {
        return vehicleTypeRepository.getById(id.toString());
    }

}
