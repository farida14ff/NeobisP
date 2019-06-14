package com.example.greetyourself;

import android.content.Context;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showName(View view){
        EditText nameField = findViewById(R.id.name_filed);
        String name = nameField.getText().toString();
        Log.v("MainActivity",name);
        boolean wordChekerVar = wordCheker(name);
        if (name.isEmpty()){
            displayToast();
        }
        else if (wordChekerVar == false){
            displayToast();
        }
        else {
            String showMessage = createMessage(name);
            display(showMessage);
        }

    }

    String createMessage(String name){
        String displayMessage = "Hello " + name + "!";
        return displayMessage;
    }

    public void display(String message){
        TextView nameTextView = findViewById(R.id.text_name);
        nameTextView.setText(message);
    }

    public void displayToast(){
        Context context = getApplicationContext();
        CharSequence text = "Incorrect input";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public boolean wordCheker(String word){
        char[]  chars = word.toCharArray();
        for (char i : chars){
            if (!Character.isLetter(i)){
                return false;
            }
        }
        return true;
    }


}
