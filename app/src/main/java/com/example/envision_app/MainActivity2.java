package com.example.envision_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView title;
    private EditText username;
    private Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        title = (TextView) findViewById(R.id.textView);
        username = (EditText) findViewById(R.id.provideinput);
        b = (Button) findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String data = username.getText().toString();
                Intent intent;
                intent = new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("data",data);
                startActivity(intent);
            }
        });
    }
}