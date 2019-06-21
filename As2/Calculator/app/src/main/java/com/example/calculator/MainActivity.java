package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class
MainActivity extends AppCompatActivity {

    EditText edit;
    EditText edit2;
    Double num1;
    Double num2;
    Double answer;
    String answerStr;
    String editStr;
    String editStr2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void editors(){
        edit =  findViewById(R.id.editText);
        edit2 =  findViewById(R.id.editText2);

        editStr = edit.getText().toString();
        editStr2 = edit2.getText().toString();
    }

    public void plusOpr(View view){
        editors();
        if (editStr.isEmpty() || editStr2.isEmpty()){
            displayToast();
        }else {
            num1 = Double.parseDouble(editStr);
            num2 = Double.parseDouble(editStr2);
            answer = num1 + num2;
            answerStr = String.valueOf(answer);
            openAnswer();
        }
    }

    public void divOpr(View view){
        editors();
        if(!editStr2.isEmpty()){
            num2 = Double.parseDouble(editStr2);
        }
        if (editStr.isEmpty() || editStr2.isEmpty()){
            displayToast();
        }
        else if(num2 == 0){
            displayToast1();
        }else {
            num1 = Double.parseDouble(editStr);
            answer = num1 / num2;
            answerStr = String.valueOf(answer);
            openAnswer();
        }
    }

    public void minsOpr(View view){
        editors();
        if (editStr.isEmpty() || editStr2.isEmpty()){
            displayToast();
        }else {
            num1 = Double.parseDouble(editStr);
            num2 = Double.parseDouble(editStr2);
            answer = num1 - num2;
            answerStr = String.valueOf(answer);
            openAnswer();
        }
    }

    public void multOpr(View view){
        editors();
        if (editStr.isEmpty() || editStr2.isEmpty()){
            displayToast();
        }else {
            num1 = Double.parseDouble(editStr);
            num2 = Double.parseDouble(editStr2);
            answer = num1 * num2;
            answerStr = String.valueOf(answer);
            openAnswer();
        }
    }

    public void openAnswer(){
        Intent numbersIntent = new Intent(this,Answer.class);
        numbersIntent.putExtra("answer", answer);
        startActivity(numbersIntent);
    }

    public void displayToast(){
        Context context = getApplicationContext();
        CharSequence text = "Incorrect input";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }


    public void displayToast1(){
        Context context = getApplicationContext();
        CharSequence text = "Division by zero";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void clear(View view){
        editors();
        edit.setText("");
        edit2.setText("");
    }





}
/*1.разобраться с cardView
* 2.добавить кнопку разворота цифр
* 4.добавить анимацию на нажатие кнопки
* 6.
* 7.*/
