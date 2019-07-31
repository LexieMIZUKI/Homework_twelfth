package com.lexieluv.homeworktwelfth.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.lexieluv.homeworktwelfth.R;
import com.lexieluv.homeworktwelfth.entity.Food;

import java.util.List;

public class FoodListAdapter extends ArrayAdapter {
    private final int itemId;

    public FoodListAdapter(@NonNull Context context, int resource, @NonNull List<Food> objects) {
        super(context, resource, objects);
        itemId = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Food f = (Food) getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(itemId,parent,false);
        ImageView foodImage = view.findViewById(R.id.iv_food);
        TextView title = view.findViewById(R.id.tv_title);
        TextView comment = view.findViewById(R.id.tv_explain);
        TextView price = view.findViewById(R.id.tv_price);
        TextView place = view.findViewById(R.id.tv_place);
        TextView amount = view.findViewById(R.id.tv_amount);

        foodImage.setImageResource(f.getFoodImage());
        title.setText(f.getTitle());
        comment.setText(f.getComment());
        price.setText(f.getPrice());
        place.setText(f.getPlace());
        amount.setText(f.getAmount());
        return view;
    }
}
