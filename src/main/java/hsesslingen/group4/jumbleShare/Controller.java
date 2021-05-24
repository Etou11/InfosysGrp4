package hsesslingen.group4.jumbleShare;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller
{

    @Autowired
    FetchDataService fetchDataService;

    @GetMapping(path = "getData")
    List<UserModel> getUsers()
    {
        return fetchDataService.findAll();
    }
}
