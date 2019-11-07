package com.example.androidforjava;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    View view;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);
        init();
        return view;
    }

    private void init(){
        RecyclerView recyclerView = view.findViewById(R.id.home_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        List<HomeListBean> listBeans = new ArrayList<>();
        HomeListBean bean1 = new HomeListBean();
        bean1.setName("高八斗(福大店)");
        bean1.setScore(4.8);
        bean1.setMonthSellOut(481);
        bean1.setDeliveryMoney(3);
        bean1.setAvgConsumption(19);
        bean1.setArrivedTime(30);
        HomeListBean bean2 = new HomeListBean();
        bean2.setName("高八斗(福大店)");
        bean2.setScore(4.8);
        bean2.setMonthSellOut(481);
        bean2.setDeliveryMoney(3);
        bean2.setAvgConsumption(19);
        bean2.setArrivedTime(30);
        HomeListBean bean3 = new HomeListBean();
        bean3.setName("高八斗(福大店)");
        bean3.setScore(4.8);
        bean3.setMonthSellOut(481);
        bean3.setDeliveryMoney(3);
        bean3.setAvgConsumption(19);
        bean3.setArrivedTime(30);
        listBeans.add(bean1);
        listBeans.add(bean2);
        listBeans.add(bean3);
        ListItemAdapter adapter = new ListItemAdapter(getActivity(),listBeans);
        recyclerView.setAdapter(adapter);
    }

}
