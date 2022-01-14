package com.example.sosshivankar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {
    EditText answer5;
    TextView cleared5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        answer5 = findViewById(R.id.ans5);
        cleared5 = findViewById(R.id.cleared5);
        SharedPreferences sp = getSharedPreferences("vals",MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();
        if(sp.getBoolean("lvl6",false)){
            cleared5.setText("$ You have already cleared this level! (level-5)");
        }
    }
    public void check5(View view){
        String an5 = answer5.getText().toString();
        String disans5 = "computerscience";
        if(an5.equals(disans5)){
            SharedPreferences sp = getSharedPreferences("vals",MODE_PRIVATE);
            SharedPreferences.Editor ed = sp.edit();
            ed.putBoolean("lvl6",true);
            ed.apply();
            Toast.makeText(this, "You Won!  You Unlocked Level-6", Toast.LENGTH_SHORT).show();
            finish();
        }
        else{
            Toast.makeText(this, "WRONG ANSWER ! PLEASE TRY AGAIN!", Toast.LENGTH_SHORT).show();
        }
    }
}