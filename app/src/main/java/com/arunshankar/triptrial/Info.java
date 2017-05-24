
package com.arunshankar.triptrial;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Info {

    @SerializedName("timestamps")
    @Expose
    private Timestamps timestamps;
    @SerializedName("priority")
    @Expose
    private String priority;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("version")
    @Expose
    private Double version;
    @SerializedName("urlText")
    @Expose
    private String urlText;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("subtitle")
    @Expose
    private String subtitle;

    public Timestamps getTimestamps() {
        return timestamps;
    }

    public void setTimestamps(Timestamps timestamps) {
        this.timestamps = timestamps;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getVersion() {
        return version;
    }

    public void setVersion(Double version) {
        this.version = version;
    }

    public String getUrlText() {
        return urlText;
    }

    public void setUrlText(String urlText) {
        this.urlText = urlText;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

}
