package com.example.belotecounter;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CreateActivity extends AppCompatActivity {

    public int Objective;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
    }

    public void setObjectiveTo501(View view) {
        this.Objective = 501;
        // Forcer la valeur "false" pour le toggle switch 1001 pts
    }

    public void setObjectiveTo1001(View view) {
        this.Objective = 1001;
        // Forcer la valeur "false" pour le toggle switch 501 pts
    }

    void LogData(String data) {
        Toast.makeText(CreateActivity.this, data, Toast.LENGTH_SHORT).show();
        Log.d("TAG", data);
    }

}
