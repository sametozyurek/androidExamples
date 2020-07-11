package com.sametozyurek.storingdata;


import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences sharedPreferences=this.getSharedPreferences("com.sametozyurek.storingdata",Context.MODE_PRIVATE);

        String name="Jorge";
        sharedPreferences.edit().putString("userName",name).apply();
        String savedName=sharedPreferences.getString("userName","null");
        System.out.println("saved value : "+savedName);

        name="Mike";
        sharedPreferences.edit().putString("userName",name).apply();
        String savedName2=sharedPreferences.getString("userName","null");
        System.out.println("saved value : "+savedName2);

        sharedPreferences.edit().remove("userName").apply();
        String savedName3=sharedPreferences.getString("userName","null");
        System.out.println("saved value : "+savedName3);
    }
}
