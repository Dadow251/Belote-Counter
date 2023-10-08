package com.example.belotecounter;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void LogData(String data) {
        Toast.makeText(MainActivity.this, data, Toast.LENGTH_SHORT).show();
        Log.d("TAG", data);
    }

    public void createGame(View view) {
        LogData("Création d'une nouvelle partie");
    }

}
