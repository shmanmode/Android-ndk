package com.example.card_view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<CardData> card_data;
    private Context context;

    public DataAdapter(Context context, ArrayList<CardData> card_data) {
        this.context = context;
        this.card_data = card_data;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cards_layout, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {


        Picasso.with(context).load(card_data.get(i).getCard_image_url()).into(viewHolder.id_image);
        viewHolder.id_name.setText(card_data.get(i).getCard_name());
        viewHolder.id_offer.setText(card_data.get(i).getCard_offer());
        viewHolder.id_distance.setText(card_data.get(i).getCard_distance());
        viewHolder.id_rating.setText(card_data.get(i).getCard_rating());
    }

    @Override
    public int getItemCount() {
        return card_data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView id_image;
        TextView id_name;
        TextView id_offer;
        TextView id_distance;
        TextView id_rating;

        public ViewHolder(View view) {
            super(view);

            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int pxWidth_Portart = (displayMetrics.widthPixels / 3) - 22;
            int pxHeight_Portart = (displayMetrics.widthPixels / 3) - 50;
            int pxWidth_landscape = (displayMetrics.widthPixels / 5) - 20;
            int pxHeight_Landscape = (displayMetrics.widthPixels / 5) - 50;

            id_image = (ImageView) view.findViewById(R.id.id_image);
            id_name = (TextView) view.findViewById(R.id.id_name);
            id_offer = (TextView) view.findViewById(R.id.id_offer);
            id_distance = (TextView) view.findViewById(R.id.id_distance);
            id_rating = (TextView) view.findViewById(R.id.id_rating);

            if (displayMetrics.heightPixels > displayMetrics.widthPixels) {
                id_image.getLayoutParams().width = pxWidth_Portart;
                id_image.getLayoutParams().height = pxHeight_Portart;
                id_name.setTextSize(displayMetrics.widthPixels / 67);
                id_offer.setTextSize(displayMetrics.widthPixels / 67);
            } else {
                id_image.getLayoutParams().width = pxWidth_landscape;
                id_image.getLayoutParams().height = pxHeight_Landscape;
                id_name.setTextSize(displayMetrics.widthPixels / 100);
                id_offer.setTextSize(displayMetrics.widthPixels / 100);

            }
        }
    }
}
