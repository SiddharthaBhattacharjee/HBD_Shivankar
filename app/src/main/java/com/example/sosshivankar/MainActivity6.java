package com.example.sosshivankar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {
    EditText answer2;
    TextView Clear4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        answer2 = findViewById(R.id.ans2);
        Clear4 = findViewById(R.id.cleared4);
        SharedPreferences sp = getSharedPreferences("vals",MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();
        if(sp.getBoolean("lvl5",false)){
            Clear4.setText("$ You have already cleared this level! (level-4)");
        }
    }
    public void check2(View view){
        String an2 = answer2.getText().toString();
        String disans2 = "mirror";
        if(an2.equals(disans2)){
            SharedPreferences sp = getSharedPreferences("vals",MODE_PRIVATE);
            SharedPreferences.Editor ed = sp.edit();
            ed.putBoolean("lvl5",true);
            ed.apply();
            Toast.makeText(this, "You Won!  You Unlocked Level-5", Toast.LENGTH_SHORT).show();
            finish();
        }
        else{
            Toast.makeText(this, "WRONG ANSWER ! PLEASE TRY AGAIN!", Toast.LENGTH_SHORT).show();
        }
    }
}