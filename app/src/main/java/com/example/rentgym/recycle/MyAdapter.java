package com.example.rentgym.recycle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentgym.R;
import com.example.rentgym.entity.Gym;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    List<Gym> gyms;

    public MyAdapter(Context context, List<Gym> gyms) {
        this.context = context;
        this.gyms = gyms;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.gym_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.priceView.setText(gyms.get(position).getPrice());
        holder.addressView.setText(gyms.get(position).getAddress());
        holder.cityView.setText(gyms.get(position).getCity());
        holder.imageView.setImageResource(gyms.get(position).getImage());
        holder.imageFavorite.setImageResource(gyms.get(position).getFavorite());
        holder.informationView.setText(gyms.get(position).getInformation());
        holder.dateView.setText(gyms.get(position).getDate());
    }

    @Override
    public int getItemCount() {
        return gyms.size();
    }
}
