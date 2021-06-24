package hsesslingen.group4.jumbleShare.Service;

import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21Account;
import hsesslingen.group4.jumbleShare.Helper.HelperExtension;
import hsesslingen.group4.jumbleShare.Repository.Grp4Ss21AccountRepository;
import hsesslingen.group4.jumbleShare.Web.Dto.AccountDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AccountServiceImp implements AccountService
{
    private Grp4Ss21AccountRepository accountRepository;

    public AccountServiceImp(Grp4Ss21AccountRepository accountRepository) {
        super();
        this.accountRepository = accountRepository;
    }

    @Override
    public Grp4Ss21Account findByUserId(UUID id)
    {
        var accounts = accountRepository.findAll();
        var account = accounts.stream().filter(x -> HelperExtension.UuidEqualityCheck(id.toString(), x.getUserId().toString())).findFirst().orElse(new Grp4Ss21Account());

        return account;
    }

    @Override
    public Grp4Ss21Account save(AccountDto accountDto)
    {
        Grp4Ss21Account account = new Grp4Ss21Account(
                UUID.randomUUID(),
                accountDto.getOwnerFName(),
                accountDto.getOwnerLName(),
                accountDto.getIBAN(),
                accountDto.getBIC(),
                accountDto.getBankName(),
                accountDto.getUserId()
        );
        return accountRepository.save(account);
    }
}
