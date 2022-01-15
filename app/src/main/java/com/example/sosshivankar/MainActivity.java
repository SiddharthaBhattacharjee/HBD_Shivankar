package com.example.sosshivankar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    public static boolean access = true;
//    public static boolean lvl1 = false;
//    public static boolean lvl2 = false;
//    public static boolean lvl3 = false;
//    public static boolean lvl4 = false;
//    public static boolean lvl3tried = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void page2(View view){
        SharedPreferences sp = getSharedPreferences("vals",MODE_PRIVATE);
        if(sp.getBoolean("access",true)){
            Intent i = new Intent(this,MainActivity2.class);
            startActivity(i);
        }
        else{
            Toast.makeText(this, "ACCESS DENIED : You can no longer access this page!", Toast.LENGTH_SHORT).show();
        }

    }
    public void Llevel1(View view){
        SharedPreferences sp = getSharedPreferences("vals",MODE_PRIVATE);
        if(sp.getBoolean("lvl1",false)){
            Intent i = new Intent(this,MainActivity3.class);
            startActivity(i);
        }
        else{
            Toast.makeText(this, "Level-1 Locked", Toast.LENGTH_SHORT).show();
        }
    }
    public void Llevel2(View view){
        SharedPreferences sp = getSharedPreferences("vals",MODE_PRIVATE);
        if(sp.getBoolean("lvl2",false)){
            Intent i = new Intent(this,MainActivity4.class);
            startActivity(i);
        }
        else{
            Toast.makeText(this, "Level-2 Locked", Toast.LENGTH_SHORT).show();
        }
    }
    public void Llevel3(View view){
        SharedPreferences sp = getSharedPreferences("vals",MODE_PRIVATE);
        if(sp.getBoolean("lvl3",false)){
            Intent i = new Intent(this,MainActivity5.class);
            startActivity(i);
        }
        else{
            Toast.makeText(this, "Level-3 Locked", Toast.LENGTH_SHORT).show();
        }
    }
    public void Llevel4(View view){
        SharedPreferences sp = getSharedPreferences("vals",MODE_PRIVATE);
        if(sp.getBoolean("lvl4",false)){
            Intent i = new Intent(this,MainActivity6.class);
            startActivity(i);
        }
        else{
            Toast.makeText(this, "Level-4 Locked", Toast.LENGTH_SHORT).show();
        }

    }
    public void Llevel5(View view){
        SharedPreferences sp = getSharedPreferences("vals",MODE_PRIVATE);
        if(sp.getBoolean("lvl5",false)){
            Intent i = new Intent(this,MainActivity7.class);
            startActivity(i);
        }
        else{
            Toast.makeText(this, "Level-5 Locked", Toast.LENGTH_SHORT).show();
        }
    }
    public void Llevel6(View view){
        SharedPreferences sp = getSharedPreferences("vals",MODE_PRIVATE);
        if(sp.getBoolean("lvl6",false)){
            Intent i = new Intent(this,MainActivity8.class);
            startActivity(i);
        }
        else{
            Toast.makeText(this, "Level-6 Locked", Toast.LENGTH_SHORT).show();
        }
    }
    public void Llevel7(View view){
        SharedPreferences sp = getSharedPreferences("vals",MODE_PRIVATE);
        if(sp.getBoolean("lvl7",false)){
            Intent i = new Intent(this,MainActivity9.class);
            startActivity(i);
        }
        else{
            Toast.makeText(this, "Level-7 Locked", Toast.LENGTH_SHORT).show();
        }
    }
    public void Llevel8(View view){
        SharedPreferences sp = getSharedPreferences("vals",MODE_PRIVATE);
        if(sp.getBoolean("lvl8",false)){
            Intent i = new Intent(this,MainActivity10.class);
            startActivity(i);
        }
        else{
            Toast.makeText(this, "Level-8 Locked", Toast.LENGTH_SHORT).show();
        }
    }
    public void Llevel9(View view){
        SharedPreferences sp = getSharedPreferences("vals",MODE_PRIVATE);
        if(sp.getBoolean("lvl9",false)){
            Intent i = new Intent(this,MainActivity11.class);
            startActivity(i);
        }
        else{
            Toast.makeText(this, "Level-9 Locked", Toast.LENGTH_SHORT).show();
        }
    }
    public void LlevelA(View view){
        Toast.makeText(this, "ACCESS DENIED : PAGE STILL UNDER CONSTRUCTION", Toast.LENGTH_SHORT).show();
    }
}