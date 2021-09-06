package com.example.envision_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"you selected CURRICULUM", Toast.LENGTH_LONG).show();
                startActivity(new Intent(getApplicationContext(), MainActivity28.class));

            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"you selected  GPA", Toast.LENGTH_LONG).show();
                startActivity(new Intent(getApplicationContext(), MainActivity12.class));

            }
        });

        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"you selected CGPA", Toast.LENGTH_LONG).show();
                startActivity(new Intent(getApplicationContext(), MainActivity13.class));

            }
        });
        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"you selected CREDITS", Toast.LENGTH_LONG).show();
                startActivity(new Intent(getApplicationContext(), MainActivity11.class));
            }
        });

        findViewById(R.id.button6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"you selected TEACHERS", Toast.LENGTH_LONG).show();
                startActivity(new Intent(getApplicationContext(), MainActivity14.class));
            }
        });
        findViewById(R.id.button7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"you selected SEARCH", Toast.LENGTH_LONG).show();
                startActivity(new Intent(getApplicationContext(), MainActivity32.class));
            }
        });
    }
}