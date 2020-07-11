package com.sametozyurek.intentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView welcome=findViewById(R.id.twWelcome);

        Intent intent=getIntent();
        String value=intent.getStringExtra("name");
        welcome.setText("Welcome "+value);
    }
}
