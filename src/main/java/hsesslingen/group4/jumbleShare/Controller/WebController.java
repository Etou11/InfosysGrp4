package hsesslingen.group4.jumbleShare.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping(value = "/index.html")
    public String index() {
        return "index";
    }

    @GetMapping(value = "/account.html")
    public String account()
    {
        return "account";
    }

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
