package com.example.rentgym;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rentgym.entity.Gym;
import com.example.rentgym.recycle.MyAdapter;

import java.util.ArrayList;
import java.util.List;

public class FavoriteFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_favorite, container, false);

        List<Gym> gyms = new ArrayList<Gym>();
        gyms.add(new Gym("10 000 ₸/ч", R.drawable.star_icon, "проспект Абая 165а, «BOSS»", "Алматы, Бостандыкский р-н",R.drawable.gym1, "Наличный расчет · Оплата по QR-коду · Оплата через банк · Раздевалка · Душ","1 мая"));

        RecyclerView recyclerView = view.findViewById(R.id.recycler_favorite);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new MyAdapter(getActivity().getApplicationContext(), gyms));
        return view;

    }
}