package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
/*    Total points scored in the quiz and each question carries a score of 10
      Checking whether the options selected by the user are correct or not and scoring them apropriately
 */
    public void totalScored(View view) {
        EditText text = (EditText) findViewById(R.id.answer_one);
        String ans1 = text.getText().toString().toUpperCase();
        if(ans1.equals("STRING")) {
            score += 10;
        }
        CheckBox q2cb1 = (CheckBox) findViewById(R.id.q2opt1);
        boolean q2option1 = q2cb1.isChecked();
        CheckBox q2cb2 = (CheckBox) findViewById(R.id.q2opt2);
        boolean q2option2 = q2cb2.isChecked();
        CheckBox q2cb3 = (CheckBox) findViewById(R.id.q2opt3);
        boolean q2option3 = q2cb3.isChecked();
        CheckBox q2cb4 = (CheckBox) findViewById(R.id.q2opt4);
        boolean q2option4 = q2cb4.isChecked();
        if(q2option1 == true && q2option2 == true && q2option3 == true && q2option4 == false)
        {
            score += 10;
        }
        RadioButton q3 = (RadioButton) findViewById(R.id.q3opt2);
        boolean q3option2 = q3.isChecked();
        if(q3option2 == true)
        {
            score += 10;
        }
        RadioButton q4 = (RadioButton) findViewById(R.id.q4opt1);
        boolean q4option1 = q4.isChecked();
        if(q4option1 == true)
        {
            score += 10;
        }
        CheckBox q5cb1 = (CheckBox) findViewById(R.id.q5opt1);
        boolean q5option1 = q5cb1.isChecked();
        CheckBox q5cb2 = (CheckBox) findViewById(R.id.q5opt2);
        boolean q5option2 = q5cb2.isChecked();
        CheckBox q5cb3 = (CheckBox) findViewById(R.id.q5opt3);
        boolean q5option3 = q5cb3.isChecked();
        CheckBox q5cb4 = (CheckBox) findViewById(R.id.q5opt4);
        boolean q5option4 = q5cb4.isChecked();
        if(q5option1 == false && q5option2 == true && q5option3 == false && q5option4 == true)
        {
            score += 10;
        }
        int correctAns = score/10;
        if(score != 50) {
            Toast.makeText(this, " You have chosen : " + correctAns + " correct answers and score is: " + score, Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Congratulations, You have received the highest score", Toast.LENGTH_LONG).show();
        }
        resetQuiz();
    }

    // Resets the quiz once it is submitted and scores are received
    private void resetQuiz() {
        score  = 0;
        EditText text = (EditText) findViewById(R.id.answer_one);
        text.setText("");
        CheckBox q2cb1 = (CheckBox) findViewById(R.id.q2opt1);
        q2cb1.setChecked(false);
        CheckBox q2cb2 = (CheckBox) findViewById(R.id.q2opt2);
        q2cb2.setChecked(false);
        CheckBox q2cb3 = (CheckBox) findViewById(R.id.q2opt3);
        q2cb3.setChecked(false);
        CheckBox q2cb4 = (CheckBox) findViewById(R.id.q2opt4);
        q2cb4.setChecked(false);
        RadioGroup radiogroupone  = (RadioGroup) findViewById(R.id.rg1);
        radiogroupone.clearCheck();
        RadioGroup radiogrouptwo  = (RadioGroup) findViewById(R.id.rg2);
        radiogrouptwo.clearCheck();
        CheckBox q5cb1 = (CheckBox) findViewById(R.id.q5opt1);
        q5cb1.setChecked(false);
        CheckBox q5cb2 = (CheckBox) findViewById(R.id.q5opt2);
        q5cb2.setChecked(false);
        CheckBox q5cb3 = (CheckBox) findViewById(R.id.q5opt3);
        q5cb3.setChecked(false);
        CheckBox q5cb4 = (CheckBox) findViewById(R.id.q5opt4);
        q5cb4.setChecked(false);

    }
}
