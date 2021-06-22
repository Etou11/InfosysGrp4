package hsesslingen.group4.jumbleShare.Service;

import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21User;
import hsesslingen.group4.jumbleShare.Web.Dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService {
    Grp4Ss21User save(UserRegistrationDto registrationDto);
    List<Grp4Ss21User> findAll();
}
