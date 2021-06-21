package hsesslingen.group4.jumbleShare.Controller;

import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21User;
import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21Vehicle;
import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21Vehicletype;
import hsesslingen.group4.jumbleShare.Repository.Grp4Ss21UserRepository;
import hsesslingen.group4.jumbleShare.Repository.Grp4Ss21VehicleRepository;
import hsesslingen.group4.jumbleShare.Repository.Grp4Ss21VehicletypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController
{

    @Autowired
    Grp4Ss21UserRepository userRepository;

    @GetMapping(path = "getUserData")
    List<Grp4Ss21User> getUsers()
    {
        return userRepository.findAll();
    }

    @Autowired
    Grp4Ss21VehicleRepository vehicleRepository;

    @GetMapping(path = "getVehicleData")
    List<Grp4Ss21Vehicle> getVehicle() { return vehicleRepository.findAll(); }

    //@PostMapping(path = "createNewVehicle")
    //public @ResponseBody String addNewVehicle (@RequestParam boolean isActive, @RequestParam String brand, @RequestParam String plateOrSerialNumber, @RequestParam String additionalInformation, @RequestParam double pricePerMinute)


}
