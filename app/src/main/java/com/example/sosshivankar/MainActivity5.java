package com.example.sosshivankar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity5 extends AppCompatActivity {
    TextView complete3;
    TextView targetv;
    TextView runsv;
    TextView statusC;
    TextView piV;
    TextView ciV;
    public boolean batting = false;
    public int targ = 0;
    public int rns = 0;
    Random random = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        complete3 = findViewById(R.id.cleared3);
        targetv = findViewById(R.id.targetC);
        runsv = findViewById(R.id.ScoreP);
        statusC = findViewById(R.id.statementC);
        piV = findViewById(R.id.plaoutC);
        ciV = findViewById(R.id.botoutC);
        SharedPreferences sp = getSharedPreferences("vals",MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();
        if(sp.getBoolean("lvl4",false)){
            complete3.setText("$ You have already completed this level! (level-3)");
            complete3.setTextColor(Color.parseColor("#018786"));
        }
        else if(sp.getBoolean("lvl3tried",false)){
            complete3.setText("$ TRY AGAIN! You failed your last try...");
            complete3.setTextColor(Color.parseColor("#B00020"));
        }
    }
    public void play(int pi){
        int ci = random.nextInt(6)+1;
        SharedPreferences sp = getSharedPreferences("vals",MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();
        ed.putBoolean("lvl3tried",true);
        ed.apply();
        if(batting){
            if(pi==ci){
                Toast.makeText(this, "You Lost ! TRY AGAIN !", Toast.LENGTH_SHORT).show();
                finish();
            }
            else{
                rns += pi;
            }
        }
        else if(!batting){
            if(pi==ci){
                batting = true;
                Toast.makeText(this, "You Took Wicket, you are batting now!", Toast.LENGTH_SHORT).show();
                statusC.setText("You are batting now...");
            }
            else{
                targ += ci;
            }
        }
        if(rns>=targ && rns!=0){
            ed.putBoolean("lvl4",true);
            ed.apply();
            Toast.makeText(this, "You Won! You have unlocked level-4", Toast.LENGTH_SHORT).show();
            finish();
        }
        piV.setText(String.valueOf(pi));
        ciV.setText(String.valueOf(ci));
        targetv.setText("TARGET : "+targ);
        runsv.setText("RUNS : "+rns);
    }
    public void Eone(View view){
        play(1);
    }
    public void Etwo(View view){
        play(2);
    }
    public void Ethree(View view){
        play(3);
    }
    public void Efour(View view){
        play(4);
    }
    public void Efive(View view){
        play(5);
    }
    public void Esix(View view){
        play(6);
    }
}