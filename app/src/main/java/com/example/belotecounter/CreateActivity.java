package com.example.belotecounter;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CreateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
    }

    public void goNext(View view) {
        Intent intent = new Intent(this, GameActivity.class);
        int id = ((RadioGroup)findViewById(R.id.radioButtonObjectiveOptions)).getCheckedRadioButtonId();
        int objective = getObjective(id);
        if (objective == -1) {
            Toast.makeText(this, "Veuillez sélectionner un objectif", Toast.LENGTH_SHORT).show();
            return;
        }

        String nameTeamA = ((EditText)findViewById(R.id.editTextNameA)).getText().toString();
        if (nameTeamA.equals("")) nameTeamA = getString(R.string.teamA);
        String nameTeamB = ((EditText)findViewById(R.id.editTextNameB)).getText().toString();
        if (nameTeamB.equals("")) nameTeamB = getString(R.string.teamB);
        intent.putExtra(Intent.EXTRA_TEXT, nameTeamA+"/"+nameTeamB+"/"+objective);
        startActivity(intent);
    }

    private int getObjective(int id) {
        switch(id) {
            case R.id.radioButtonObj501:
                return 501;
            case R.id.radioButtonObj1001:
                return 1001;
            default :
                return -1;
        }
    }
}
