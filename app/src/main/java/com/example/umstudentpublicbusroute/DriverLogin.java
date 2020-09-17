package com.example.umstudentpublicbusroute;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DriverLogin extends AppCompatActivity {

    private Button eLogin;
    private Button eToRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_login);

        //Driver Login

        //To Driver Register
        eToRegister = findViewById(R.id.btnCreateAcc);
        eToRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DriverLogin.this, "Time to Register", Toast.LENGTH_SHORT).show();

                //Code to new Activity (Driver Register)
                Intent intent = new Intent(DriverLogin.this, DriverRegister.class);
                startActivity(intent);
            }
        });
    }
}