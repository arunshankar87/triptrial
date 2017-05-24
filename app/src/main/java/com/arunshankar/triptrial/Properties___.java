
package com.arunshankar.triptrial;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Properties___ {

    @SerializedName("WheelchairAccess")
    @Expose
    private String wheelchairAccess;
    @SerializedName("downloads")
    @Expose
    private List<Download__> downloads = null;

    public String getWheelchairAccess() {
        return wheelchairAccess;
    }

    public void setWheelchairAccess(String wheelchairAccess) {
        this.wheelchairAccess = wheelchairAccess;
    }

    public List<Download__> getDownloads() {
        return downloads;
    }

    public void setDownloads(List<Download__> downloads) {
        this.downloads = downloads;
    }

}
