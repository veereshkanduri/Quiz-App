package edu.cpp.cs499.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view) {
        int score = 0;
        boolean[] answers = new boolean[4];
        RadioButton value1 = findViewById(R.id.q1_C_button);
        RadioButton value2 = findViewById(R.id.q2_C_button);
        RadioButton value3 = findViewById(R.id.q3_B_button);
        RadioButton value4 = findViewById(R.id.q4_A_button);

        answers[0] = value1.isChecked();
        answers[1] = value2.isChecked();
        answers[2] = value3.isChecked();
        answers[3] = value4.isChecked();

        for(boolean b:answers) {
            if (b){
                score++;
            }
        }
        String toastMessage = " You answered " + score + " correct out of 4 ";
        Toast.makeText(this, toastMessage,Toast.LENGTH_LONG).show();

    }
}
