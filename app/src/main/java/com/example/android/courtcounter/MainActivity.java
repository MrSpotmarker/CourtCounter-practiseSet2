package com.example.android.courtcounter;


import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static android.media.CamcorderProfile.get;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulsTeamA = 0;
    int foulsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Add goal to Team A score.
     */
    public void addGoalForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Add foul to Team A score.
     */
    public void addFoulForTeamA(View v) {
        foulsTeamA = foulsTeamA + 1;
        displayFoulsForTeamA(foulsTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given fouls for Team A.
     */
    public void displayFoulsForTeamA(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(fouls));
    }

    /**
     * Add goal to Team B score.
     */
    public void addGoalForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add foul to Team B fouls.
     */
    public void addFoulForTeamB(View v) {
        foulsTeamB = foulsTeamB + 1;
        displayFoulsForTeamB(foulsTeamB);
    }

    /**
     * Displays the given fouls for Team B.
     */
    public void displayFoulsForTeamB(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
        scoreView.setText(String.valueOf(fouls));
    }

    /**
     * Resets scores.
     */
    public void resetScores(View v) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
        displayFoulsForTeamA(foulsTeamA);
        displayFoulsForTeamB(foulsTeamB);
    }
}

