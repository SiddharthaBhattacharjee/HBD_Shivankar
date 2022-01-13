package com.example.sosshivankar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity3 extends AppCompatActivity {
    public int score = 0;
    public int cc=0;
    Random random = new Random();
    TextView pout;
    TextView cout;
    TextView sc;
    TextView st;
    TextView comp1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        pout = findViewById(R.id.plaout);
        cout = findViewById(R.id.botout);
        sc = findViewById(R.id.score_2);
        st = findViewById(R.id.statement);
        comp1 = findViewById(R.id.cleared1);
        SharedPreferences sp = getSharedPreferences("vals",MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();
        if(sp.getBoolean("lvl2",false)){
            comp1.setText("$ YOU ALREADY CLEARED THIS LEVEL (LEVEL-1)!");
        }
    }
    public int rps(int p){
        String[] vals = {"error!","Rock","Paper","Scissor"};
        int c = random.nextInt(3)+1;
        cout.setText(vals[c]);
        //  p is user input and c is computer input
        // 1=rock , 2=paper , 3=scissor
        // p = c : tie ; p=c+1 : p win ; c=p+1 : c wins; p3&c1 : c wins ; p1&c3 : p wins
        if(p==c){
            return 0;
        }
        else if(p==c+1){
            return 1;
        }
        else if(c==p+1){
            return -1;
        }
        else if(p==3 && c==1){
            return -1;
        }
        else if(p==1 && c==3){
            return 1;
        }
        return 0;
    }
    public void rock(View view){
        int r = rps(1);
        pout.setText("Rock");
        if(r==1){
            st.setText("You Won the Round! ^-^");
            score += r;
        }
        else if(r==0){
            st.setText("The Round is a Tie! -_-");
            score += r;
        }
        else if(r==-1){
            st.setText("You Lost the Round! ;-;");
            score += r;
        }
        sc.setText(String.valueOf(score));
        if(score>=3){
            SharedPreferences sp = getSharedPreferences("vals",MODE_PRIVATE);
            SharedPreferences.Editor ed = sp.edit();
            ed.putBoolean("lvl2",true);
            ed.apply();
            Toast.makeText(this, "YOU WON ! Level-2 Unlocked", Toast.LENGTH_SHORT).show();
            finish();
        }
    }
    public void paper(View view){
        int r = rps(2);
        pout.setText("Paper");
        if(r==1){
            st.setText("You Won the Round! ^-^");
            score += r;
        }
        else if(r==0){
            st.setText("The Round is a Tie! -_-");
            score += r;
        }
        else if(r==-1){
            st.setText("You Lost the Round! ;-;");
            score += r;
        }
        sc.setText(String.valueOf(score));
        if(score>=3){
            SharedPreferences sp = getSharedPreferences("vals",MODE_PRIVATE);
            SharedPreferences.Editor ed = sp.edit();
            ed.putBoolean("lvl2",true);
            ed.apply();
            Toast.makeText(this, "YOU WON ! Level-2 Unlocked", Toast.LENGTH_SHORT).show();
            finish();
        }
    }
    public void scissor(View view){
        int r = rps(3);
        pout.setText("Scissor");
        if(r==1){
            st.setText("You Won the Round! ^-^");
            score += r;
        }
        else if(r==0){
            st.setText("The Round is a Tie! -_-");
            score += r;
        }
        else if(r==-1){
            st.setText("You Lost the Round! ;-;");
            score += r;
        }
        sc.setText(String.valueOf(score));
        if(score>=3){
            SharedPreferences sp = getSharedPreferences("vals",MODE_PRIVATE);
            SharedPreferences.Editor ed = sp.edit();
            ed.putBoolean("lvl2",true);
            ed.apply();
            Toast.makeText(this, "YOU WON ! Level-2 Unlocked", Toast.LENGTH_SHORT).show();
            finish();
        }
    }
    public void cheat1(View view){
        cc += 1;
        if(cc>=25){
            score = 10;
        }
    }
}
