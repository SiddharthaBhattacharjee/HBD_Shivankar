package com.example.sosshivankar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity12 extends AppCompatActivity {
    TextView cleared10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        cleared10 = findViewById(R.id.cleared10);
        SharedPreferences sp = getSharedPreferences("vals",MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();
        if(sp.getBoolean("secret",false)){
            cleared10.setText("$ You have already cleared this level! (level-10)");
        }
    }
    public void unlockSecret(View view){
        SharedPreferences sp = getSharedPreferences("vals",MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();
        ed.putBoolean("secret",true);
        ed.apply();
        Toast.makeText(this, "Secret Level Unlocked! Go to home page to find it :D", Toast.LENGTH_SHORT).show();
    }
}