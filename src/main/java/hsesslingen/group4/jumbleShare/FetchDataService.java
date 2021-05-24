package hsesslingen.group4.jumbleShare;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FetchDataService extends JpaRepository<UserModel, Integer>
{
    @Override
    List<UserModel> findAll();
}
