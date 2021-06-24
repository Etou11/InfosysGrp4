package hsesslingen.group4.jumbleShare.Controller;

import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21User;
import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21Vehicle;
import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21VehicleType;
import hsesslingen.group4.jumbleShare.Helper.HelperExtension;
import hsesslingen.group4.jumbleShare.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

@RestController
public class MainController
{
    DbController dbController = new DbController();

    @Autowired
    UserServiceImpl userService;
    @Autowired
    VehicleServiceImpl vehicleService;
    @Autowired
    VehicleTypeServiceImpl vehicleTypeService;


    //User
    @GetMapping(path = "getUserData")
    List<Grp4Ss21User> getUsers()
    {
        return userService.findAll();
    }


    //Vehicle
    @GetMapping(path = "getVehicleData")
    List<Grp4Ss21Vehicle> getVehicle() { return vehicleService.findAll(); }

    @GetMapping(path = "getVehicleDataForUser")
    List<Grp4Ss21Vehicle> getVehicleByUserId(String userId)
    {
        var vehicles = vehicleService.findAll();
        ArrayList<Grp4Ss21Vehicle> vehiclesFiltered = new ArrayList<Grp4Ss21Vehicle>();

        for (Grp4Ss21Vehicle ele : vehicles)
        {
            if(HelperExtension.UuidEqualityCheck(userId, ele.getUserId().toString()))
                vehiclesFiltered.add(ele);
        }

        return vehiclesFiltered;
    }

    //Using DeleteMapping leads to spring security refusing connection - GetMapping as a workaround
    @GetMapping(path ="deleteVehicleById")
    boolean deleteVehicleById(String id)
    {
        vehicleService.deleteById(UUID.fromString(id));
        return true;
    }

    //VehicleType
    @GetMapping(path = "getVehicleTypeById")
    Grp4Ss21VehicleType getVehicleTypeById(UUID id) { return vehicleTypeService.getVehicleTypeById(id); }

    @GetMapping(path = "getVehicleTypes")
    List<String> getVehicleTypes() { return dbController.getAllVehicleTypes(); }


}
