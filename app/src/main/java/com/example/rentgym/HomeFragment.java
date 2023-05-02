package com.example.rentgym;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rentgym.entity.Gym;
import com.example.rentgym.recycle.MyAdapter;
import com.example.rentgym.recycle.RecycleViewInterface;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment implements RecycleViewInterface {

    TextView filter;
    ImageView filterIcon;
    BottomSheetDialog dialog;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        filter = (TextView) view.findViewById(R.id.filter_text);
        filterIcon = (ImageView) view.findViewById(R.id.filter_icon);
        dialog = new BottomSheetDialog(getActivity());
        createDialog();

        filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.show();
            }
        });

        dialog.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);

        List<Gym> gyms = new ArrayList<Gym>();
        gyms.add(new Gym("10 000 ₸/ч", R.drawable.star_icon , "проспект Абая 165а, «BOSS»", "Алматы, Бостандыкский р-н",R.drawable.gym1,"Наличный расчет · Оплата по QR-коду · Оплата через банк · Раздевалка · Душ","1 мая"));
        gyms.add(new Gym("15 000 ₸/ч", R.drawable.star_empty_icon, "Наурызбай батыра 50, «Arbat»", "Алматы, Алмалинский р-н",R.drawable.gym2,"Наличный расчет · Оплата по QR-коду · Мячи · Отопление ","12 мая"));
        gyms.add(new Gym("14 000 ₸/ч", R.drawable.star_empty_icon, "Толе би 11а, «Эдальвейс»", "Алматы, Ауэзовский р-н",R.drawable.gym3, "Наличный расчет · Оплата по QR-коду · Крытый · Раздевалка · Мячи","27 марта"));
        RecyclerView recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new MyAdapter(getActivity().getApplicationContext(), gyms));
        return view;
    }

    private void createDialog() {
        View view = getLayoutInflater().inflate(R.layout.filter_bottom_window, null, false);
        Button apply = view.findViewById(R.id.filter_button);
        EditText from = view.findViewById(R.id.price_range_from);
        EditText to = view.findViewById(R.id.price_range_to);

        apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        dialog.setContentView(view);
    }

    @Override
    public void onItemClick(int position) {

    }
}