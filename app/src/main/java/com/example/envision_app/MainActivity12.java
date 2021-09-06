package com.example.envision_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity12 extends AppCompatActivity {
    TextView tv;
    Button b;
    EditText t1,t15,t2,t25,t3,t35,t4,t45,t5,t55,t6,t65,t7,t75,t8,t85,t9,t95;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        t1=(EditText)findViewById(R.id.editText1);
        t15=(EditText)findViewById(R.id.editText15);
        t2=(EditText)findViewById(R.id.editText2);
        t25=(EditText)findViewById(R.id.editText25);
        t3=(EditText)findViewById(R.id.editText3);
        t35=(EditText)findViewById(R.id.editText35);
        t4=(EditText)findViewById(R.id.editText4);
        t45=(EditText)findViewById(R.id.editText45);
        t5=(EditText)findViewById(R.id.editText5);
        t55=(EditText)findViewById(R.id.editText55);
        t6=(EditText)findViewById(R.id.editText6);
        t65=(EditText)findViewById(R.id.editText65);
        t7=(EditText)findViewById(R.id.editText7);
        t75=(EditText)findViewById(R.id.editText75);
        t8=(EditText)findViewById(R.id.editText8);
        t85=(EditText)findViewById(R.id.editText85);
        t9=(EditText)findViewById(R.id.editText9);
        t95=(EditText)findViewById(R.id.editText95);
        tv=(TextView)findViewById(R.id.textView);
        b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                int N1=0;

                if(t15.getText().toString().equals("S"))
                {
                    N1=10;
                }
                if(t15.getText().toString().equals("A"))
                {
                    N1=9;
                }
                if(t15.getText().toString().equals("B"))
                {
                    N1=8;
                }
                if(t15.getText().toString().equals("C"))
                {
                    N1=7;
                }
                if(t15.getText().toString().equals("D"))
                {
                    N1=6;
                }
                if(t15.getText().toString().equals("E"))
                {
                    N1=5;
                }
                if(t15.getText().toString().equals("F"))
                {
                    N1=0;
                }
                if(t15.getText().toString().equals("N"))
                {
                    N1=0;
                }
                int num1 =N1*Integer.parseInt(t1.getText().toString());

                int N2=0;
                if(t25.getText().toString().equals("S"))
                {
                    N2=10;
                }
                if(t25.getText().toString().equals("A"))
                {
                    N2=9;
                }
                if(t25.getText().toString().equals("B"))
                {
                    N2=8;
                }
                if(t25.getText().toString().equals("C"))
                {
                    N2=7;
                }
                if(t25.getText().toString().equals("D"))
                {
                    N2=6;
                }
                if(t25.getText().toString().equals("E"))
                {
                    N2=5;
                }
                if(t25.getText().toString().equals("F"))
                {
                    N2=0;
                }
                if(t25.getText().toString().equals("N"))
                {
                    N2=0;
                }
                int num2 =N2*Integer.parseInt(t2.getText().toString());


                int N3=0;
                if(t35.getText().toString().equals("S"))
                {
                    N3=10;
                }
                if(t35.getText().toString().equals("A"))
                {
                    N3=9;
                }
                if(t35.getText().toString().equals("B"))
                {
                    N3=8;
                }
                if(t35.getText().toString().equals("C"))
                {
                    N3=7;
                }
                if(t35.getText().toString().equals("D"))
                {
                    N3=6;
                }
                if(t35.getText().toString().equals("E"))
                {
                    N3=5;
                }
                if(t35.getText().toString().equals("F"))
                {
                    N3=0;
                }
                if(t35.getText().toString().equals("N"))
                {
                    N3=0;
                }
                int num3 =N3*Integer.parseInt(t3.getText().toString());

                int N4=0;
                if(t45.getText().toString().equals("S"))
                {
                    N4=10;
                }
                if(t45.getText().toString().equals("A"))
                {
                    N4=9;
                }
                if(t45.getText().toString().equals("B"))
                {
                    N4=8;
                }
                if(t45.getText().toString().equals("C"))
                {
                    N4=7;
                }
                if(t45.getText().toString().equals("D"))
                {
                    N4=6;
                }
                if(t45.getText().toString().equals("E"))
                {
                    N4=5;
                }
                if(t45.getText().toString().equals("F"))
                {
                    N4=0;
                }
                if(t45.getText().toString().equals("N"))
                {
                    N4=0;
                }
                int num4 =N4*Integer.parseInt(t4.getText().toString());


                int N5=0;
                if(t55.getText().toString().equals("S"))
                {
                    N5=10;
                }
                if(t55.getText().toString().equals("A"))
                {
                    N5=9;
                }
                if(t55.getText().toString().equals("B"))
                {
                    N5=8;
                }
                if(t55.getText().toString().equals("C"))
                {
                    N5=7;
                }
                if(t55.getText().toString().equals("D"))
                {
                    N5=6;
                }
                if(t55.getText().toString().equals("E"))
                {
                    N5=5;
                }
                if(t55.getText().toString().equals("F"))
                {
                    N5=0;
                }
                if(t55.getText().toString().equals("N"))
                {
                    N5=0;
                }
                int num5 =N5*Integer.parseInt(t5.getText().toString());


                int N6=0;
                if(t65.getText().toString().equals("S"))
                {
                    N6=10;
                }
                if(t65.getText().toString().equals("A"))
                {
                    N6=9;
                }
                if(t65.getText().toString().equals("B"))
                {
                    N6=8;
                }
                if(t65.getText().toString().equals("C"))
                {
                    N6=7;
                }
                if(t65.getText().toString().equals("D"))
                {
                    N6=6;
                }
                if(t65.getText().toString().equals("E"))
                {
                    N6=5;
                }
                if(t65.getText().toString().equals("F"))
                {
                    N6=0;
                }
                if(t65.getText().toString().equals("N"))
                {
                    N6=0;
                }
                int num6 =N6*Integer.parseInt(t6.getText().toString());


                int N7=0;
                if(t75.getText().toString().equals("S"))
                {
                    N7=10;
                }
                if(t75.getText().toString().equals("A"))
                {
                    N7=9;
                }
                if(t75.getText().toString().equals("B"))
                {
                    N7=8;
                }
                if(t75.getText().toString().equals("C"))
                {
                    N7=7;
                }
                if(t75.getText().toString().equals("D"))
                {
                    N7=6;
                }
                if(t75.getText().toString().equals("E"))
                {
                    N7=5;
                }
                if(t75.getText().toString().equals("F"))
                {
                    N7=0;
                }
                if(t75.getText().toString().equals("N"))
                {
                    N7=0;
                }
                int num7 =N7*Integer.parseInt(t7.getText().toString());

                int N8=0;
                if(t85.getText().toString().equals("S"))
                {
                    N8=10;
                }
                if(t85.getText().toString().equals("A"))
                {
                    N8=9;
                }
                if(t85.getText().toString().equals("B"))
                {
                    N8=8;
                }
                if(t85.getText().toString().equals("C"))
                {
                    N8=7;
                }
                if(t85.getText().toString().equals("D"))
                {
                    N8=6;
                }
                if(t85.getText().toString().equals("E"))
                {
                    N8=5;
                }
                if(t85.getText().toString().equals("F"))
                {
                    N8=0;
                }
                if(t85.getText().toString().equals("N"))
                {
                    N8=0;
                }
                int num8 =N8*Integer.parseInt(t8.getText().toString());


                int N9=0;
                if(t95.getText().toString().equals("S"))
                {
                    N9=10;
                }
                if(t95.getText().toString().equals("A"))
                {
                    N9=9;
                }
                if(t95.getText().toString().equals("B"))
                {
                    N9=8;
                }
                if(t95.getText().toString().equals("C"))
                {
                    N9=7;
                }
                if(t95.getText().toString().equals("D"))
                {
                    N9=6;
                }
                if(t95.getText().toString().equals("E"))
                {
                    N9=5;
                }
                if(t95.getText().toString().equals("F"))
                {
                    N9=0;
                }
                if(t95.getText().toString().equals("N"))
                {
                    N9=0;
                }
                int num9 =N9*Integer.parseInt(t9.getText().toString());

                float y=Integer.parseInt(t9.getText().toString())+Integer.parseInt(t8.getText().toString())+Integer.parseInt(t7.getText().toString())+Integer.parseInt(t6.getText().toString())+Integer.parseInt(t5.getText().toString())+Integer.parseInt(t4.getText().toString())+Integer.parseInt(t3.getText().toString())+Integer.parseInt(t2.getText().toString())+Integer.parseInt(t1.getText().toString());
                float z=(num1+num2+num3+num4+num5+num6+num7+num8+num9);
                float x =z/y;
                tv.setText(Float.toString(x));
                Toast.makeText(MainActivity12.this,"Result="+x, LENGTH_SHORT).show();
                Log.d("string","Result="+x);
            }
        });
    }
}