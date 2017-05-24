
package com.arunshankar.triptrial;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Properties__ {

    @SerializedName("tripCode")
    @Expose
    private Double tripCode;
    @SerializedName("isTTB")
    @Expose
    private Boolean isTTB;

    public Double getTripCode() {
        return tripCode;
    }

    public void setTripCode(Double tripCode) {
        this.tripCode = tripCode;
    }

    public Boolean getIsTTB() {
        return isTTB;
    }

    public void setIsTTB(Boolean isTTB) {
        this.isTTB = isTTB;
    }

}
