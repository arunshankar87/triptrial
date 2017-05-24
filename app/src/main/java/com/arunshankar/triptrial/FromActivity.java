package com.arunshankar.triptrial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class FromActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    List<Location> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_from);
        EditText editText = (EditText) findViewById(R.id.editText);
        Button submit = (Button) findViewById(R.id.submit);
        Retrofit retrofit = new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://api.transport.nsw.gov.au/v1/tp/")
                .build();
        TripPlanService tripPlanService = retrofit.create(TripPlanService.class);
        submit.setOnClickListener(v -> {
            String search = editText.getText().toString();
            items.clear();
            editText.setText("");
            final Observable<TripPlanResponse> planResponseObservable = tripPlanService.getStops(search);
            planResponseObservable.subscribeOn(Schedulers.newThread())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(tripPlanResponse -> {
                        for(Location location : tripPlanResponse.getLocations()){
                            List<Double> modes = location.getModes();
                            if(modes!=null && modes.contains(1.0)) {
                                if(location.getDisassembledName().toLowerCase().contains(search)){
                                    items.add(location);
                                }
                            }
                        }
                        mAdapter.notifyDataSetChanged();
                    },Throwable::printStackTrace);
        });
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new FromAdapter(items);
        recyclerView.setAdapter(mAdapter);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), LinearLayout.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);
    }
}
