package com.example.sosshivankar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity8 extends AppCompatActivity {
    EditText answer6;
    TextView cleared6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        answer6 = findViewById(R.id.ans6);
        cleared6 = findViewById(R.id.cleared6);
        SharedPreferences sp = getSharedPreferences("vals",MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();
        if(sp.getBoolean("lvl7",false)){
            cleared6.setText("$ You have already cleared this level! (level-6)");
        }
    }
    public void check6(View view){
        String an6 = answer6.getText().toString();
        String disans6 = "shivankar,wasim,inam,debo,joysri,mukta,krishna,siddhartha,anamika,shainara";
        if(an6.equals(disans6)){
            SharedPreferences sp = getSharedPreferences("vals",MODE_PRIVATE);
            SharedPreferences.Editor ed = sp.edit();
            ed.putBoolean("lvl7",true);
            ed.apply();
            Toast.makeText(this, "You Won!  You Unlocked Level-7", Toast.LENGTH_SHORT).show();
            finish();
        }
        else{
            Toast.makeText(this, "WRONG ANSWER ! PLEASE TRY AGAIN!", Toast.LENGTH_SHORT).show();
        }
    }
}