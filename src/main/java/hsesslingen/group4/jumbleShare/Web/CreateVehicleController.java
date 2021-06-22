package hsesslingen.group4.jumbleShare.Web;

import hsesslingen.group4.jumbleShare.Controller.DbController;
import hsesslingen.group4.jumbleShare.Service.VehicleService;
import hsesslingen.group4.jumbleShare.Web.Dto.CreateVehicleDto;
import hsesslingen.group4.jumbleShare.Web.Dto.VehicleTypeDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.UUID;

@Controller
@RequestMapping("/new")
public class CreateVehicleController {

    private VehicleService vehicleService;

    public CreateVehicleController(VehicleService vehicleService) {
        super();
        this.vehicleService = vehicleService;
    }

    @ModelAttribute("vehicle")
    public CreateVehicleDto createVehicleDto() {
        return new CreateVehicleDto();
    }

    @GetMapping
    public String showCreationForm(Model model)
    {
        DbController dbController = new DbController();
        var vehicleTypeList = dbController.getAllVehicleTypes();

        ArrayList<VehicleTypeDto> vehicleTypes = new ArrayList<VehicleTypeDto>();


        for (int i = 0; i < vehicleTypeList.size(); i+=2)
        {
            VehicleTypeDto vehicleType = new VehicleTypeDto (
                    vehicleTypeList.get(i),
                    vehicleTypeList.get(i+1)
            );
            vehicleTypes.add(vehicleType);
        }

        model.addAttribute("vehicleTypes", vehicleTypes);
        return "new";
    }

    @PostMapping
    public String createNewVehicle(@ModelAttribute("vehicle") CreateVehicleDto createVehicleDto) {
        vehicleService.save(createVehicleDto);
        return "redirect:/new?success";
    }

}
