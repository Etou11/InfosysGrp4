package hsesslingen.group4.jumbleShare.Entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * $table.getTableComment()
 */
@Data
@Entity
@Table(name = "Grp_4_SS21_Trip")
public class Grp4Ss21Trip implements Serializable
{

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "Id", nullable = false)
    private String id;

    @Column(name = "TimestampStart", nullable = false)
    private Date timestampStart;

    @Column(name = "TimestampEnd")
    private Date timestampEnd;

    @Column(name = "LongitudeOrig", nullable = false)
    private BigDecimal longitudeOrig;

    @Column(name = "LatitudeOrig", nullable = false)
    private BigDecimal latitudeOrig;

    @Column(name = "LongitudeFin", nullable = false)
    private BigDecimal longitudeFin;

    @Column(name = "LatitudeFin", nullable = false)
    private BigDecimal latitudeFin;

    @Column(name = "VehiclePricePerMinute", nullable = false)
    private BigDecimal vehiclePricePerMinute;

    @Column(name = "UserId", nullable = false)
    private String userId;

    @Column(name = "VehicleId", nullable = false)
    private String vehicleId;

}
