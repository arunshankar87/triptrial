
package com.arunshankar.triptrial;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class StopSequence {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("disassembledName")
    @Expose
    private String disassembledName;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("coord")
    @Expose
    private List<Double> coord = null;
    @SerializedName("parent")
    @Expose
    private Parent____ parent;
    @SerializedName("departureTimeEstimated")
    @Expose
    private String departureTimeEstimated;
    @SerializedName("departureTimePlanned")
    @Expose
    private String departureTimePlanned;
    @SerializedName("arrivalTimeEstimated")
    @Expose
    private String arrivalTimeEstimated;
    @SerializedName("arrivalTimePlanned")
    @Expose
    private String arrivalTimePlanned;
    @SerializedName("properties")
    @Expose
    private Properties___ properties;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisassembledName() {
        return disassembledName;
    }

    public void setDisassembledName(String disassembledName) {
        this.disassembledName = disassembledName;
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

    public Parent____ getParent() {
        return parent;
    }

    public void setParent(Parent____ parent) {
        this.parent = parent;
    }

    public String getDepartureTimeEstimated() {
        return departureTimeEstimated;
    }

    public void setDepartureTimeEstimated(String departureTimeEstimated) {
        this.departureTimeEstimated = departureTimeEstimated;
    }

    public String getDepartureTimePlanned() {
        return departureTimePlanned;
    }

    public void setDepartureTimePlanned(String departureTimePlanned) {
        this.departureTimePlanned = departureTimePlanned;
    }

    public String getArrivalTimeEstimated() {
        return arrivalTimeEstimated;
    }

    public void setArrivalTimeEstimated(String arrivalTimeEstimated) {
        this.arrivalTimeEstimated = arrivalTimeEstimated;
    }

    public String getArrivalTimePlanned() {
        return arrivalTimePlanned;
    }

    public void setArrivalTimePlanned(String arrivalTimePlanned) {
        this.arrivalTimePlanned = arrivalTimePlanned;
    }

    public Properties___ getProperties() {
        return properties;
    }

    public void setProperties(Properties___ properties) {
        this.properties = properties;
    }

}
