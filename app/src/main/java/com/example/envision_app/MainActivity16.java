package com.example.envision_app;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity16 extends AppCompatActivity {

    TextView tv,tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10;
    ViewGroup tContainer;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);
        tv = (TextView) findViewById(R.id.tv);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        tv5 = (TextView) findViewById(R.id.tv5);
        tv6 = (TextView) findViewById(R.id.tv6);
        tv7 = (TextView) findViewById(R.id.tv7);
        tv8 = (TextView) findViewById(R.id.tv8);
        tv9 = (TextView) findViewById(R.id.tv9);
        tv10 = (TextView) findViewById(R.id.tv10);
        b = (Button)findViewById(R.id.btn);
        tContainer = findViewById(R.id.transitionContainer);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"loading....", Toast.LENGTH_LONG).show();

                Intent intent=new Intent(MainActivity16.this , MainActivity5.class);

                startActivity(intent);

            }
        });

        tv1.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tContainer);
                visible = !visible;tv6.setVisibility(visible ? View.VISIBLE: View.GONE);
                tv2.setVisibility(View.INVISIBLE);
                tv3.setVisibility(View.INVISIBLE);
                tv4.setVisibility(View.INVISIBLE);
                tv5.setVisibility(View.INVISIBLE);
                tv.setVisibility(View.INVISIBLE);


            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tContainer);
                visible = !visible;tv7.setVisibility(visible ? View.VISIBLE: View.GONE);
                tv1.setVisibility(View.INVISIBLE);
                tv3.setVisibility(View.INVISIBLE);
                tv4.setVisibility(View.INVISIBLE);
                tv5.setVisibility(View.INVISIBLE);
                tv.setVisibility(View.INVISIBLE);


            }
        });

        tv3.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tContainer);
                visible = !visible;tv8.setVisibility(visible ? View.VISIBLE: View.GONE);
                tv1.setVisibility(View.INVISIBLE);
                tv2.setVisibility(View.INVISIBLE);
                tv4.setVisibility(View.INVISIBLE);
                tv5.setVisibility(View.INVISIBLE);
                tv.setVisibility(View.INVISIBLE);


            }
        });

        tv4.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tContainer);
                visible = !visible;tv9.setVisibility(visible ? View.VISIBLE: View.GONE);
                tv1.setVisibility(View.INVISIBLE);
                tv3.setVisibility(View.INVISIBLE);
                tv2.setVisibility(View.INVISIBLE);
                tv5.setVisibility(View.INVISIBLE);
                tv.setVisibility(View.INVISIBLE);


            }
        });
        tv5.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tContainer);
                visible = !visible;tv10.setVisibility(visible ? View.VISIBLE: View.GONE);
                tv1.setVisibility(View.INVISIBLE);
                tv3.setVisibility(View.INVISIBLE);
                tv4.setVisibility(View.INVISIBLE);
                tv2.setVisibility(View.INVISIBLE);
                tv.setVisibility(View.INVISIBLE);


            }
        });
        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"loading....", Toast.LENGTH_LONG).show();

                Intent intent=new Intent(MainActivity16.this , MainActivity16.class);

                startActivity(intent);

            }
        });
        tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"loading....", Toast.LENGTH_LONG).show();

                Intent intent=new Intent(MainActivity16.this , MainActivity16.class);

                startActivity(intent);

            }
        });
        tv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"loading....", Toast.LENGTH_LONG).show();

                Intent intent=new Intent(MainActivity16.this , MainActivity16.class);

                startActivity(intent);

            }
        });
        tv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"loading....", Toast.LENGTH_LONG).show();

                Intent intent=new Intent(MainActivity16.this , MainActivity16.class);

                startActivity(intent);

            }
        });tv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"loading....", Toast.LENGTH_LONG).show();

                Intent intent=new Intent(MainActivity16.this , MainActivity16.class);

                startActivity(intent);

            }
        });




    }
}