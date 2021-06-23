package hsesslingen.group4.jumbleShare.Repository;

import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

public interface Grp4Ss21VehicleRepository extends JpaRepository<Grp4Ss21Vehicle, UUID>, JpaSpecificationExecutor<Grp4Ss21Vehicle>
{
    List<Grp4Ss21Vehicle> findAll();

    @Override
    void deleteById(UUID uuid);

    @Override
    void delete(Grp4Ss21Vehicle entity);
}