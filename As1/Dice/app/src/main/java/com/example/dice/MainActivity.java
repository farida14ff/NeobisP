package com.example.dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imageView1;
    ImageView imageView2;
    Button roll;
    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageView1 = findViewById(R.id.im_1view);
        imageView2 = findViewById(R.id.im_2view);
        roll = findViewById(R.id.roll_button);

        r = new Random();

        final Integer[] images = {
                R.drawable.ic_1,
                R.drawable.ic_2,
                R.drawable.ic_3,
                R.drawable.ic_4,
                R.drawable.ic_5,
                R.drawable.ic_6,
        };

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView1.setImageResource(images[r.nextInt(images.length)]);
                imageView2.setImageResource(images[r.nextInt(images.length)]);
            }
        });

    }




}
