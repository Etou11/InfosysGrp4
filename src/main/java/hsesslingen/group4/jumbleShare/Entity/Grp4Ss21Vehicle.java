package hsesslingen.group4.jumbleShare.Entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "system-uuid")
    @GenericGenerator(name="system-uuid", strategy="uuid")
    @Column(name = "[id]", unique = true, nullable = false)
    private String id;

    @Column(name = "[isactive]", nullable = false, columnDefinition = "BOOLEAN DEFAULT FALSE")
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
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "system-uuid")
    @GenericGenerator(name="system-uuid", strategy="uuid")
    private String userId;

    @Column(name = "[vehicletypeid]", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "system-uuid")
    @GenericGenerator(name="system-uuid", strategy="uuid")
    private String vehicleTypeId;

    public Grp4Ss21Vehicle() {

    }

    public Grp4Ss21Vehicle(Boolean isActive, String brand, String plateOrSerialNumber, String additionalInformation, BigDecimal pricePerMinute, BigDecimal longitude, BigDecimal latitude) {
        this.isActive = isActive;
        this.brand = brand;
        this.plateOrSerialNumber = plateOrSerialNumber;
        this.additionalInformation = additionalInformation;
        this.pricePerMinute = pricePerMinute;
        this.longitude = longitude;
        this.latitude = latitude;
    }
}
