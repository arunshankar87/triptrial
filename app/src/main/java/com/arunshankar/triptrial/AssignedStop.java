
package com.arunshankar.triptrial;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AssignedStop {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("modes")
    @Expose
    private List<Double> modes = null;
    @SerializedName("connectingMode")
    @Expose
    private Double connectingMode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Double> getModes() {
        return modes;
    }

    public void setModes(List<Double> modes) {
        this.modes = modes;
    }

    public Double getConnectingMode() {
        return connectingMode;
    }

    public void setConnectingMode(Double connectingMode) {
        this.connectingMode = connectingMode;
    }

}
