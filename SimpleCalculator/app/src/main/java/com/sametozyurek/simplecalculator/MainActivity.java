package com.sametozyurek.simplecalculator;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    EditText editText2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sharedPreferences=getSharedPreferences("com.sametozyurek.simplecalculator",Context.MODE_PRIVATE);

        editText=findViewById(R.id.number1);
        editText2=findViewById(R.id.number2);
        textView=findViewById(R.id.sonuc);

        int userAge=20;
        sharedPreferences.edit().putInt("userAge1",userAge).apply();
        System.out.println(sharedPreferences.getInt("userAge1",0));
    }

    public void toplama(View view){

        if(editText.getText().toString().matches("") || editText2.getText().toString().matches("")) {

        }
        else {
            int a = Integer.parseInt(editText.getText().toString());
            int b = Integer.parseInt((editText2.getText().toString()));
            int result = a + b;
            textView.setText("Sonuç : " + result);
        }
    }

    public void cikarma(View view){
        if(editText.getText().toString().matches("") || editText2.getText().toString().matches("")) {

        }
        else {
            int a = Integer.parseInt(editText.getText().toString());
            int b = Integer.parseInt((editText2.getText().toString()));
            int result = a - b;
            textView.setText("Sonuç : " + result);
        }
    }

    public void carpma(View view){
        if(editText.getText().toString().matches("") || editText2.getText().toString().matches("")) {

        }
        else {
            int a = Integer.parseInt(editText.getText().toString());
            int b = Integer.parseInt((editText2.getText().toString()));
            int result = a * b;
            textView.setText("Sonuç : " + result);
        }
    }

    public void bolme(View view){
        if(editText.getText().toString().matches("") || editText2.getText().toString().matches("")) {

        }
        else {
            int a = Integer.parseInt(editText.getText().toString());
            int b = Integer.parseInt((editText2.getText().toString()));
            int result = a / b;
            textView.setText("Sonuç : " + result);
        }
    }
}
