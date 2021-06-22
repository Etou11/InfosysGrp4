package hsesslingen.group4.jumbleShare.Controller;

import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21User;
import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21Vehicle;
import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21VehicleType;
import hsesslingen.group4.jumbleShare.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class MainController
{
    DbController dbController = new DbController();

    @Autowired
    UserServiceImpl userService;

    @GetMapping(path = "getUserData")
    List<Grp4Ss21User> getUsers()
    {
        return userService.findAll();
    }

    @Autowired
    VehicleServiceImpl vehicleService;

    @GetMapping(path = "getVehicleData")
    List<Grp4Ss21Vehicle> getVehicle() { return vehicleService.findAll(); }

    @Autowired
    VehicleTypeServiceImpl vehicleTypeService;

    @GetMapping(path = "getVehicleTypeById")
    Grp4Ss21VehicleType getVehicleTypeById(UUID id) { return vehicleTypeService.getVehicleTypeById(id); }

    @GetMapping(path = "getVehicleTypes")
    List<String> getVehicleTypes() { return dbController.getAllVehicleTypes(); }



    //@PostMapping(path = "createNewVehicle")
    //public @ResponseBody String addNewVehicle (@RequestParam boolean isActive, @RequestParam String brand, @RequestParam String plateOrSerialNumber, @RequestParam String additionalInformation, @RequestParam double pricePerMinute)


}
