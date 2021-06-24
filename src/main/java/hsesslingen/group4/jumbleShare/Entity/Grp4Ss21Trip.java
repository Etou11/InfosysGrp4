package hsesslingen.group4.jumbleShare.Entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

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
    private UUID id;

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
    private UUID userId;

    @Column(name = "VehicleId", nullable = false)
    private UUID vehicleId;

    public Grp4Ss21Trip(UUID id, Date timestampStart, Date timestampEnd, BigDecimal longitudeOrig, BigDecimal latitudeOrig, BigDecimal longitudeFin, BigDecimal latitudeFin, BigDecimal vehiclePricePerMinute, UUID userId, UUID vehicleId)
    {
        this.id = id;
        this.timestampStart = timestampStart;
        this.timestampEnd = timestampEnd;
        this.longitudeOrig = longitudeOrig;
        this.latitudeOrig = latitudeOrig;
        this.longitudeFin = longitudeFin;
        this.latitudeFin = latitudeFin;
        this.vehiclePricePerMinute = vehiclePricePerMinute;
        this.userId = userId;
        this.vehicleId = vehicleId;
    }
}
