package org.fasttrackit.automotiverentalonline.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Drivers {
    @Id
    @GeneratedValue
    private long driverID;

    private String driverName;
    private String driverEmail;
    private String driverUserName;
    private String driverPassword;
    private String driverAdress;
    private String driverLicense;

    public long getDriverID() {
        return driverID;
    }

    public void setDriverID(long driverID) {
        this.driverID = driverID;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverEmail() {
        return driverEmail;
    }

    public void setDriverEmail(String driverEmail) {
        this.driverEmail = driverEmail;
    }

    public String getDriverUserName() {
        return driverUserName;
    }

    public void setDriverUserName(String driverUserName) {
        this.driverUserName = driverUserName;
    }

    public String getDriverPassword() {
        return driverPassword;
    }

    public void setDriverPassword(String driverPassword) {
        this.driverPassword = driverPassword;
    }

    public String getDriverAdress() {
        return driverAdress;
    }

    public void setDriverAdress(String driverAdress) {
        this.driverAdress = driverAdress;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    @Override
    public String toString() {
        return "Drivers{" +
                "driverID=" + driverID +
                ", driverName='" + driverName + '\'' +
                ", driverEmail='" + driverEmail + '\'' +
                ", driverUserName='" + driverUserName + '\'' +
                ", driverPassword='" + driverPassword + '\'' +
                ", driverAdress='" + driverAdress + '\'' +
                ", driverLicense='" + driverLicense + '\'' +
                '}';
    }
}
