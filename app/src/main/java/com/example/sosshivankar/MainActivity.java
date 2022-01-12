package com.example.sosshivankar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static boolean access = true;
    public static boolean lvl1 = false;
    public static boolean lvl2 = false;
    public static boolean lvl3 = false;
    public static boolean lvl4 = false;
    public static boolean lvl3tried = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void page2(View view){
        if(access){
            Intent i = new Intent(this,MainActivity2.class);
            startActivity(i);
        }
        else{
            Toast.makeText(this, "ACCESS DENIED : You can no longer access this page!", Toast.LENGTH_SHORT).show();
        }

    }
    public void Llevel1(View view){
        if(lvl1){
            Intent i = new Intent(this,MainActivity3.class);
            startActivity(i);
        }
        else{
            Toast.makeText(this, "Level-1 Locked", Toast.LENGTH_SHORT).show();
        }
    }
    public void Llevel2(View view){
        if(lvl2){
            Intent i = new Intent(this,MainActivity4.class);
            startActivity(i);
        }
        else{
            Toast.makeText(this, "Level-2 Locked", Toast.LENGTH_SHORT).show();
        }
    }
    public void Llevel3(View view){
        if(lvl3){
            Intent i = new Intent(this,MainActivity5.class);
            startActivity(i);
        }
        else{
            Toast.makeText(this, "Level-3 Locked", Toast.LENGTH_SHORT).show();
        }
    }
    public void Llevel4(View view){
        Toast.makeText(this, "ACCESS DENIED : PAGE STILL UNDER CONSTRUCTION", Toast.LENGTH_SHORT).show();
    }
    public void Llevel5(View view){
        Toast.makeText(this, "ACCESS DENIED : PAGE STILL UNDER CONSTRUCTION", Toast.LENGTH_SHORT).show();
    }
    public void Llevel6(View view){
        Toast.makeText(this, "ACCESS DENIED : PAGE STILL UNDER CONSTRUCTION", Toast.LENGTH_SHORT).show();
    }
    public void Llevel7(View view){
        Toast.makeText(this, "ACCESS DENIED : PAGE STILL UNDER CONSTRUCTION", Toast.LENGTH_SHORT).show();
    }
    public void Llevel8(View view){
        Toast.makeText(this, "ACCESS DENIED : PAGE STILL UNDER CONSTRUCTION", Toast.LENGTH_SHORT).show();
    }
    public void Llevel9(View view){
        Toast.makeText(this, "ACCESS DENIED : PAGE STILL UNDER CONSTRUCTION", Toast.LENGTH_SHORT).show();
    }
    public void LlevelA(View view){
        Toast.makeText(this, "ACCESS DENIED : PAGE STILL UNDER CONSTRUCTION", Toast.LENGTH_SHORT).show();
    }
}