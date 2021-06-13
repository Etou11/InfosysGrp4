package hsesslingen.group4.jumbleShare.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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
    @Column(name = "[id]", nullable = false)
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
    private Date dateOfBirth;

    @Column(name = "[city]", nullable = false)
    private String city;

    @Column(name = "[country]", nullable = false)
    private String country;

    @Column(name = "[postcode]", nullable = false)
    private Integer postCode;

    @Column(name = "[streetandnumber]", nullable = false)
    private String streetAndNumber;

}
