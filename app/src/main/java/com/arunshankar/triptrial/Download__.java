
package com.arunshankar.triptrial;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Download__ {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("href")
    @Expose
    private String href;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

}
