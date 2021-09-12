package com.example.retrofitandroidsessionone.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofitandroidsessionone.R;
import com.example.retrofitandroidsessionone.Model.WeatherDataModel;

import java.util.List;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder>{

    List<WeatherDataModel> weatherResponseList;
    Context context;

    public WeatherAdapter(Context context, List<WeatherDataModel> weatherResponseList) {
        this.weatherResponseList = weatherResponseList;
        this.context = context;
    }


    @NonNull
    @Override
    public WeatherViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return new WeatherViewHolder(view);
    }




    @Override
    public void onBindViewHolder(@NonNull WeatherViewHolder holder, int position) {

        // instance of Model class
        WeatherDataModel weatherResponse = weatherResponseList.get(position);
        //
        holder.name.setText(" " + weatherResponse.getName());
        holder.id.setText("ID: "+weatherResponse.getId());
        holder.dt.setText( ""+weatherResponse.getDt());
        holder.coord.setText( ""+weatherResponse.getCoord());  // take lat and long at together


    }

    @Override
    public int getItemCount() {
        return weatherResponseList.size();
    }



    public class WeatherViewHolder extends RecyclerView.ViewHolder {

        // ids of the widgets
        TextView name, id, dt, coord;
        public WeatherViewHolder(@NonNull View itemView) {

            super(itemView);

            name = itemView.findViewById(R.id.textView);
            id = itemView.findViewById(R.id.textView2);
            dt = itemView.findViewById(R.id.textView3);
            coord = itemView.findViewById(R.id.textView4);
        }
    }
}
