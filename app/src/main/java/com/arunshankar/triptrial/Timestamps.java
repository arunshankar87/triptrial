
package com.arunshankar.triptrial;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Timestamps {

    @SerializedName("creation")
    @Expose
    private String creation;
    @SerializedName("lastModification")
    @Expose
    private String lastModification;
    @SerializedName("availability")
    @Expose
    private Availability availability;
    @SerializedName("validity")
    @Expose
    private List<Validity> validity = null;

    public String getCreation() {
        return creation;
    }

    public void setCreation(String creation) {
        this.creation = creation;
    }

    public String getLastModification() {
        return lastModification;
    }

    public void setLastModification(String lastModification) {
        this.lastModification = lastModification;
    }

    public Availability getAvailability() {
        return availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    public List<Validity> getValidity() {
        return validity;
    }

    public void setValidity(List<Validity> validity) {
        this.validity = validity;
    }

}
