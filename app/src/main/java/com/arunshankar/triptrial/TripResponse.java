
package com.arunshankar.triptrial;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TripResponse {

    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("systemMessages")
    @Expose
    private List<ResponseMessage> systemMessages;
    @SerializedName("journeys")
    @Expose
    private List<Journey> journeys = null;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<ResponseMessage> getSystemMessages() {
        return systemMessages;
    }

    public void setSystemMessages(List<ResponseMessage> systemMessages) {
        this.systemMessages = systemMessages;
    }

    public List<Journey> getJourneys() {
        return journeys;
    }

    public void setJourneys(List<Journey> journeys) {
        this.journeys = journeys;
    }

}
