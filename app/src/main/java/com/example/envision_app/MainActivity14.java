package com.example.envision_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
        findViewById(R.id.buttonBarChart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"OPENING BAR CHART", Toast.LENGTH_LONG).show();

                Intent intent=new Intent(MainActivity14.this , MainActivity15.class);

                startActivity(intent);

            }
        });

        findViewById(R.id.buttonPieChart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"OPENING PIE CHART", Toast.LENGTH_LONG).show();
                Intent intent=new Intent(MainActivity14.this , MainActivity22.class);

                startActivity(intent);

            }
        });

    }
}