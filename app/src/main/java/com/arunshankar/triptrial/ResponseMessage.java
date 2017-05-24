
package com.arunshankar.triptrial;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseMessage {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("module")
    @Expose
    private String module;
    @SerializedName("code")
    @Expose
    private Double code;
    @SerializedName("text")
    @Expose
    private String text;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public Double getCode() {
        return code;
    }

    public void setCode(Double code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
