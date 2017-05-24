
package com.arunshankar.triptrial;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Origin {

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
    private Parent parent;
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
    private Properties properties;

    private String timePending;

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

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public String getTimePending() {
        DateFormat originalFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH);
        Date date = null;
        try {
            date = originalFormat.parse(departureTimeEstimated);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR, 10);
        long currentTime = Calendar.getInstance().getTimeInMillis();
        long diffInMins = (calendar.getTimeInMillis() - currentTime) / (60 * 1000) % 60;
        return diffInMins + "\nmins";
    }

    public void setTimePending(String timePending) {
        this.timePending = timePending;
    }

    public String getDepartureTimeEstimated() {
        DateFormat originalFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH);
        try {
            Date date = originalFormat.parse(departureTimeEstimated);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.HOUR, 10);
            DateFormat targetFormat = new SimpleDateFormat("HH:mm");
            return targetFormat.format(calendar.getTimeInMillis());
        } catch (ParseException e) {
            e.printStackTrace();
        }
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

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

}
