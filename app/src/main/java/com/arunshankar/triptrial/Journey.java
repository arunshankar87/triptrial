
package com.arunshankar.triptrial;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Journey {

    @SerializedName("rating")
    @Expose
    private Double rating;
    @SerializedName("isAdditional")
    @Expose
    private Boolean isAdditional;
    @SerializedName("legs")
    @Expose
    private List<Leg> legs = null;
    @SerializedName("fare")
    @Expose
    private Fare fare;

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Boolean getIsAdditional() {
        return isAdditional;
    }

    public void setIsAdditional(Boolean isAdditional) {
        this.isAdditional = isAdditional;
    }

    public List<Leg> getLegs() {
        return legs;
    }

    public void setLegs(List<Leg> legs) {
        this.legs = legs;
    }

    public Fare getFare() {
        return fare;
    }

    public void setFare(Fare fare) {
        this.fare = fare;
    }

}
