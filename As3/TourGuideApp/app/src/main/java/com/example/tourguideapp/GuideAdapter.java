package com.example.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class GuideAdapter extends ArrayAdapter<Guide> {

    public GuideAdapter(@NonNull AppCompatActivity context, ArrayList<Guide> guides) {
        super(context,0, guides);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.layout_list, parent, false);
        }

        Guide currentGuide = getItem(position);
        final Guide currentGuide2 = getItem(position);

        TextView historyView = listItemView.findViewById(R.id.id_history);
        historyView.setText(currentGuide.getmHistory());

        TextView locationView = listItemView.findViewById(R.id.id_location);
        locationView.setText(currentGuide.getmLocation());

        locationView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse(currentGuide2.getmGeo()));
                getContext().startActivity(intent);
            }

        });



        TextView azTextView = listItemView.findViewById(R.id.az_text);
        azTextView.setText(currentGuide.getAzTranstetion());

        TextView ruTextView = listItemView.findViewById(R.id.ru_text);
        ruTextView.setText(currentGuide.getRuTransletion());

        ImageView imageView = listItemView.findViewById(R.id.imageView);
        imageView.setImageResource(currentGuide.getmImageId());
        imageView.setVisibility(View.VISIBLE);


        return listItemView;
    }
}
