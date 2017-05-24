
package com.arunshankar.triptrial;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Properties____ {

    @SerializedName("vehicleAccess")
    @Expose
    private List<String> vehicleAccess = null;
    @SerializedName("PlanLowFloorVehicle")
    @Expose
    private String planLowFloorVehicle;
    @SerializedName("PlanWheelChairAccess")
    @Expose
    private String planWheelChairAccess;
    @SerializedName("lineType")
    @Expose
    private String lineType;
    @SerializedName("DIFFERENT_FARES")
    @Expose
    private String dIFFERENTFARES;

    public List<String> getVehicleAccess() {
        return vehicleAccess;
    }

    public void setVehicleAccess(List<String> vehicleAccess) {
        this.vehicleAccess = vehicleAccess;
    }

    public String getPlanLowFloorVehicle() {
        return planLowFloorVehicle;
    }

    public void setPlanLowFloorVehicle(String planLowFloorVehicle) {
        this.planLowFloorVehicle = planLowFloorVehicle;
    }

    public String getPlanWheelChairAccess() {
        return planWheelChairAccess;
    }

    public void setPlanWheelChairAccess(String planWheelChairAccess) {
        this.planWheelChairAccess = planWheelChairAccess;
    }

    public String getLineType() {
        return lineType;
    }

    public void setLineType(String lineType) {
        this.lineType = lineType;
    }

    public String getDIFFERENTFARES() {
        return dIFFERENTFARES;
    }

    public void setDIFFERENTFARES(String dIFFERENTFARES) {
        this.dIFFERENTFARES = dIFFERENTFARES;
    }

}
