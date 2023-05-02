package com.example.rentgym.recycle;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentgym.R;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView priceView, addressView, cityView, informationView, dateView;
    ImageView imageView, imageFavorite;


    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        priceView = itemView.findViewById(R.id.price);
        addressView = itemView.findViewById(R.id.address);
        cityView = itemView.findViewById(R.id.city);
        imageView = itemView.findViewById(R.id.recycleImage);
        imageFavorite = itemView.findViewById(R.id.favoriteBtn);
        informationView = itemView.findViewById(R.id.information);
        dateView = itemView.findViewById(R.id.date);



    }
}
