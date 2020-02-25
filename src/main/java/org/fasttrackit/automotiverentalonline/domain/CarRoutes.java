package org.fasttrackit.automotiverentalonline.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CarRoutes {
    @Id
    private long carRouteId;

    private String carRouteName;
    private String carRouteType;
    private String carRouteDescription;

    public long getCarRouteId() {
        return carRouteId;
    }

    public void setCarRouteId(long carRouteId) {
        this.carRouteId = carRouteId;
    }

    public String getCarRouteName() {
        return carRouteName;
    }

    public void setCarRouteName(String carRouteName) {
        this.carRouteName = carRouteName;
    }

    public String getCarRouteType() {
        return carRouteType;
    }

    public void setCarRouteType(String carRouteType) {
        this.carRouteType = carRouteType;
    }

    public String getCarRouteDescription() {
        return carRouteDescription;
    }

    public void setCarRouteDescription(String carRouteDescription) {
        this.carRouteDescription = carRouteDescription;
    }
}
