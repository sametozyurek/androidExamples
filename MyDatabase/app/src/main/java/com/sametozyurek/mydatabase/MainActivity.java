package com.sametozyurek.mydatabase;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.sql.SQLDataException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{

            SQLiteDatabase myDatabase=this.openOrCreateDatabase("Students",MODE_PRIVATE,null);

            myDatabase.execSQL("CREATE TABLE IF NOT EXISTS students(name VARCHAR,age INT(2))");

            //myDatabase.execSQL("INSERT INTO students (name,age) VALUES('Samet',21)");

            //myDatabase.execSQL("INSERT INTO students (name,age) VALUES('Peteknaz',9)");

            //myDatabase.execSQL("INSERT INTO students (name,age) VALUES('Meliksah',7)");

            //myDatabase.execSQL("DELETE FROM students WHERE age>10");

            //myDatabase.execSQL("UPDATE students SET age=10 WHERE name='Peteknaz'");

            Cursor cursor =myDatabase.rawQuery("SELECT * from students ",null);

            int nameIx=cursor.getColumnIndex("name");

            int ageIx=cursor.getColumnIndex("age");

            cursor.moveToFirst();

            while (cursor!=null){
                System.out.println("Name : "+cursor.getString(nameIx));
                System.out.println("Age : "+cursor.getString(ageIx));

                cursor.moveToNext();
            }

        }catch (Exception e){

            e.printStackTrace();
        }
    }
}
