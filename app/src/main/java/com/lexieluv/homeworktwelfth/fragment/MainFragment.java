package com.lexieluv.homeworktwelfth.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.lexieluv.homeworktwelfth.DataUtil;
import com.lexieluv.homeworktwelfth.PlaceActivity;
import com.lexieluv.homeworktwelfth.R;
import com.lexieluv.homeworktwelfth.adapter.FoodListAdapter;
import com.lexieluv.homeworktwelfth.adapter.MainMenuAdapter;
import com.lexieluv.homeworktwelfth.entity.Food;

import java.util.ArrayList;
import java.util.List;


public class MainFragment extends Fragment {
    //城市选项属性
    private ImageView choose_city;
    private TextView city;
    Context context;

    //菜单图标
    protected int[] icons = {
            R.drawable.fly1,R.drawable.car,
            R.drawable.autombile1,R.drawable.cake,
            R.drawable.food,R.drawable.watch,
            R.drawable.cp,R.drawable.phone
    };
    //菜单格式
    protected String[] menus;
    //主菜单
    protected RecyclerView main_top;

    //listview菜单
    protected List<Food> list = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main,container,false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //主菜单
        menus = this.getActivity().getResources().getStringArray(R.array.main_menu);
        main_top = getView().findViewById(R.id.main_top);

        main_top.setLayoutManager(new GridLayoutManager(getActivity(),4));
        MainMenuAdapter mainMenuAdapter = new MainMenuAdapter(getActivity(), DataUtil.getMainMenu(icons,menus));
        main_top.setAdapter(mainMenuAdapter);


        //城市列表跳转
        choose_city = this.getActivity().findViewById(R.id.choose_city);
        city = this.getActivity().findViewById(R.id.city);

        choose_city.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PlaceActivity.class);
                startActivity(intent);
            }
        });

        //食物列表
        addData(list);
        FoodListAdapter foodListAdapter = new FoodListAdapter(getContext(),R.layout.item_listview,list);
        ListView listView = getView().findViewById(R.id.main_list);
        listView.setAdapter(foodListAdapter);
        //解决只显示一条数据
//        setListBaseForm(listView);
    }

//    private void setListBaseForm(ListView listView) {
//        FoodListAdapter foodListAdapter = (FoodListAdapter) listView.getAdapter();
//        if(foodListAdapter == null){
//            return;
//        }
//
//        int Height = 0;
//        for(int i = 0,len = foodListAdapter.getCount();i < len;i++){
//            View listItem = foodListAdapter.getView(i,null,listView);
//            listItem.setLayoutParams(new ViewGroup.LayoutParams(
//                    ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
//            listItem.measure(0,0);
//            Height += listItem.getMeasuredHeight();
//        }
//        ViewGroup.LayoutParams params = listView.getLayoutParams();
//        params.height = Height + (listView.getDividerHeight() * (foodListAdapter.getCount() - 1));
//        listView.setLayoutParams(params);
//    }

    public void addData(List list) {
        this.list = list;
        Food one = new Food(R.drawable.pro1,"牛排","极品牛排，值得拥有！",
                "$60","来源地:新西兰","剩余:3份");
        list.add(one);
        Food two = new Food(R.drawable.pro2,"地三鲜","三种营养，一次实现！",
                "$30","来源地:中国","剩余:5份");
        list.add(two);
        Food three = new Food(R.drawable.product3,"松仁大虾","坚果和海鲜的完美组合！",
                "$70","来源地:澳大利亚","剩余:1份");
        list.add(three);
        Food four = new Food(R.drawable.product4,"冷饮","炎热夏天，来一杯吧！",
                "$5","来源地:英国","剩余:15份");
        list.add(four);
        Food one2 = new Food(R.drawable.pro1,"牛排","极品牛排，值得拥有！",
                "$60","来源地:新西兰","剩余:3份");
        list.add(one2);
        Food two2 = new Food(R.drawable.pro2,"地三鲜","三种营养，一次实现！",
                "$30","来源地:中国","剩余:5份");
        list.add(two2);
        Food three2 = new Food(R.drawable.product3,"松仁大虾","坚果和海鲜的完美组合！",
                "$70","来源地:澳大利亚","剩余:1份");
        list.add(three2);
        Food four2 = new Food(R.drawable.product4,"冷饮","炎热夏天，来一杯吧！",
                "$5","来源地:英国","剩余:15份");
        list.add(four2);
    }
}
