package com.example.sosshivankar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity10 extends AppCompatActivity {
    TextView cleared8;
    TextView status8;
    TextView pi;
    TextView bi;
    boolean attack = true;
    int attackmode = 0;
    int attackturn = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        cleared8 = findViewById(R.id.cleared8);
        status8 = findViewById(R.id.status8);
        pi = findViewById(R.id.playerchoiceHW);
        bi = findViewById(R.id.botchoiceHW);
        SharedPreferences sp = getSharedPreferences("vals",MODE_PRIVATE);
        if(sp.getBoolean("lvl9",false)){
            cleared8.setText("$ You have already cleared this level! (level-8)");
            cleared8.setTextColor(Color.parseColor("#018786"));
        }
        else if(sp.getBoolean("lvl8tried",false)){
            cleared8.setText("$ TRY AGAIN! You failed your last try...");
            cleared8.setTextColor(Color.parseColor("#B00020"));
        }
    }
    public void playHW(int x){
        Random random = new Random();
        if(attackmode==0){
            int y = random.nextInt(3)+1;
            bi.setText(String.valueOf(y));
            pi.setText(String.valueOf(x));
            if(x==y){
                attack = !attack;
                attackturn = 1;
                attackmode = 0;
            }
            else{
                attackturn++;
            }
            if(attackturn>3){
                attackmode++;
            }
        }
        else if(attackmode==1){
            int y = random.nextInt(2)+1;
            bi.setText(String.valueOf(y));
            pi.setText(String.valueOf(x));
            if(x==y){
                attack = !attack;
                attackturn = 1;
                attackmode = 0;
            }
            else{
                attackmode++;
            }
        }
        else if(attackmode==2){
            int y = random.nextInt(2)+1;
            bi.setText(String.valueOf(y));
            pi.setText(String.valueOf(x));
            if(x==y){
                attack = !attack;
                attackturn = 1;
                attackmode = 0;
            }
            else{
                if(attack){
                    Toast.makeText(this, "You Won! You unlocked Level-9", Toast.LENGTH_SHORT).show();
                    SharedPreferences sp = getSharedPreferences("vals",MODE_PRIVATE);
                    SharedPreferences.Editor ed = sp.edit();
                    ed.putBoolean("lvl9",true);
                    ed.apply();
                    finish();
                }
                else{
                    Toast.makeText(this, "You Lost! Please Try again!", Toast.LENGTH_SHORT).show();
                    SharedPreferences sp = getSharedPreferences("vals",MODE_PRIVATE);
                    SharedPreferences.Editor ed = sp.edit();
                    ed.putBoolean("lvl8tried",true);
                    ed.apply();
                    finish();
                }
            }
        }
        if(attack){
            if(attackmode==0){
                status8.setText("Your Attack, Turn : "+attackturn);
            }
            if(attackmode==1){
                status8.setText("Your Pinup");
            }
            if(attackmode==2){
                status8.setText("Your Finishing Move");
            }
        }
        else if(!attack){
            if(attackmode==0){
                status8.setText("Opponent\'s Attack, Turn : "+attackturn);
            }
            if(attackmode==1){
                status8.setText("Opponent\'s Pinup");
            }
            if(attackmode==2){
                status8.setText("Opponent\'s Finishing Move");
            }
        }
    }

    public void attack1(View view){
        if(attackmode==0){
            playHW(1);
        }
        else{
            Toast.makeText(this, "You/Opponent Are not in attack mode!", Toast.LENGTH_SHORT).show();
        }
    }
    public void attack2(View view){
        if(attackmode==0){
            playHW(2);
        }
        else{
            Toast.makeText(this, "You/Opponent Are not in attack mode!", Toast.LENGTH_SHORT).show();
        }
    }
    public void attack3(View view){
        if(attackmode==0){
            playHW(3);
        }
        else{
            Toast.makeText(this, "You/Opponent Are not in attack mode!", Toast.LENGTH_SHORT).show();
        }
    }

    public void pinup1(View view){
        if(attackmode==1){
            playHW(1);
        }
        else{
            Toast.makeText(this, "You/Opponent Are not in pinup mode!", Toast.LENGTH_SHORT).show();
        }
    }
    public void pinup2(View view){
        if(attackmode==1){
            playHW(2);
        }
        else{
            Toast.makeText(this, "You/Opponent Are not in pinup mode!", Toast.LENGTH_SHORT).show();
        }
    }

    public void finishmove1(View view){
        if(attackmode==2){
            playHW(1);
        }
        else{
            Toast.makeText(this, "You/Opponent Are not in Finishing move mode!", Toast.LENGTH_SHORT).show();
        }
    }
    public void finishmove2(View view){
        if(attackmode==2){
            playHW(2);
        }
        else{
            Toast.makeText(this, "You/Opponent Are not in Finishing move mode!", Toast.LENGTH_SHORT).show();
        }
    }

}