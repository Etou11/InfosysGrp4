package hsesslingen.group4.jumbleShare.Service;

import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21Account;
import hsesslingen.group4.jumbleShare.Web.Dto.AccountDto;

import java.util.Optional;
import java.util.UUID;

public interface AccountService
{
    Optional<Grp4Ss21Account> findByUserId(UUID id);
    Grp4Ss21Account save(AccountDto account);
}
