package hsesslingen.group4.jumbleShare.Web;

import hsesslingen.group4.jumbleShare.JumbleShareApplication;
import hsesslingen.group4.jumbleShare.Service.AccountService;
import hsesslingen.group4.jumbleShare.Web.Dto.AccountDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/account")
public class UpdateAccountController
{
    private AccountService accountService;

    public UpdateAccountController(AccountService accountService)
    {
        super();
        this.accountService = accountService;
    }

    @ModelAttribute("account")
    public AccountDto accountDto() { return new AccountDto(); }

    @GetMapping
    public String showAccountDataInForm(Model model)
    {
        var currentUserAccount = accountService.findByUserId(JumbleShareApplication._currentlyActiveUser);
        model.addAttribute("currentUserAccount", currentUserAccount);
        return "account";
    }

    @PostMapping
    public String createNewVehicle(@ModelAttribute("account") AccountDto accountDto)
    {
        accountService.save(accountDto);
        return "redirect:/account?success";
    }


}
