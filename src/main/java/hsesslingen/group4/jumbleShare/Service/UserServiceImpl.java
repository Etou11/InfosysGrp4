package hsesslingen.group4.jumbleShare.Service;

import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21User;
import hsesslingen.group4.jumbleShare.Repository.Grp4Ss21UserRepository;
import hsesslingen.group4.jumbleShare.Web.Dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private Grp4Ss21UserRepository userRepository;

    public UserServiceImpl(Grp4Ss21UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public Grp4Ss21User save(UserRegistrationDto registrationDto) {
        Grp4Ss21User user = new Grp4Ss21User(
                registrationDto.getFirstName(),
                registrationDto.getLastName(),
                registrationDto.getUsername(),
                registrationDto.getEmail(),
                registrationDto.getPassword(),
                registrationDto.getDate(),
                registrationDto.getCity(),
                registrationDto.getCountry(),
                registrationDto.getPostcode(),
                registrationDto.getStreet()
        );
        return userRepository.save(user);
    }

    @Override
    public List<Grp4Ss21User> findAll()
    {
        return userRepository.findAll();
    }


}
