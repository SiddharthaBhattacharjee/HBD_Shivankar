package com.example.sosshivankar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
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
        SharedPreferences sp = getSharedPreferences("vals",MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();
        Toast.makeText(this, "Level 1 Unlocked", Toast.LENGTH_SHORT).show();
//        MainActivity.lvl1 = true;
        ed.putBoolean("lvl1",true);
        ed.apply();
//        MainActivity.access = false;
        ed.putBoolean("access",false);
        ed.apply();
        finish();
    }
}