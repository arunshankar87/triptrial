
package com.arunshankar.triptrial;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FootPathElem {

    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("levelFrom")
    @Expose
    private Double levelFrom;
    @SerializedName("levelTo")
    @Expose
    private Double levelTo;
    @SerializedName("level")
    @Expose
    private String level;
    @SerializedName("origin")
    @Expose
    private Origin_ origin;
    @SerializedName("destination")
    @Expose
    private Destination__ destination;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getLevelFrom() {
        return levelFrom;
    }

    public void setLevelFrom(Double levelFrom) {
        this.levelFrom = levelFrom;
    }

    public Double getLevelTo() {
        return levelTo;
    }

    public void setLevelTo(Double levelTo) {
        this.levelTo = levelTo;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Origin_ getOrigin() {
        return origin;
    }

    public void setOrigin(Origin_ origin) {
        this.origin = origin;
    }

    public Destination__ getDestination() {
        return destination;
    }

    public void setDestination(Destination__ destination) {
        this.destination = destination;
    }

}
