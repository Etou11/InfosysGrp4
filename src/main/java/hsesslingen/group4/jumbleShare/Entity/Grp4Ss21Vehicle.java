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
    private String userId;

    @Column(name = "[vehicletypeid]", nullable = false)
    private String vehicleTypeId;

    public Grp4Ss21Vehicle() {

    }

    public Grp4Ss21Vehicle(String brand, String plateOrSerialNumber, String additionalInformation, BigDecimal pricePerMinute, BigDecimal longitude, BigDecimal latitude) {
        this.brand = brand;
        this.plateOrSerialNumber = plateOrSerialNumber;
        this.additionalInformation = additionalInformation;
        this.pricePerMinute = pricePerMinute;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getVehicleTypeId() {
        return vehicleTypeId;
    }

    public void setVehicleTypeId(String vehicleTypeId) {
        this.vehicleTypeId = vehicleTypeId;
    }
}
