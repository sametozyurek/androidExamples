package com.sametozyurek.landmarkbook;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    static Bitmap selectedImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=findViewById(R.id.listView);

        Bitmap bjk=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.bjk);
        Bitmap basak=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.basaksehir);
        Bitmap ts=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.trabzonspor);
        Bitmap kp=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.kasim);

        final ArrayList<String> landmarkList=new ArrayList<>();
        final ArrayList<Bitmap> landmarkImages=new ArrayList<>();

        landmarkImages.add(bjk);
        landmarkImages.add(basak);
        landmarkImages.add(ts);
        landmarkImages.add(kp);

        landmarkList.add("Beşiktaş");
        landmarkList.add("Başakşehir");
        landmarkList.add("TrabzonSpor");
        landmarkList.add("Kasımpaşa");

        ArrayAdapter arrayAdapter=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,landmarkList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, final int position, long id) {
                AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity.this);
                alert.setTitle("Delete Team");
                alert.setMessage("Dou you want to delete this team?");
                alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"Deleted",Toast.LENGTH_LONG).show();
                    }
                });

                alert.show();
                return false;
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(getApplicationContext(),DetailsActivity.class);
                intent.putExtra("name",landmarkList.get(position));

                //selectedImage=landmarkImages.get(position);

                Bitmap bitmap=landmarkImages.get(position);
                Globals globals=Globals.getInstance();
                globals.setData(bitmap);

                startActivity(intent);
            }
        });
    }
}
