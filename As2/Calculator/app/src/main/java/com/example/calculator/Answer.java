package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Answer extends AppCompatActivity {

    double answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        Intent intent = getIntent();
        answer = intent.getDoubleExtra("answer", 0);
        String showMessage = createMessage(String.valueOf(answer));
        display(showMessage);

    }

    String createMessage(String answerStr1){
        String displayMessage = "Answer is: " + answerStr1;
        return displayMessage;
    }

    public void display(String message){

        TextView ansTextView = findViewById(R.id.text_answ);
        ansTextView.setText(message);
    }

    public void go_back(View view){
        Intent numbersIntent = new Intent(this,MainActivity.class);
        numbersIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(numbersIntent);
    }


}
