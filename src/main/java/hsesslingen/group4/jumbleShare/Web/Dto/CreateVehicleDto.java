package hsesslingen.group4.jumbleShare.Web.Dto;

import org.springframework.security.core.Authentication;

import java.math.BigDecimal;

public class CreateVehicleDto {
    private String brand;
    private String plateOrSerialNumber;
    private String additionalInformation;
    private BigDecimal pricePerMinute;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private String user;

    public CreateVehicleDto() {
    }

    public CreateVehicleDto(String brand, String plateOrSerialNumber, String additionalInformation, BigDecimal pricePerMinute, BigDecimal latitude, BigDecimal longitude, String user) {
        this.brand = brand;
        this.plateOrSerialNumber = plateOrSerialNumber;
        this.additionalInformation = additionalInformation;
        this.pricePerMinute = pricePerMinute;
        this.latitude = latitude;
        this.longitude = longitude;
        this.user = user;
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

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
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

    public String getUser() {
        return user;
    }
    public void setUser(Authentication authentication) {
        String currentUsername = authentication.getName();
        this.user = currentUsername;
    }
}
