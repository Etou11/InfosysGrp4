package hsesslingen.group4.jumbleShare.Web.Dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.UUID;

public class UserRegistrationDto {

    //private UUID id;
    private String firstName;
    private String lastName;
    private String email;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    private String street;
    private Integer postcode;
    private String city;
    private String country;
    private String username;
    private String password;

    public UserRegistrationDto() {

    }

    public UserRegistrationDto(String firstName, String lastName, String email, Date date, String street, Integer postcode, String city, String country, String username, String password) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.date = date;
        this.street = street;
        this.postcode = postcode;
        this.city = city;
        this.country = country;
        this.username = username;
        this.password = password;
    }

    /*
    public UUID getId()
    {
        return id;
    }

    public void  setId(UUID id)
    {
        this.id = id;
    }

     */

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date getDate() {
        return date;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public void setDate(Date date) {
        this.date = date;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getPostcode() {
        return postcode;
    }

    public void setPostcode(Integer postcode) {
        this.postcode = postcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
