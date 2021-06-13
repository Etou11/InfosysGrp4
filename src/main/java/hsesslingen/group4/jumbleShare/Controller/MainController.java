package hsesslingen.group4.jumbleShare.Controller;

import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21User;
import hsesslingen.group4.jumbleShare.Repository.Grp4Ss21UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController
{

    @Autowired
    Grp4Ss21UserRepository userRepository;

    @GetMapping(path = "getData")
    List<Grp4Ss21User> getUsers()
    {
        return userRepository.findAll();
    }

}
