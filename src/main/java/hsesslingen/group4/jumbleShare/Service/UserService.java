package hsesslingen.group4.jumbleShare.Service;

import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21User;
import hsesslingen.group4.jumbleShare.Web.Dto.UserRegistrationDto;

public interface UserService {
    Grp4Ss21User save(UserRegistrationDto registrationDto);
}