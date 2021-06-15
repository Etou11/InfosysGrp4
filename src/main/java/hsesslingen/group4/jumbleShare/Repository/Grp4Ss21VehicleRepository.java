package hsesslingen.group4.jumbleShare.Repository;

import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import javax.transaction.Transactional;

public interface Grp4Ss21VehicleRepository extends JpaRepository<Grp4Ss21Vehicle, String>, JpaSpecificationExecutor<Grp4Ss21Vehicle>
{

}