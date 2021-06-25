package hsesslingen.group4.jumbleShare.Web.Dto;

import hsesslingen.group4.jumbleShare.JumbleShareApplication;
import org.springframework.security.core.Authentication;
import java.math.BigDecimal;
import java.util.UUID;

public class CreateVehicleDto {

    //TOD O: Replace with actual login system
    //private  String currentlyActiveUser = "D568817B-A8D2-43AA-A4BD-DC92378CB6DE";
    //private  UUID _currentlyActiveUser = UUID.fromString(currentlyActiveUser);

    private UUID id;
    private String brand;
    private String plateOrSerialNumber;
    private BigDecimal pricePerMinute;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private UUID userId;
    private UUID vehicleTypeId;

    public CreateVehicleDto() {
    }

    public CreateVehicleDto(UUID id, String brand, String plateOrSerialNumber, BigDecimal pricePerMinute, BigDecimal latitude, BigDecimal longitude, UUID vehicleTypeId, String user) {
        super();
        this.id = id;
        this.brand = brand;
        this.plateOrSerialNumber = plateOrSerialNumber;
        this.pricePerMinute = pricePerMinute;
        this.latitude = latitude;
        this.longitude = longitude;
        this.vehicleTypeId = vehicleTypeId;
        this.userId = JumbleShareApplication._currentlyActiveUser;
    }

    public UUID getUserId()
    {
        return userId;
    }

    public void setUserId(UUID userId)
    {
        this.userId = userId;
    }

    public UUID getVehicleTypeId()
    {
        return vehicleTypeId;
    }

    public UUID getId()
    {
        return id;
    }

    public void setId(UUID id)
    {
        this.id = id;
    }

    public void setVehicleTypeId(UUID vehicleTypeId)
    {
        this.vehicleTypeId = vehicleTypeId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPlateOrSerialNumber() {
        return plateOrSerialNumber;
    }

    public void setPlateOrSerialNumber(String plateOrSerialNumber) {
        this.plateOrSerialNumber = plateOrSerialNumber;
    }

    public BigDecimal getPricePerMinute() {
        return pricePerMinute;
    }

    public void setPricePerMinute(BigDecimal pricePerMinute) {
        this.pricePerMinute = pricePerMinute;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

}
