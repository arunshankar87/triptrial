
package com.arunshankar.triptrial;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Properties_ {

    @SerializedName("WheelchairAccess")
    @Expose
    private String wheelchairAccess;
    @SerializedName("downloads")
    @Expose
    private List<Download_> downloads = null;

    public String getWheelchairAccess() {
        return wheelchairAccess;
    }

    public void setWheelchairAccess(String wheelchairAccess) {
        this.wheelchairAccess = wheelchairAccess;
    }

    public List<Download_> getDownloads() {
        return downloads;
    }

    public void setDownloads(List<Download_> downloads) {
        this.downloads = downloads;
    }

}
