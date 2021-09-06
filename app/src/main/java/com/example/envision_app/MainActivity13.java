package com.example.envision_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity13 extends AppCompatActivity {

    TextView tv;
    Button b;
    EditText t,t1,t2,t3,t4,t5,t6,t7,t8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
        t=(EditText)findViewById(R.id.editText);
        t1=(EditText)findViewById(R.id.editText1);
        t2=(EditText)findViewById(R.id.editText2);
        t3=(EditText)findViewById(R.id.editText3);
        t4=(EditText)findViewById(R.id.editText4);
        t5=(EditText)findViewById(R.id.editText5);
        t6=(EditText)findViewById(R.id.editText6);
        t7=(EditText)findViewById(R.id.editText7);
        t8=(EditText)findViewById(R.id.editText8);
        tv=(TextView)findViewById(R.id.textView);
        b=(Button)findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {

                //double num=(Double.parseDouble(t1.getText().toString())+Double.parseDouble(t2.getText().toString())+Double.parseDouble(t3.getText().toString())+Double.parseDouble(t4.getText().toString())+Double.parseDouble(t5.getText().toString())+Double.parseDouble(t6.getText().toString())+Double.parseDouble(t7.getText().toString())+Double.parseDouble(t8.getText().toString()))/8;
                Float num=(Float.parseFloat(t1.getText().toString())+Float.parseFloat(t2.getText().toString())+Float.parseFloat(t3.getText().toString())+Float.parseFloat(t4.getText().toString())+Float.parseFloat(t5.getText().toString())+Float.parseFloat(t6.getText().toString())+Float.parseFloat(t7.getText().toString())+Float.parseFloat(t8.getText().toString()))/Integer.parseInt(t.getText().toString());
                tv.setText(Float.toString(num));
                Toast.makeText(MainActivity13.this,"Result="+num, LENGTH_SHORT).show();

                Log.d("string","Result="+ num);


            }
        });
    }
}