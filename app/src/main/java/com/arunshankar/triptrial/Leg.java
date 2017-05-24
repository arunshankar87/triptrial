
package com.arunshankar.triptrial;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Leg {

    @SerializedName("duration")
    @Expose
    private Double duration;
    @SerializedName("isRealtimeControlled")
    @Expose
    private Boolean isRealtimeControlled;
    @SerializedName("origin")
    @Expose
    private Origin origin;
    @SerializedName("destination")
    @Expose
    private Destination destination;
    @SerializedName("transportation")
    @Expose
    private Transportation transportation;
    @SerializedName("hints")
    @Expose
    private List<Hint> hints = null;
    @SerializedName("stopSequence")
    @Expose
    private List<StopSequence> stopSequence = null;
    @SerializedName("footPathInfo")
    @Expose
    private List<FootPathInfo> footPathInfo = null;
    @SerializedName("infos")
    @Expose
    private List<Info> infos = null;
    @SerializedName("pathDescriptions")
    @Expose
    private List<PathDescription> pathDescriptions = null;
    @SerializedName("interchange")
    @Expose
    private Interchange interchange;
    @SerializedName("coords")
    @Expose
    private List<List<Double>> coords = null;
    @SerializedName("properties")
    @Expose
    private Properties____ properties;

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public Boolean getIsRealtimeControlled() {
        return isRealtimeControlled;
    }

    public void setIsRealtimeControlled(Boolean isRealtimeControlled) {
        this.isRealtimeControlled = isRealtimeControlled;
    }

    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public Transportation getTransportation() {
        return transportation;
    }

    public void setTransportation(Transportation transportation) {
        this.transportation = transportation;
    }

    private String firstLine;
    private String secondLine;

    public String getFirstLine() {
        return "From " + origin.getName().split(",")[1] + " to " + destination.getName().split(",")[1];
    }

    public void setFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }

    public String getSecondLine() {
        return "On " + origin.getName().split(",")[2] + " at " + origin.getDepartureTimeEstimated();
    }

    public void setSecondLine(String secondLine) {
        this.secondLine = secondLine;
    }

    public List<Hint> getHints() {
        return hints;
    }

    public void setHints(List<Hint> hints) {
        this.hints = hints;
    }

    public List<StopSequence> getStopSequence() {
        return stopSequence;
    }

    public void setStopSequence(List<StopSequence> stopSequence) {
        this.stopSequence = stopSequence;
    }

    public List<FootPathInfo> getFootPathInfo() {
        return footPathInfo;
    }

    public void setFootPathInfo(List<FootPathInfo> footPathInfo) {
        this.footPathInfo = footPathInfo;
    }

    public List<Info> getInfos() {
        return infos;
    }

    public void setInfos(List<Info> infos) {
        this.infos = infos;
    }

    public List<PathDescription> getPathDescriptions() {
        return pathDescriptions;
    }

    public void setPathDescriptions(List<PathDescription> pathDescriptions) {
        this.pathDescriptions = pathDescriptions;
    }

    public Interchange getInterchange() {
        return interchange;
    }

    public void setInterchange(Interchange interchange) {
        this.interchange = interchange;
    }

    public List<List<Double>> getCoords() {
        return coords;
    }

    public void setCoords(List<List<Double>> coords) {
        this.coords = coords;
    }

    public Properties____ getProperties() {
        return properties;
    }

    public void setProperties(Properties____ properties) {
        this.properties = properties;
    }

}
