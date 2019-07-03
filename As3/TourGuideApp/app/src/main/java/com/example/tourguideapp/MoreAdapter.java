package com.example.tourguideapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MoreAdapter extends ArrayAdapter<More> {

    public MoreAdapter(@NonNull AppCompatActivity context, ArrayList<More> mores) {
        super(context, 0, mores);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemViewMore = convertView;
        if (listItemViewMore == null) {
            listItemViewMore = LayoutInflater.from(getContext()).inflate(
                    R.layout.layout_list, parent, false);
        }

        More currentMore = getItem(position);


        TextView title = listItemViewMore.findViewById(R.id.title);
        title.setText(currentMore.getmTitle());

        TextView history = listItemViewMore.findViewById(R.id.history);
        history.setText(currentMore.getmTitle());

        TextView location = listItemViewMore.findViewById(R.id.location);
        location.setText(currentMore.getmTitle());

        ImageView image = listItemViewMore.findViewById(R.id.imageView1);
        image.setImageResource(currentMore.getmImage1());
        image.setVisibility(View.VISIBLE);


        return listItemViewMore;
    }
}
