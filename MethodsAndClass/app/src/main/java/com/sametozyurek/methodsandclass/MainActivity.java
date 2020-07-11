package com.sametozyurek.methodsandclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yazdir();
        System.out.println(islem(5,7));
        phone();
        school();
    }

    public void yazdir(){
        String isim="Samet";
        System.out.println(isim);
    }

    public int islem(int a,int b){
        return a*b;
    }

    public void phone(){
        Models phoneModels=new Models("Samsung",2400);
    }

    public void school(){
        Students student=new Students("Samet",20,"Computer Scientist");
        System.out.println(student.getName());
        System.out.println(student.getDepartment());
        student.setDepartment("Software developer");
        System.out.println(student.getDepartment());
    }
}
