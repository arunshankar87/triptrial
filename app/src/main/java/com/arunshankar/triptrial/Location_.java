
package com.arunshankar.triptrial;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Location_ {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("coord")
    @Expose
    private List<Double> coord = null;

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

    public List<Double> getCoord() {
        return coord;
    }

    public void setCoord(List<Double> coord) {
        this.coord = coord;
    }

}
