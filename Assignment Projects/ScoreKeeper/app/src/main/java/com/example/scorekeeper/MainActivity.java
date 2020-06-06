package com.example.scorekeeper;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int goalsTeamA = 0;
    int goalsTeamB = 0;
    int foulsTeamA = 0;
    int foulsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Method to add a goal to Team A
    public void addGoalTeamA(View v) {
        goalsTeamA = goalsTeamA + 1;
        displayGoalsTeamA(goalsTeamA);
    }
    //Method to add a goal to Team B
    public void addGoalTeamB(View v) {
        goalsTeamB = goalsTeamB + 1;
        displayGoalsTeamB(goalsTeamB);
    }
    //Method to add a goal to Team A for free/penalty kick
    public void addGoalFromFoulTeamA(View v) {
        goalsTeamA = goalsTeamA + 1;
        displayGoalsTeamA(goalsTeamA);
    }
    //Method to add a goal to Team B for free/penalty kick
    public void addGoalFromFoulTeamB(View v) {
        goalsTeamB = goalsTeamB + 1;
        displayGoalsTeamB(goalsTeamB);
    }
    //Method to add a foul to Team A
    public void addFoulTeamA(View v) {
        foulsTeamA = foulsTeamA + 1;
        displayFoulsTeamA(foulsTeamA);
    }
    //Method to add a foul to Team B
    public void addFoulTeamB(View v) {
        foulsTeamB = foulsTeamB + 1;
        displayFoulsTeamB(foulsTeamB);
    }
    // Resets the score
    public void resetScore(View v) {
        goalsTeamA = 0;
        goalsTeamB = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;
        displayGoalsTeamA(goalsTeamA);
        displayGoalsTeamB(goalsTeamB);
        displayFoulsTeamA(foulsTeamA);
        displayFoulsTeamB(foulsTeamB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayGoalsTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayGoalsTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given fouls for Team A.
     */
    public void displayFoulsTeamA(int fouls) {
        TextView foulView = (TextView) findViewById(R.id.team_a_fouls);
        foulView.setText(String.valueOf(fouls));
    }
    /**
     * Displays the given fouls for Team B.
     */
    public void displayFoulsTeamB(int fouls) {
        TextView foulView = (TextView) findViewById(R.id.team_b_fouls);
        foulView.setText(String.valueOf(fouls));
    }

}

