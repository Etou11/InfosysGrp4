package hsesslingen.group4.jumbleShare.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }

    @GetMapping(value = "/account")
    public String account()
    {
        return "account";
    }

    @GetMapping(value = "/contact")
    public String contact()
    {
        return "contact";
    }

    @GetMapping(value = "/login")
    public String login()
    {
        return "login";
    }

    @GetMapping(value = "/new")
    public String newPage() { return "new"; }

    @GetMapping(value = "/test")
    public String test()
    {
        return "test";
    }
}
