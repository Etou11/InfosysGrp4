package hsesslingen.group4.jumbleShare.Web.Dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

public class TripDto
{
    private UUID id;
    private Date timestampStart;
    private Date timestampEnd;
    private BigDecimal longitudeOrig;
    private BigDecimal latitudeOrig;
    private BigDecimal longitudeFin;
    private BigDecimal latitudeFin;
    private BigDecimal vehiclePricePerMinute;
    private UUID userId;
    private UUID vehicleId;


    public TripDto()
    {

    }

    public TripDto(UUID id, Date timestampStart, Date timestampEnd, BigDecimal longitudeOrig, BigDecimal latitudeOrig, BigDecimal longitudeFin, BigDecimal latitudeFin, BigDecimal vehiclePricePerMinute, UUID userId, UUID vehicleId)
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

    public UUID getId()
    {
        return id;
    }

    public void setId(UUID id)
    {
        this.id = id;
    }

    public Date getTimestampStart()
    {
        return timestampStart;
    }

    public void setTimestampStart(Date timestampStart)
    {
        this.timestampStart = timestampStart;
    }

    public Date getTimestampEnd()
    {
        return timestampEnd;
    }

    public void setTimestampEnd(Date timestampEnd)
    {
        this.timestampEnd = timestampEnd;
    }

    public BigDecimal getLongitudeOrig()
    {
        return longitudeOrig;
    }

    public void setLongitudeOrig(BigDecimal longitudeOrig)
    {
        this.longitudeOrig = longitudeOrig;
    }

    public BigDecimal getLatitudeOrig()
    {
        return latitudeOrig;
    }

    public void setLatitudeOrig(BigDecimal latitudeOrig)
    {
        this.latitudeOrig = latitudeOrig;
    }

    public BigDecimal getLongitudeFin()
    {
        return longitudeFin;
    }

    public void setLongitudeFin(BigDecimal longitudeFin)
    {
        this.longitudeFin = longitudeFin;
    }

    public BigDecimal getLatitudeFin()
    {
        return latitudeFin;
    }

    public void setLatitudeFin(BigDecimal latitudeFin)
    {
        this.latitudeFin = latitudeFin;
    }

    public BigDecimal getVehiclePricePerMinute()
    {
        return vehiclePricePerMinute;
    }

    public void setVehiclePricePerMinute(BigDecimal vehiclePricePerMinute)
    {
        this.vehiclePricePerMinute = vehiclePricePerMinute;
    }

    public UUID getUserId()
    {
        return userId;
    }

    public void setUserId(UUID userId)
    {
        this.userId = userId;
    }

    public UUID getVehicleId()
    {
        return vehicleId;
    }

    public void setVehicleId(UUID vehicleId)
    {
        this.vehicleId = vehicleId;
    }
}
