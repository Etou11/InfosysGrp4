package hsesslingen.group4.jumbleShare.Controller;

import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21Vehicle;
import hsesslingen.group4.jumbleShare.JumbleShareApplication;
import hsesslingen.group4.jumbleShare.Repository.Grp4Ss21VehicleRepository;
import hsesslingen.group4.jumbleShare.Service.AccountServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class WebController {

    @RequestMapping(value = "/index.html")
    public String index() {
        return "index";
    }

    @GetMapping(value = "/account.html")
    public String account() { return "account"; }

    @GetMapping(value = "/contact.html")
    public String contact()
    {
        return "contact";
    }

    @GetMapping(value = "/login.html")
    public String login()
    {
        return "login";
    }

    @GetMapping(value = "/new.html")
    public String newPage() { return "new"; }

    @GetMapping(value = "/test.html")
    public String test()
    {
        return "test";
    }
}
