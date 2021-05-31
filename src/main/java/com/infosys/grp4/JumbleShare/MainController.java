package com.infosys.grp4.JumbleShare;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController
{
    @GetMapping("/")
    public String index(Model model)
    {
        model.addAttribute("eventName", "Fifa 2018");
        return "index";
    }

    @GetMapping("/index")
    public String index2(Model model)
    {
        return "index2";
    }
}
