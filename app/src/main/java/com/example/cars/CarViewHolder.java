package com.example.cars;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CarViewHolder extends RecyclerView.ViewHolder {

    public CardView card;
    public ImageView image;
    public TextView name;
    public TextView brand;
    public TextView model;
    public TextView year;

    public CarViewHolder(@NonNull View itemView) {
        super(itemView);

        card = itemView.findViewById(R.id.cardview);
        image = itemView.findViewById(R.id.imageView);
        name = itemView.findViewById(R.id.name);
        brand = itemView.findViewById(R.id.brand);
        model = itemView.findViewById(R.id.model);
        year = itemView.findViewById(R.id.year);

    }
}
