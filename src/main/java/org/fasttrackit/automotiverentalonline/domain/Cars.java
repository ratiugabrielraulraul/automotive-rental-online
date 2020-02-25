package org.fasttrackit.automotiverentalonline.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Cars {

    @Id
    @GeneratedValue
    private long carId;

    @Id
    @GeneratedValue
    private long carDriverId;
    @Id
    @GeneratedValue
    private long carCustomerId;
    @NotNull
    private String carNumber;
    @NotNull
    private String carType;
    @NotNull
    private String carCompanyName;

    private String carDescription;

    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }

    public long getCarDriverId() {
        return carDriverId;
    }

    public void setCarDriverId(long carDriverId) {
        this.carDriverId = carDriverId;
    }

    public long getCarCustomerId() {
        return carCustomerId;
    }

    public void setCarCustomerId(long carCustomerId) {
        this.carCustomerId = carCustomerId;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarCompanyName() {
        return carCompanyName;
    }

    public void setCarCompanyName(String carCompanyName) {
        this.carCompanyName = carCompanyName;
    }

    public String getCarDescription() {
        return carDescription;
    }

    public void setCarDescription(String carDescription) {
        this.carDescription = carDescription;
    }

}
