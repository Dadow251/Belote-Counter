package com.example.belotecounter;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GameActivity extends AppCompatActivity {

    String nameTeamA;
    String nameTeamB;
    int objective;
    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Intent intent = getIntent();
        String message = intent.getStringExtra(Intent.EXTRA_TEXT);
        String[] messages = message.split("/");
        nameTeamA = messages[0];
        nameTeamB = messages[1];
        objective = Integer.parseInt(messages[2]);

        ((TextView)findViewById(R.id.textViewNameTeamA)).setText(nameTeamA);
        ((TextView)findViewById(R.id.textViewNameTeamB)).setText(nameTeamB);
        ((TextView)findViewById(R.id.textViewScoreA)).setText(""+scoreA);
        ((TextView)findViewById(R.id.textViewScoreB)).setText(""+scoreB);
        ((TextView)findViewById(R.id.textViewObjPts)).setText(""+objective);
    }

}
