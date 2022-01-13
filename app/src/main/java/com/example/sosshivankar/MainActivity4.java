package com.example.sosshivankar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    EditText answer1;
    TextView clear2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        answer1 = findViewById(R.id.ans_1);
        clear2 = findViewById(R.id.cleared2);
        SharedPreferences sp = getSharedPreferences("vals",MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();
        if(sp.getBoolean("lvl3",false)){
            clear2.setText("$ You have already cleared this level! (level-2)");
        }
    }
    public void check1(View view){
        String an1 = answer1.getText().toString();
        String disans1 = "the_bat_is_not_a_toy_its_a_weapon";
        if(an1.equals(disans1)){
            SharedPreferences sp = getSharedPreferences("vals",MODE_PRIVATE);
            SharedPreferences.Editor ed = sp.edit();
            ed.putBoolean("lvl3",true);
            ed.apply();
            Toast.makeText(this, "You Won!  You Unlocked Level-3", Toast.LENGTH_SHORT).show();
            finish();
        }
        else{
            Toast.makeText(this, "WRONG ANSWER ! PLEASE TRY AGAIN!", Toast.LENGTH_SHORT).show();
        }
    }
}