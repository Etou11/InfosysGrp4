package hsesslingen.group4.jumbleShare.Entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * $table.getTableComment()
 */
@Data
@Entity
@Table(name = "Grp_4_SS21_Account")
public class Grp4Ss21Account implements Serializable
{

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "[id]", nullable = false)
    private String id;

    @Column(name = "[ownerfname]", nullable = false)
    private String ownerFName;

    @Column(name = "[ownerlname]", nullable = false)
    private String ownerLName;

    @Column(name = "[iban]", nullable = false)
    private String IBAN;

    @Column(name = "[bic]", nullable = false)
    private String BIC;

    @Column(name = "[bankname]", nullable = false)
    private String bankName;

    @Column(name = "[userid]", nullable = false)
    private String userId;

}
