
package com.arunshankar.triptrial;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Versions {

    @SerializedName("controller")
    @Expose
    private String controller;
    @SerializedName("interfaceMax")
    @Expose
    private String interfaceMax;
    @SerializedName("interfaceMin")
    @Expose
    private String interfaceMin;

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    public String getInterfaceMax() {
        return interfaceMax;
    }

    public void setInterfaceMax(String interfaceMax) {
        this.interfaceMax = interfaceMax;
    }

    public String getInterfaceMin() {
        return interfaceMin;
    }

    public void setInterfaceMin(String interfaceMin) {
        this.interfaceMin = interfaceMin;
    }

}
