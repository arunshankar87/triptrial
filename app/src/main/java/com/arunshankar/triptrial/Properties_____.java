
package com.arunshankar.triptrial;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Properties_____ {

    @SerializedName("riderCategoryName")
    @Expose
    private String riderCategoryName;
    @SerializedName("priceStationAccessFee")
    @Expose
    private String priceStationAccessFee;
    @SerializedName("priceTotalFare")
    @Expose
    private String priceTotalFare;
    @SerializedName("evaluationTicket")
    @Expose
    private String evaluationTicket;

    public String getRiderCategoryName() {
        return riderCategoryName;
    }

    public void setRiderCategoryName(String riderCategoryName) {
        this.riderCategoryName = riderCategoryName;
    }

    public String getPriceStationAccessFee() {
        return priceStationAccessFee;
    }

    public void setPriceStationAccessFee(String priceStationAccessFee) {
        this.priceStationAccessFee = priceStationAccessFee;
    }

    public String getPriceTotalFare() {
        return priceTotalFare;
    }

    public void setPriceTotalFare(String priceTotalFare) {
        this.priceTotalFare = priceTotalFare;
    }

    public String getEvaluationTicket() {
        return evaluationTicket;
    }

    public void setEvaluationTicket(String evaluationTicket) {
        this.evaluationTicket = evaluationTicket;
    }

}
