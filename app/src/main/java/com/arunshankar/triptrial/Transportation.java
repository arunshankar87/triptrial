
package com.arunshankar.triptrial;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Transportation {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("disassembledName")
    @Expose
    private String disassembledName;
    @SerializedName("number")
    @Expose
    private String number;
    @SerializedName("iconId")
    @Expose
    private Double iconId;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("product")
    @Expose
    private Product product;
    @SerializedName("operator")
    @Expose
    private Operator operator;
    @SerializedName("destination")
    @Expose
    private Destination_ destination;
    @SerializedName("properties")
    @Expose
    private Properties__ properties;

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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Double getIconId() {
        return iconId;
    }

    public void setIconId(Double iconId) {
        this.iconId = iconId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Destination_ getDestination() {
        return destination;
    }

    public void setDestination(Destination_ destination) {
        this.destination = destination;
    }

    public Properties__ getProperties() {
        return properties;
    }

    public void setProperties(Properties__ properties) {
        this.properties = properties;
    }

}
