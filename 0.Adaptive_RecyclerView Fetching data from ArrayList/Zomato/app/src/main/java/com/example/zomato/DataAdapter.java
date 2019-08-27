package com.example.zomato;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<HotelData> hotel_data;
    private Context context;

    public DataAdapter(Context context,ArrayList<HotelData> hotel_data) {
        this.context = context;
        this.hotel_data = hotel_data;

    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_layout, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

        viewHolder.id_hotel_name.setText(hotel_data.get(i).getHotel_name());
        viewHolder.id_hotel_rating.setText(hotel_data.get(i).getHotel_rating());
        viewHolder.id_hotel_menu.setText(hotel_data.get(i).getHotel_menu());
        viewHolder.id_hotel_cost.setText(hotel_data.get(i).getHotel_per_person_cost());
        viewHolder.id_time.setText(hotel_data.get(i).getHotel_delivery_time());
        Picasso.with(context).load(hotel_data.get(i).getHotel_image_url()).into(viewHolder.hotel_image);

    }

    @Override
    public int getItemCount() {
        return hotel_data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView id_hotel_name;
        TextView id_hotel_rating;
        TextView id_hotel_menu;
        TextView id_hotel_cost;
        TextView id_time;
        ImageView hotel_image;

        public ViewHolder(View view) {
            super(view);

            id_hotel_name = (TextView)view.findViewById(R.id.id_hotel_name);
            id_hotel_rating = (TextView)view.findViewById(R.id.id_hotel_rating);
            id_hotel_menu = (TextView)view.findViewById(R.id.id_hotel_menu);
            id_hotel_cost = (TextView)view.findViewById(R.id.id_hotel_cost);
            id_time = (TextView)view.findViewById(R.id.id_time);
            hotel_image = (ImageView)view.findViewById(R.id.hotel_image);
        }
    }
}
