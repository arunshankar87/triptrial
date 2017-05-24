package com.arunshankar.triptrial;


import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by arunshankar on 22/5/17.
 */

public interface TripPlanService {

    @Headers("Authorization: apikey jdv8tDLPUWNxvTMrfaqnhxixkp8CqrCyDFUt")
    @GET("stop_finder?TfNSWSF=true&outputFormat=rapidJSON&type_sf=any&version=10.2.2.48&coordOutputFormat=EPSG:4326")
    Observable<TripPlanResponse> getStops(@Query("name_sf") String searchString);

    @Headers("Authorization: apikey jdv8tDLPUWNxvTMrfaqnhxixkp8CqrCyDFUt")
    @GET("trip?TfNSWTR=true&outputFormat=rapidJSON&coordOutputFormat=EPSG%3A4326&depArrMacro=dep&type_origin=any&type_destination=any&calcNumberOfTrips=10&version=10.2.2.48")
    Observable<TripResponse> getTrips(@Query("itdDate") String startDate, @Query("itdTime") String startTime, @Query("name_origin") String startStationId, @Query("name_destination") String endStationId);
}
