package com.lexieluv.homeworktwelfth.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import com.lexieluv.homeworktwelfth.MainActivity;
import com.lexieluv.homeworktwelfth.R;
import com.lexieluv.homeworktwelfth.adapter.FoodListAdapter;
import com.lexieluv.homeworktwelfth.entity.Food;

import java.util.ArrayList;
import java.util.List;


public class ShopFragment extends Fragment {
    protected List<Food> list = new ArrayList<>();
    private ImageView back;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_shop,container,false);
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        MainFragment mf = new MainFragment();
        mf.addData(list);
        FoodListAdapter foodListAdapter = new FoodListAdapter(getContext(),R.layout.item_listview,list);
        ListView shopList = getView().findViewById(R.id.shop_list);
        shopList.setAdapter(foodListAdapter);

        back = getView().findViewById(R.id.back_main);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), MainActivity.class));
            }
        });
    }
}
