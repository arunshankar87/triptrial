
package com.arunshankar.triptrial;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Error {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("versions")
    @Expose
    private Versions versions;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Versions getVersions() {
        return versions;
    }

    public void setVersions(Versions versions) {
        this.versions = versions;
    }

}
