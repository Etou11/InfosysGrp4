package hsesslingen.group4.jumbleShare.Repository;

import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface Grp4Ss21UserRepository extends JpaRepository<Grp4Ss21User, String>, JpaSpecificationExecutor<Grp4Ss21User>
{

}