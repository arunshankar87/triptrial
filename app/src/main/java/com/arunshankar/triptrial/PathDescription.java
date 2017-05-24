
package com.arunshankar.triptrial;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PathDescription {

    @SerializedName("turnDirection")
    @Expose
    private String turnDirection;
    @SerializedName("manoeuvre")
    @Expose
    private String manoeuvre;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("coord")
    @Expose
    private List<Double> coord = null;
    @SerializedName("skyDirection")
    @Expose
    private Double skyDirection;
    @SerializedName("duration")
    @Expose
    private Double duration;
    @SerializedName("cumDuration")
    @Expose
    private Double cumDuration;
    @SerializedName("distance")
    @Expose
    private Double distance;
    @SerializedName("distanceUp")
    @Expose
    private Double distanceUp;
    @SerializedName("distanceDown")
    @Expose
    private Double distanceDown;
    @SerializedName("cumDistance")
    @Expose
    private Double cumDistance;
    @SerializedName("fromCoordsIndex")
    @Expose
    private Double fromCoordsIndex;
    @SerializedName("toCoordsIndex")
    @Expose
    private Double toCoordsIndex;

    public String getTurnDirection() {
        return turnDirection;
    }

    public void setTurnDirection(String turnDirection) {
        this.turnDirection = turnDirection;
    }

    public String getManoeuvre() {
        return manoeuvre;
    }

    public void setManoeuvre(String manoeuvre) {
        this.manoeuvre = manoeuvre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getCoord() {
        return coord;
    }

    public void setCoord(List<Double> coord) {
        this.coord = coord;
    }

    public Double getSkyDirection() {
        return skyDirection;
    }

    public void setSkyDirection(Double skyDirection) {
        this.skyDirection = skyDirection;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public Double getCumDuration() {
        return cumDuration;
    }

    public void setCumDuration(Double cumDuration) {
        this.cumDuration = cumDuration;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getDistanceUp() {
        return distanceUp;
    }

    public void setDistanceUp(Double distanceUp) {
        this.distanceUp = distanceUp;
    }

    public Double getDistanceDown() {
        return distanceDown;
    }

    public void setDistanceDown(Double distanceDown) {
        this.distanceDown = distanceDown;
    }

    public Double getCumDistance() {
        return cumDistance;
    }

    public void setCumDistance(Double cumDistance) {
        this.cumDistance = cumDistance;
    }

    public Double getFromCoordsIndex() {
        return fromCoordsIndex;
    }

    public void setFromCoordsIndex(Double fromCoordsIndex) {
        this.fromCoordsIndex = fromCoordsIndex;
    }

    public Double getToCoordsIndex() {
        return toCoordsIndex;
    }

    public void setToCoordsIndex(Double toCoordsIndex) {
        this.toCoordsIndex = toCoordsIndex;
    }

}
