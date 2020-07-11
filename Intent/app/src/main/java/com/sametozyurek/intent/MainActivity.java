package com.sametozyurek.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeActivity(View view){
        userName=findViewById(R.id.editText);

        Intent intent =new Intent(getApplicationContext(),Main2Activity.class);
        intent.putExtra("name",userName.getText().toString());

        startActivity(intent);
    }
}
