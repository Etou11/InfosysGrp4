package hsesslingen.group4.jumbleShare.Web.Dto;

import java.math.BigDecimal;

public class CreateVehicleDto {
    private Boolean isActive;
    private String brand;
    private String plateOrSerialNumber;
    private String additionalInformation;
    private BigDecimal pricePerMinute;
    private BigDecimal latitude;
    private BigDecimal longitude;

    public CreateVehicleDto() {
    }

    public CreateVehicleDto(Boolean isActive, String brand, String plateOrSerialNumber, String additionalInformation, BigDecimal pricePerMinute, BigDecimal latitude, BigDecimal longitude) {
        this.isActive = isActive;
        this.brand = brand;
        this.plateOrSerialNumber = plateOrSerialNumber;
        this.additionalInformation = additionalInformation;
        this.pricePerMinute = pricePerMinute;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
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
}
