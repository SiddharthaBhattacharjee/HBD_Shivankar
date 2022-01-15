package com.example.sosshivankar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity9 extends AppCompatActivity {
    EditText answer7;
    TextView cleared7;
    TextView tl;
    TextView st;
    public int turns = 5;
    public int num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        cleared7 = findViewById(R.id.cleared7);
        answer7 = findViewById(R.id.ans7);
        tl = findViewById(R.id.turnsLeft);
        st = findViewById(R.id.statement9);
        Random random = new Random();
        num=random.nextInt(100)+1;
        SharedPreferences sp = getSharedPreferences("vals",MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();
        if(sp.getBoolean("lvl8",false)){
            cleared7.setText("$ You have already cleared this level! (level-7)");
            cleared7.setTextColor(Color.parseColor("#018786"));
        }
        else if(sp.getBoolean("lvl7tried",false)){
            cleared7.setText("$ TRY AGAIN! You failed your last try...");
            cleared7.setTextColor(Color.parseColor("#B00020"));
        }
    }
    public void play(int x){
        if(x==num){
            SharedPreferences sp = getSharedPreferences("vals",MODE_PRIVATE);
            SharedPreferences.Editor ed = sp.edit();
            ed.putBoolean("lvl8",true);
            ed.apply();
            Toast.makeText(this, "You Won! You have unlocked Level-8", Toast.LENGTH_SHORT).show();
            finish();
        }
        else if(x>num){
            st.setText("The Random number is LESS than "+x);
            turns--;
        }
        else if(x<num){
            st.setText("The Random number is GREATER than "+x);
            turns--;
        }
        tl.setText("TURNS LEFT : "+turns);
        if(turns<=0){
            Toast.makeText(this, "5 Turns Over, You Lost! Please Try Again", Toast.LENGTH_SHORT).show();
            finish();
        }
    }
    public void getinp7(View view){
        SharedPreferences sp = getSharedPreferences("vals",MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();
        ed.putBoolean("lvl7tried",true);
        ed.apply();
        String tv = answer7.getText().toString();
        int v = Integer.parseInt(tv);
        if(turns>0){
            play(v);
        }
        else{
            Toast.makeText(this, "5 Turns Over, You Lost! Please Try Again", Toast.LENGTH_SHORT).show();
            finish();
        }
    }
}