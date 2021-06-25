package hsesslingen.group4.jumbleShare.Web.Dto;

import java.math.BigDecimal;

import java.util.Date;
import java.util.UUID;

public class TransactionBookingsDto
{
    private UUID id;
    private Date startTime;
    private Date endTime;
    private String vehicleBrand;
    private String vehiclePricePerMinute;
    private String totalDuration;
    private String totalPrice;

    public TransactionBookingsDto(UUID id, Date startTime, Date endTime, String vehicleBrand, String vehiclePricePerMinute, String totalDuration, String totalPrice)
    {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.vehicleBrand = vehicleBrand;
        this.vehiclePricePerMinute = vehiclePricePerMinute;
        this.totalDuration = totalDuration;
        this.totalPrice = totalPrice;
    }

    public TransactionBookingsDto () {}

    public UUID getId()
    {
        return id;
    }

    public void setId(UUID id)
    {
        this.id = id;
    }

    public Date getStartTime()
    {
        return startTime;
    }

    public void setStartTime(Date startTime)
    {
        this.startTime = startTime;
    }

    public Date getEndTime()
    {
        return endTime;
    }

    public void setEndTime(Date endTime)
    {
        this.endTime = endTime;
    }

    public String getVehicleBrand()
    {
        return vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand)
    {
        this.vehicleBrand = vehicleBrand;
    }

    public String getVehiclePricePerMinute()
    {
        return vehiclePricePerMinute;
    }

    public void setVehiclePricePerMinute(String vehiclePricePerMinute)
    {
        this.vehiclePricePerMinute = vehiclePricePerMinute;
    }

    public String getTotalDuration()
    {
        return totalDuration;
    }

    public void setTotalDuration(String totalDuration)
    {
        this.totalDuration = totalDuration;
    }

    public String getTotalPrice()
    {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice)
    {
        this.totalPrice = totalPrice;
    }
}
