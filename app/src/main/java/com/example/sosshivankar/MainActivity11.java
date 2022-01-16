package com.example.sosshivankar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity11 extends AppCompatActivity {
    EditText ans9;
    TextView cleared9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        cleared9 = findViewById(R.id.cleared9);
        ans9 = findViewById(R.id.ans_9);
        SharedPreferences sp = getSharedPreferences("vals",MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();
        if(sp.getBoolean("lvl10",false)){
            cleared9.setText("$ You have already cleared this level! (level-9)");
        }
    }
    public void check9(View view){
        String an9 = ans9.getText().toString();
        String disans9 = "siddhartha_bhattacharjee_9101440757";
        if(an9.equals(disans9)){
            SharedPreferences sp = getSharedPreferences("vals",MODE_PRIVATE);
            SharedPreferences.Editor ed = sp.edit();
            ed.putBoolean("lvl10",true);
            ed.apply();
            Toast.makeText(this, "You Won!  You Unlocked Level-10", Toast.LENGTH_SHORT).show();
            finish();
        }
        else{
            Toast.makeText(this, "WRONG PassWord ! PLEASE TRY AGAIN!", Toast.LENGTH_SHORT).show();
        }
    }
}