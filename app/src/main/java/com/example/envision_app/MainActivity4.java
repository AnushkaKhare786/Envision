package com.example.envision_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"you selected CSE - CORE", Toast.LENGTH_LONG).show();
                startActivity(new Intent(getApplicationContext(), MainActivity5.class));

            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"you selected  CSE - CYBER", Toast.LENGTH_LONG).show();
                startActivity(new Intent(getApplicationContext(), MainActivity6.class));

            }
        });

        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"you selected CSE - AI ML", Toast.LENGTH_LONG).show();
                startActivity(new Intent(getApplicationContext(), MainActivity7.class));

            }
        });
        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"you selected CSE - GAMING", Toast.LENGTH_LONG).show();
                startActivity(new Intent(getApplicationContext(), MainActivity8.class));
            }
        });

        findViewById(R.id.button6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"you selected BIO-ENGINEERING", Toast.LENGTH_LONG).show();
                startActivity(new Intent(getApplicationContext(), MainActivity9.class));
            }
        });
        findViewById(R.id.button7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"you selected M.TECH INTEGRATED WITH AI", Toast.LENGTH_LONG).show();
                startActivity(new Intent(getApplicationContext(), MainActivity10.class));
            }
        });
    }
}