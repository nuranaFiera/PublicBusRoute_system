package com.example.umstudentpublicbusroute;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView rapid = findViewById(R.id.picRapid);
        ImageView mrt = findViewById(R.id.picMRT);


        Button buttonDriver = findViewById(R.id.buttonDriver);
        buttonDriver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openlogin();
            }
        });

        Button buttonPassenger = findViewById(R.id.buttonPassenger);
        /*buttonPassenger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMap();
            }
        });*/
    }

    public void openlogin(){
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("try","onStart");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("try","onResume");
    }
}