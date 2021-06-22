package hsesslingen.group4.jumbleShare.Entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

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
    @Column(name = "[id]", unique = true, nullable = false)
    private UUID id;

    @Column(name = "[brand]", nullable = false)
    private String brand;

    @Column(name = "[plateorserialnumber]", nullable = false)
    private String plateOrSerialNumber;

    @Column(name = "[priceperminute]", nullable = false)
    private BigDecimal pricePerMinute;

    @Column(name = "[longitude]", nullable = false)
    private BigDecimal longitude;

    @Column(name = "[latitude]", nullable = false)
    private BigDecimal latitude;

    @Column(name = "[userid]", nullable = false)
    private UUID userId;

    @Column(name = "[vehicletypeid]", nullable = false)
    private UUID vehicleTypeId;

    public Grp4Ss21Vehicle()
    {

    }

    public Grp4Ss21Vehicle(UUID id, String brand, String plateOrSerialNumber, BigDecimal pricePerMinute, BigDecimal longitude, BigDecimal latitude, UUID vehicleTypeId, UUID userId) {
        this.id = id;
        this.brand = brand;
        this.plateOrSerialNumber = plateOrSerialNumber;
        this.pricePerMinute = pricePerMinute;
        this.longitude = longitude;
        this.latitude = latitude;
        this.vehicleTypeId = vehicleTypeId;
        this.userId = userId;
    }

}
