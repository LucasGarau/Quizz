package com.example.quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> answers;
    List<String> questions;
    int i=0;
   private TextView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answers = new ArrayList<String>();
        answers.add("true");
        answers.add("false");
        answers.add("true");
        answers.add("true");
        answers.add("false");

        questions = new ArrayList<String>();
        questions.add("Es la manzana roja");
        questions.add("Es el cielo rojo");
        questions.add("Es el agua roja");
        questions.add("Es el ielo   roja");
        questions.add("Es la manzana roja");
        v =findViewById(R.id.view);
       v.setText(questions.get(0));

    }
    public void next(View view){
        if (i<5) {
            i += 1;
            v =findViewById(R.id.view);
            v.setText(questions.get(i));
        }
    }
    public void previous(View view){
        if (0<i) {
            i -= 1;
            v = findViewById(R.id.view);
            v.setText(questions.get(i));
        }
    }

    public void truee(View view){
        if (answers.get(i).equals("true")) {
            Toast toast1 = Toast.makeText(getApplicationContext(), "correcto", Toast.LENGTH_SHORT);
            toast1.show();
        }else {
            Toast toast2 = Toast.makeText(getApplicationContext(), "fallo", Toast.LENGTH_SHORT);
            toast2.show();
        }

        }

    public void falsee(View view){
        if (answers.get(i).equals("false")) {
            Toast toast1 = Toast.makeText(getApplicationContext(), "correcto", Toast.LENGTH_SHORT);
            toast1.show();
        }else {
            Toast toast2 = Toast.makeText(getApplicationContext(), "fallo", Toast.LENGTH_SHORT);
            toast2.show();
        }

    }

}
