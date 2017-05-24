package com.arunshankar.triptrial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    List<Leg> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Retrofit retrofit = new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://api.transport.nsw.gov.au/v1/tp/")
                .build();
        TripPlanService tripPlanService = retrofit.create(TripPlanService.class);
        /*final Observable<TripResponse> responseObservable = tripPlanService.getTrips(
                new SimpleDateFormat("yyyyMMdd").format(new Date())
                ,new SimpleDateFormat("HHmm").format(new Date())
                ,getIntent().getExtras().getString("startStationId")
                ,getIntent().getExtras().getString("endStationId"));
        responseObservable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(tripResponse -> {
                        for (Journey journey: tripResponse.getJourneys()){
                            items.addAll(journey.getLegs());
                        }
                        mAdapter.notifyDataSetChanged();
                },Throwable::printStackTrace);*/
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new MyAdapter(items);
        recyclerView.setAdapter(mAdapter);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), LinearLayout.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);
    }

    private Date shiftTimeZone(Date date, TimeZone sourceTimeZone, TimeZone targetTimeZone) {
        Calendar sourceCalendar = Calendar.getInstance();
        sourceCalendar.setTime(date);
        sourceCalendar.setTimeZone(sourceTimeZone);

        Calendar targetCalendar = Calendar.getInstance();
        for (int field : new int[] {Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_MONTH, Calendar.HOUR, Calendar.MINUTE, Calendar.SECOND, Calendar.MILLISECOND}) {
            targetCalendar.set(field, sourceCalendar.get(field));
        }
        targetCalendar.setTimeZone(targetTimeZone);

        return targetCalendar.getTime();
    }
}
