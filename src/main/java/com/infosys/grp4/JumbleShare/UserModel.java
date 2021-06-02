package com.infosys.grp4.JumbleShare;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "[2021Group4_User]")
public class UserModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "[Id]")
    UUID id;

    @Column(name = "[CustomerNr]")
    String customerNr;

    @Column(name = "[FName]")
    String fName;

    @Column(name = "[LName]")
    String lName;

    @Column(name = "[UserName]")
    String userName;

    @Column(name = "[Email]")
    String email;

    @Column(name = "[Password]")
    String password;

    @Column(name = "[DateOfBirth]")
    Timestamp dateOfBirth;

    @Column(name = "[City]")
    String city;

    @Column(name = "[Country]")
    String country;

    @Column(name = "[Postcode]")
    int PostCode;

    @Column(name = "[PostCode]")
    String streetAndNumber;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCustomerNr() {
        return customerNr;
    }

    public void setCustomerNr(String customerNr) {
        this.customerNr = customerNr;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Timestamp dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

    public int getPostCode() {
        return PostCode;
    }

    public void setPostCode(int postCode) {
        PostCode = postCode;
    }

    public String getStreetAndNumber() {
        return streetAndNumber;
    }

    public void setStreetAndNumber(String streetAndNumber) {
        this.streetAndNumber = streetAndNumber;
    }
}
