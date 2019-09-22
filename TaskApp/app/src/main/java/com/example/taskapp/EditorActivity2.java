package com.example.taskapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class EditorActivity2 extends BaseActivity {

    ArrayList<Notes> notess = new ArrayList<>(2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor2);


        EditText titleTextView = findViewById(R.id.text_editText);
        String myTitle = titleTextView.getText().toString();

        EditText textTextView = findViewById(R.id.text_editText);
        String myText= textTextView.getText().toString();



        Button saveb = findViewById(R.id.save_button);
        saveb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EditorActivity2.this, MainActivity.class);
                intent.putExtra("title", myTitle);
                intent.putExtra("text", myText);
                startActivity(intent);
//                notess.add(new Notes(myTitle, myText));
//                Intent intent = new Intent(EditorActivity2.this, MainActivity.class);
//                startActivity(intent);
            }
        });

//        Intent intent3 = getIntent();
//        myTitle = intent3.getStringExtra("title");
//        myText = intent3.getStringExtra("text");
    }

//    public void save(View view){
//        EditText titleTextView = findViewById(R.id.text_editText);
//        String myTitle = titleTextView.getText().toString();
//
//        EditText textTextView = findViewById(R.id.text_editText);
//        String myText= textTextView.getText().toString();
//
//        notess.add(new Notes(myTitle, myText));
//        Intent intent = new Intent(EditorActivity2.this, MainActivity.class);
//        startActivity(intent);
//    }
}
