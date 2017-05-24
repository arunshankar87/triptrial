
package com.arunshankar.triptrial;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FootPathInfo {

    @SerializedName("position")
    @Expose
    private String position;
    @SerializedName("duration")
    @Expose
    private Double duration;
    @SerializedName("footPathElem")
    @Expose
    private List<FootPathElem> footPathElem = null;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public List<FootPathElem> getFootPathElem() {
        return footPathElem;
    }

    public void setFootPathElem(List<FootPathElem> footPathElem) {
        this.footPathElem = footPathElem;
    }

}
