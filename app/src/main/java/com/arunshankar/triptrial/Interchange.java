
package com.arunshankar.triptrial;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Interchange {

    @SerializedName("desc")
    @Expose
    private String desc;
    @SerializedName("type")
    @Expose
    private Double type;
    @SerializedName("coords")
    @Expose
    private List<List<Double>> coords = null;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Double getType() {
        return type;
    }

    public void setType(Double type) {
        this.type = type;
    }

    public List<List<Double>> getCoords() {
        return coords;
    }

    public void setCoords(List<List<Double>> coords) {
        this.coords = coords;
    }

}
