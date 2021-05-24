package hsesslingen.group4.jumbleShare;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "[2021Group4_User]")
public class UserModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "[Id]")
    UUID Id;

    @Column(name = "[Name]")
    String Name;

    @Column(name = "[Email]")
    String Email;

    @Column(name = "[Password]")
    String Password;

    @Column(name = "[Dateofbirth]")
    Timestamp DateOfBirth;

    @Column(name = "[City]")
    String City;

    @Column(name = "[Country]")
    String Country;

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Timestamp getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Timestamp dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public int getPostCode() {
        return PostCode;
    }

    public void setPostCode(int postCode) {
        PostCode = postCode;
    }

    public String getStreetAndNumber() {
        return StreetAndNumber;
    }

    public void setStreetAndNumber(String streetAndNumber) {
        StreetAndNumber = streetAndNumber;
    }

    @Column(name = "[Postcode]")
    int PostCode;

    @Column(name = "[Streetandnumber]")
    String StreetAndNumber;

}
