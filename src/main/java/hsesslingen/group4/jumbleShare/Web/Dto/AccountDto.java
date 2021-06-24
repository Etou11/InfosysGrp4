package hsesslingen.group4.jumbleShare.Web.Dto;

import java.util.UUID;

public class AccountDto
{

    private UUID id;
    private String ownerFName;
    private String ownerLName;
    private String IBAN;
    private String BIC;
    private String bankName;
    private UUID userId;


    public AccountDto(String ownerFName, String ownerLName, String IBAN, String BIC, String bankName, UUID userId)
    {
        this.id = UUID.randomUUID();
        this.ownerFName = ownerFName;
        this.ownerLName = ownerLName;
        this.IBAN = IBAN;
        this.BIC = BIC;
        this.bankName = bankName;
        this.userId = userId;
    }

    public AccountDto()
    {

    }

    public UUID getId()
    {
        return id;
    }

    public void setId(UUID id)
    {
        this.id = id;
    }

    public String getOwnerFName()
    {
        return ownerFName;
    }

    public void setOwnerFName(String ownerFName)
    {
        this.ownerFName = ownerFName;
    }

    public String getOwnerLName()
    {
        return ownerLName;
    }

    public void setOwnerLName(String ownerLName)
    {
        this.ownerLName = ownerLName;
    }

    public String getIBAN()
    {
        return IBAN;
    }

    public void setIBAN(String IBAN)
    {
        this.IBAN = IBAN;
    }

    public String getBIC()
    {
        return BIC;
    }

    public void setBIC(String BIC)
    {
        this.BIC = BIC;
    }

    public String getBankName()
    {
        return bankName;
    }

    public void setBankName(String bankName)
    {
        this.bankName = bankName;
    }

    public UUID getUserId()
    {
        return userId;
    }

    public void setUserId(UUID userId)
    {
        this.userId = userId;
    }
}
