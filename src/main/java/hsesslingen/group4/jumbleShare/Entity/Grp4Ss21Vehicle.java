package hsesslingen.group4.jumbleShare.Entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * $table.getTableComment()
 */
@Data
@Entity
@Table(name = "Grp_4_SS21_Vehicle")
public class Grp4Ss21Vehicle implements Serializable
{

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "[id]", nullable = false)
    private String id;

    @Column(name = "[isactive]", nullable = false)
    private Boolean isActive;

    @Column(name = "[brand]", nullable = false)
    private String brand;

    @Column(name = "[plateorserialnumber]", nullable = false)
    private String plateOrSerialNumber;

    @Column(name = "[additionalinformation]")
    private String additionalInformation;

    @Column(name = "[priceperminute]", nullable = false)
    private BigDecimal pricePerMinute;

    @Column(name = "[longitude]", nullable = false)
    private BigDecimal longitude;

    @Column(name = "[latitude]", nullable = false)
    private BigDecimal latitude;

    @Column(name = "[userid]", nullable = false)
    private String userId;

    @Column(name = "[vehicletypeid]", nullable = false)
    private String verhicleTypeId;

}
