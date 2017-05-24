
package com.arunshankar.triptrial;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Destination__ {

    @SerializedName("location")
    @Expose
    private Location_ location;
    @SerializedName("area")
    @Expose
    private Double area;
    @SerializedName("platform")
    @Expose
    private Double platform;
    @SerializedName("georef")
    @Expose
    private String georef;

    public Location_ getLocation() {
        return location;
    }

    public void setLocation(Location_ location) {
        this.location = location;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPlatform() {
        return platform;
    }

    public void setPlatform(Double platform) {
        this.platform = platform;
    }

    public String getGeoref() {
        return georef;
    }

    public void setGeoref(String georef) {
        this.georef = georef;
    }

}
