package com.infosys.grp4.JumbleShare;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping("/test")
    public String test(Model model)
    {
        return "test";
    }

    @Autowired
    FetchDataService fetchDataService;

    @GetMapping(path = "getData")
    List<UserModel> getUsers()
    {
        return fetchDataService.findAll();
    }


}
