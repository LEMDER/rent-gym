package com.example.rentgym;

import android.content.Context;
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

public class HomeFragment extends Fragment {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);


        List<Gym> gyms = new ArrayList<Gym>();
        gyms.add(new Gym("10 000 ₸/ч", "проспект Абая 165а, «BOSS»", "Алматы, Бостандыкский р-н",R.drawable.gym1, "Наличный расчет · Оплата по QR-коду · Оплата через банк · Раздевалка · Душ","1 мая"));
        gyms.add(new Gym("15 000 ₸/ч", "Наурызбай батыра 50, «Arbat»", "Алматы, Алмалинский р-н",R.drawable.gym2, "Наличный расчет · Оплата по QR-коду · Мячи · Отопление ","12 мая"));
        gyms.add(new Gym("14 000 ₸/ч", "Толе би 11а, «Эдальвейс»", "Алматы, Ауэзовский р-н",R.drawable.gym3, "Наличный расчет · Оплата по QR-коду · Крытый · Раздевалка · Мячи","27 марта"));
        RecyclerView recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new MyAdapter(getActivity().getApplicationContext(), gyms));
        return view;
    }

}