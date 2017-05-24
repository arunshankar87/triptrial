
package com.arunshankar.triptrial;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Zone {

    @SerializedName("net")
    @Expose
    private String net;
    @SerializedName("toLeg")
    @Expose
    private Double toLeg;
    @SerializedName("fromLeg")
    @Expose
    private Double fromLeg;
    @SerializedName("neutralZone")
    @Expose
    private String neutralZone;

    public String getNet() {
        return net;
    }

    public void setNet(String net) {
        this.net = net;
    }

    public Double getToLeg() {
        return toLeg;
    }

    public void setToLeg(Double toLeg) {
        this.toLeg = toLeg;
    }

    public Double getFromLeg() {
        return fromLeg;
    }

    public void setFromLeg(Double fromLeg) {
        this.fromLeg = fromLeg;
    }

    public String getNeutralZone() {
        return neutralZone;
    }

    public void setNeutralZone(String neutralZone) {
        this.neutralZone = neutralZone;
    }

}
