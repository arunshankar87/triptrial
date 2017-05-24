
package com.arunshankar.triptrial;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Parent__ {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("disassembledName")
    @Expose
    private String disassembledName;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("parent")
    @Expose
    private Parent___ parent;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisassembledName() {
        return disassembledName;
    }

    public void setDisassembledName(String disassembledName) {
        this.disassembledName = disassembledName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Parent___ getParent() {
        return parent;
    }

    public void setParent(Parent___ parent) {
        this.parent = parent;
    }

}
