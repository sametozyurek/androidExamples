package com.sametozyurek.intentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText userName;
    EditText password;
    TextView twAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void checkSignIn(View view){
        userName=findViewById(R.id.etUserName);
        password=findViewById(R.id.etPassword);

        if(userName.getText().toString().equals("Soru1") && password.getText().toString().equals("Cevap")){
            Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
            intent.putExtra("name",userName.getText().toString());
            startActivity(intent);
        }

        else{
            twAlert=findViewById(R.id.alert);
            twAlert.setText("Failed to login.");
        }
    }
}
