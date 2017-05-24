package com.arunshankar.triptrial;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

public class FromAdapter extends RecyclerView.Adapter<FromAdapter.MyViewHolder> {
        private List<Location> data;

        // Provide a reference to the views for each data item
        // Complex data items may need more than one view per item, and
        // you provide access to all the views for a data item in a view holder
        public class MyViewHolder extends RecyclerView.ViewHolder {
                // each data item is just a string in this case
                private final ViewDataBinding binding;

                public MyViewHolder(ViewDataBinding binding) {
                        super(binding.getRoot());
                        this.binding = binding;
                }
                public void bind(Object obj) {
                       binding.setVariable(com.arunshankar.triptrial.BR.obj,obj);
                       binding.executePendingBindings();
                }
        }

        // Provide a suitable constructor (depends on the kind of dataset)
        public FromAdapter(List<Location> myDataset) {
                data = myDataset;
        }

        // Create new views (invoked by the layout manager)
        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                // create a new view
                LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
                ViewDataBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.row_layout, parent, false);
                // set the view's size, margins, paddings and layout parameters
                return new MyViewHolder(binding);
        }

        // Replace the contents of a view (invoked by the layout manager)
        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
                final Location temperatureData = data.get(position);
                holder.bind(temperatureData);
                holder.binding.getRoot().setOnClickListener(v -> {
                        Context context = holder.binding.getRoot().getContext();
                        Intent intent = new Intent(context,ToActivity.class);
                        intent.putExtra("startStationId",temperatureData.getId());
                        context.startActivity(intent);
                });

        }

        // Return the size of your dataset (invoked by the layout manager)
        @Override
        public int getItemCount() {
            return data.size();
        }

}