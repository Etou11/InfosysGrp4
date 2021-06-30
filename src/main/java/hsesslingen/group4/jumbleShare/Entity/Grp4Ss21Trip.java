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
    @Column(name = "[id}", nullable = false)
    private UUID id;

    @Column(name = "[timestampstart]", nullable = false)
    private Date timestampStart;

    @Column(name = "[timestampend]", nullable = true)
    private Date timestampEnd;

    @Column(name = "[longitudeorig]", nullable = false)
    private BigDecimal longitudeOrig;

    @Column(name = "[latitudeorig]", nullable = false)
    private BigDecimal latitudeOrig;

    @Column(name = "[longitudefin]", nullable = true)
    private BigDecimal longitudeFin;

    @Column(name = "[latitudefin]", nullable = true)
    private BigDecimal latitudeFin;

    @Column(name = "[vehiclepriceperminute]", nullable = false)
    private BigDecimal vehiclePricePerMinute;

    @Column(name = "[userid]", nullable = false)
    private UUID userId;

    @Column(name = "[vehicleid]", nullable = false)
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

    public Grp4Ss21Trip()
    {

    }
    

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getTimestampStart() {
        return timestampStart;
    }

    public void setTimestampStart(Date timestampStart) {
        this.timestampStart = timestampStart;
    }

    public Date getTimestampEnd() {
        return timestampEnd;
    }

    public void setTimestampEnd(Date timestampEnd) {
        this.timestampEnd = timestampEnd;
    }

    public BigDecimal getLongitudeOrig() {
        return longitudeOrig;
    }

    public void setLongitudeOrig(BigDecimal longitudeOrig) {
        this.longitudeOrig = longitudeOrig;
    }

    public BigDecimal getLatitudeOrig() {
        return latitudeOrig;
    }

    public void setLatitudeOrig(BigDecimal latitudeOrig) {
        this.latitudeOrig = latitudeOrig;
    }

    public BigDecimal getLongitudeFin() {
        return longitudeFin;
    }

    public void setLongitudeFin(BigDecimal longitudeFin) {
        this.longitudeFin = longitudeFin;
    }

    public BigDecimal getLatitudeFin() {
        return latitudeFin;
    }

    public void setLatitudeFin(BigDecimal latitudeFin) {
        this.latitudeFin = latitudeFin;
    }

    public BigDecimal getVehiclePricePerMinute() {
        return vehiclePricePerMinute;
    }

    public void setVehiclePricePerMinute(BigDecimal vehiclePricePerMinute) {
        this.vehiclePricePerMinute = vehiclePricePerMinute;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public UUID getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(UUID vehicleId) {
        this.vehicleId = vehicleId;
    }

}
