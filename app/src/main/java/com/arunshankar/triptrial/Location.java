
package com.arunshankar.triptrial;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Location {

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
    @SerializedName("matchQuality")
    @Expose
    private Double matchQuality;
    @SerializedName("isBest")
    @Expose
    private Boolean isBest;
    @SerializedName("modes")
    @Expose
    private List<Double> modes = null;
    @SerializedName("parent")
    @Expose
    private Parent parent;
    @SerializedName("assignedStops")
    @Expose
    private List<AssignedStop> assignedStops = null;

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

    public Double getMatchQuality() {
        return matchQuality;
    }

    public void setMatchQuality(Double matchQuality) {
        this.matchQuality = matchQuality;
    }

    public Boolean getIsBest() {
        return isBest;
    }

    public void setIsBest(Boolean isBest) {
        this.isBest = isBest;
    }

    public List<Double> getModes() {
        return modes;
    }

    public void setModes(List<Double> modes) {
        this.modes = modes;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public List<AssignedStop> getAssignedStops() {
        return assignedStops;
    }

    public void setAssignedStops(List<AssignedStop> assignedStops) {
        this.assignedStops = assignedStops;
    }

}
