package com.example.umstudentpublicbusroute;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button ePassenger;
    private Button eDriver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Passenger Button
//        ePassenger = findViewById(R.id.btnPassenger);
//        buttonPassenger.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                openMap();
//            }
//        });

        //Driver Button
        eDriver = findViewById(R.id.btnDriver);
        eDriver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You are a driver!", Toast.LENGTH_SHORT).show();

                //add a code to go to new activity
                Intent intent = new Intent(MainActivity.this, DriverLogin.class);
                startActivity(intent);
            }
        });

        //Images background
//        ImageView rapid = findViewById(R.id.picRapid);
        ImageView mrt = findViewById(R.id.picMRT);
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