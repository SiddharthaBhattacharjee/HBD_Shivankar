package com.example.sosshivankar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void kill(View view){
        Toast.makeText(this, "Level 1 Unlocked", Toast.LENGTH_SHORT).show();
        MainActivity.lvl1 = true;
        MainActivity.access = false;
        finish();
    }
}