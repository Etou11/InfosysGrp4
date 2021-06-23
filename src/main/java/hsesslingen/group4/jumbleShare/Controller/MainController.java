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

    @GetMapping(path = "getUserData")
    List<Grp4Ss21User> getUsers()
    {
        return userService.findAll();
    }

    @Autowired
    VehicleServiceImpl vehicleService;

    @GetMapping(path = "getVehicleData")
    List<Grp4Ss21Vehicle> getVehicle() { return vehicleService.findAll(); }

    @GetMapping(path = "getVehicleDataForUser")
    List<Grp4Ss21Vehicle> getVehicleById(String userId)
    {
        userId = userId.toLowerCase(Locale.ROOT);
        userId = userId.replaceAll("-", "");
        userId = userId.substring(userId.length() - 8);

        var vehicles = vehicleService.findAll();
        ArrayList<Grp4Ss21Vehicle> vehiclesFiltered = new ArrayList<Grp4Ss21Vehicle>();

        for (Grp4Ss21Vehicle ele : vehicles)
        {
            var parsedGuid = HelperExtension.hexToStr(ele.getUserId().toString());
            parsedGuid = parsedGuid.replaceAll("-","");
            parsedGuid = parsedGuid.substring(parsedGuid.length() - 8);

            if(userId.contentEquals(parsedGuid))
                vehiclesFiltered.add(ele);
        }

        return vehiclesFiltered;
    }


    @Autowired
    VehicleTypeServiceImpl vehicleTypeService;

    @GetMapping(path = "getVehicleTypeById")
    Grp4Ss21VehicleType getVehicleTypeById(UUID id) { return vehicleTypeService.getVehicleTypeById(id); }

    @GetMapping(path = "getVehicleTypes")
    List<String> getVehicleTypes() { return dbController.getAllVehicleTypes(); }

    @GetMapping(path ="deleteVehicle")
    boolean deleteVehicleById(String id)
    {
        //TODO: Continue here
        System.out.println("Hello world!");
        var test = "test";
        return true;
    }



    //@PostMapping(path = "createNewVehicle")
    //public @ResponseBody String addNewVehicle (@RequestParam boolean isActive, @RequestParam String brand, @RequestParam String plateOrSerialNumber, @RequestParam String additionalInformation, @RequestParam double pricePerMinute)


}
