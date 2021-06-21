package hsesslingen.group4.jumbleShare.Web;

import hsesslingen.group4.jumbleShare.Service.VehicleService;
import hsesslingen.group4.jumbleShare.Web.Dto.CreateVehicleDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String showCreationForm() { return "new"; }

    @PostMapping
    public String createNewVehicle(@ModelAttribute("vehicle") CreateVehicleDto createVehicleDto) {
        vehicleService.save(createVehicleDto);
        return "redirect:/new?success";
    }

}
