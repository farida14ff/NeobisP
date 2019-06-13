package com.example.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     int number = 0000;
    String zero3 = "000";
    String zero2 = "00";
    String zero1 ="0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment(View view){
        number++;
        display(number);
    }

    public void decrement(View view){
        number--;
        display(number);
    }

    private void display(int num){
        TextView textViewNumber = findViewById(R.id.text_view_number);

        if (number<10){
            textViewNumber.setText(zero3 +num);
        }
        else if(number<100){
            textViewNumber.setText(zero2 +num);
        }
        else if(number<1000){
            textViewNumber.setText(zero1 +num);
        }
        else {
            textViewNumber.setText(""+num);
        }

    }
}
