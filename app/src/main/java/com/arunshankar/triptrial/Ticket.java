
package com.arunshankar.triptrial;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ticket {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("comment")
    @Expose
    private String comment;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("priceLevel")
    @Expose
    private String priceLevel;
    @SerializedName("priceBrutto")
    @Expose
    private Double priceBrutto;
    @SerializedName("priceNetto")
    @Expose
    private Double priceNetto;
    @SerializedName("taxPercent")
    @Expose
    private Double taxPercent;
    @SerializedName("fromLeg")
    @Expose
    private Double fromLeg;
    @SerializedName("toLeg")
    @Expose
    private Double toLeg;
    @SerializedName("net")
    @Expose
    private String net;
    @SerializedName("person")
    @Expose
    private String person;
    @SerializedName("travellerClass")
    @Expose
    private String travellerClass;
    @SerializedName("timeValidity")
    @Expose
    private String timeValidity;
    @SerializedName("validMinutes")
    @Expose
    private Double validMinutes;
    @SerializedName("isShortHaul")
    @Expose
    private String isShortHaul;
    @SerializedName("returnsAllowed")
    @Expose
    private String returnsAllowed;
    @SerializedName("validForOneJourneyOnly")
    @Expose
    private String validForOneJourneyOnly;
    @SerializedName("validForOneOperatorOnly")
    @Expose
    private String validForOneOperatorOnly;
    @SerializedName("numberOfChanges")
    @Expose
    private Double numberOfChanges;
    @SerializedName("nameValidityArea")
    @Expose
    private String nameValidityArea;
    @SerializedName("properties")
    @Expose
    private Properties_____ properties;

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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPriceLevel() {
        return priceLevel;
    }

    public void setPriceLevel(String priceLevel) {
        this.priceLevel = priceLevel;
    }

    public Double getPriceBrutto() {
        return priceBrutto;
    }

    public void setPriceBrutto(Double priceBrutto) {
        this.priceBrutto = priceBrutto;
    }

    public Double getPriceNetto() {
        return priceNetto;
    }

    public void setPriceNetto(Double priceNetto) {
        this.priceNetto = priceNetto;
    }

    public Double getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(Double taxPercent) {
        this.taxPercent = taxPercent;
    }

    public Double getFromLeg() {
        return fromLeg;
    }

    public void setFromLeg(Double fromLeg) {
        this.fromLeg = fromLeg;
    }

    public Double getToLeg() {
        return toLeg;
    }

    public void setToLeg(Double toLeg) {
        this.toLeg = toLeg;
    }

    public String getNet() {
        return net;
    }

    public void setNet(String net) {
        this.net = net;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getTravellerClass() {
        return travellerClass;
    }

    public void setTravellerClass(String travellerClass) {
        this.travellerClass = travellerClass;
    }

    public String getTimeValidity() {
        return timeValidity;
    }

    public void setTimeValidity(String timeValidity) {
        this.timeValidity = timeValidity;
    }

    public Double getValidMinutes() {
        return validMinutes;
    }

    public void setValidMinutes(Double validMinutes) {
        this.validMinutes = validMinutes;
    }

    public String getIsShortHaul() {
        return isShortHaul;
    }

    public void setIsShortHaul(String isShortHaul) {
        this.isShortHaul = isShortHaul;
    }

    public String getReturnsAllowed() {
        return returnsAllowed;
    }

    public void setReturnsAllowed(String returnsAllowed) {
        this.returnsAllowed = returnsAllowed;
    }

    public String getValidForOneJourneyOnly() {
        return validForOneJourneyOnly;
    }

    public void setValidForOneJourneyOnly(String validForOneJourneyOnly) {
        this.validForOneJourneyOnly = validForOneJourneyOnly;
    }

    public String getValidForOneOperatorOnly() {
        return validForOneOperatorOnly;
    }

    public void setValidForOneOperatorOnly(String validForOneOperatorOnly) {
        this.validForOneOperatorOnly = validForOneOperatorOnly;
    }

    public Double getNumberOfChanges() {
        return numberOfChanges;
    }

    public void setNumberOfChanges(Double numberOfChanges) {
        this.numberOfChanges = numberOfChanges;
    }

    public String getNameValidityArea() {
        return nameValidityArea;
    }

    public void setNameValidityArea(String nameValidityArea) {
        this.nameValidityArea = nameValidityArea;
    }

    public Properties_____ getProperties() {
        return properties;
    }

    public void setProperties(Properties_____ properties) {
        this.properties = properties;
    }

}
