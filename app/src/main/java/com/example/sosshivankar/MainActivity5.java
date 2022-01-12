package com.example.sosshivankar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
        if(MainActivity.lvl4){
            complete3.setText("$ You have already completed this level! (level-3)");
        }
        else if(MainActivity.lvl3tried){
            complete3.setText("$ TRY AGAIN! You failed your last try...");
        }
    }
    public void play(int pi){
        int ci = random.nextInt(6)+1;
        MainActivity.lvl3tried = true;
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
            MainActivity.lvl4 = true;
            Toast.makeText(this, "You Won! You have unlocked level-4", Toast.LENGTH_SHORT).show();
            finish();
        }
        piV.setText(String.valueOf(pi));
        ciV.setText(String.valueOf(ci));
        targetv.setText(String.valueOf(targ));
        runsv.setText(String.valueOf(rns));
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