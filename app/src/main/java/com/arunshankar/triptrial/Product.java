
package com.arunshankar.triptrial;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("class")
    @Expose
    private Double _class;
    @SerializedName("iconId")
    @Expose
    private Double iconId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getClass_() {
        return _class;
    }

    public void setClass_(Double _class) {
        this._class = _class;
    }

    public Double getIconId() {
        return iconId;
    }

    public void setIconId(Double iconId) {
        this.iconId = iconId;
    }

}
