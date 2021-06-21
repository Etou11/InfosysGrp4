package hsesslingen.group4.jumbleShare.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * $table.getTableComment()
 */
@Data
@Entity
@Table(name = "Grp_4_SS21_User")
public class Grp4Ss21User implements Serializable
{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name = "[id]",unique = true ,nullable = false)
    private String id;

    @Column(name = "[customernr]", nullable = false)
    private String customerNr;

    @Column(name = "[fname]", nullable = false)
    private String FName;

    @Column(name = "[lname]", nullable = false)
    private String LName;

    @Column(name = "[username]", nullable = false)
    private String userName;

    @Column(name = "[email]", nullable = false)
    private String email;

    @Column(name = "[password]", nullable = false)
    private String password;

    @Column(name = "[dateofbirth]", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfBirth;

    @Column(name = "[city]", nullable = false)
    private String city;

    @Column(name = "[country]", nullable = false)
    private String country;

    @Column(name = "[postcode]", nullable = false)
    private Integer postCode;

    @Column(name = "[streetandnumber]", nullable = false)
    private String streetAndNumber;

    public Grp4Ss21User() {

    }

    public Grp4Ss21User(String customerNr, String FName, String LName, String userName, String email, String password, Date dateOfBirth, String city, String country, Integer postCode, String streetAndNumber) {
        this.customerNr = customerNr;
        this.FName = FName;
        this.LName = LName;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.city = city;
        this.country = country;
        this.postCode = postCode;
        this.streetAndNumber = streetAndNumber;
    }
}
