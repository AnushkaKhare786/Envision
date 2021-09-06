package com.example.envision_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class MainActivity11 extends AppCompatActivity {

    TextView tv,tv1,tv2,t11,t12,t21,t22,t31,t32,t41,t42,t51,t52,t61,t62,t71,t72,t81,t82,ti1,ti2;
    CheckBox c,c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27,c28,c29,c30,c31,c32,c33,c34,c35,c36,c37,c38,c39,c40,c41,c42,c43,c44,c45,c46,c47,c48,c49,c50,c51,c52,c53,c54,c55,c56,c57,c58,c59;
    Button button,b1,b2,b3,bi,b4,b5,b6,b7,b8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        c=(CheckBox)findViewById(R.id.checkBox);
        c1=(CheckBox)findViewById(R.id.checkBox1);
        c2=(CheckBox)findViewById(R.id.checkBox2);
        c3=(CheckBox)findViewById(R.id.checkBox3);
        c4=(CheckBox)findViewById(R.id.checkBox4);
        c5=(CheckBox)findViewById(R.id.checkBox5);
        c6=(CheckBox)findViewById(R.id.checkBox6);
        c7=(CheckBox)findViewById(R.id.checkBox7);
        c8=(CheckBox)findViewById(R.id.checkBox8);
        c9=(CheckBox)findViewById(R.id.checkBox9);
        c10=(CheckBox)findViewById(R.id.checkBox10);
        c11=(CheckBox)findViewById(R.id.checkBox11);
        c12=(CheckBox)findViewById(R.id.checkBox12);
        c13=(CheckBox)findViewById(R.id.checkBox13);
        c14=(CheckBox)findViewById(R.id.checkBox14);
        c15=(CheckBox)findViewById(R.id.checkBox15);
        c16=(CheckBox)findViewById(R.id.checkBox16);
        c17=(CheckBox)findViewById(R.id.checkBox17);
        c18=(CheckBox)findViewById(R.id.checkBox18);
        c19=(CheckBox)findViewById(R.id.checkBox19);
        c20=(CheckBox)findViewById(R.id.checkBox20);
        c21=(CheckBox)findViewById(R.id.checkBox21);
        c22=(CheckBox)findViewById(R.id.checkBox22);
        c23=(CheckBox)findViewById(R.id.checkBox23);
        c24=(CheckBox)findViewById(R.id.checkBox24);
        c25=(CheckBox)findViewById(R.id.checkBox25);
        c26=(CheckBox)findViewById(R.id.checkBox26);
        c27=(CheckBox)findViewById(R.id.checkBox27);
        c28=(CheckBox)findViewById(R.id.checkBox28);
        c29=(CheckBox)findViewById(R.id.checkBox29);
        c30=(CheckBox)findViewById(R.id.checkBox30);
        c31=(CheckBox)findViewById(R.id.checkBox31);
        c32=(CheckBox)findViewById(R.id.checkBox32);
        c33=(CheckBox)findViewById(R.id.checkBox33);
        c34=(CheckBox)findViewById(R.id.checkBox34);
        c35=(CheckBox)findViewById(R.id.checkBox35);
        c36=(CheckBox)findViewById(R.id.checkBox36);
        c37=(CheckBox)findViewById(R.id.checkBox37);
        c38=(CheckBox)findViewById(R.id.checkBox38);
        c39=(CheckBox)findViewById(R.id.checkBox39);
        c40=(CheckBox)findViewById(R.id.checkBox40);
        c41=(CheckBox)findViewById(R.id.checkBox41);
        c42=(CheckBox)findViewById(R.id.checkBox42);
        c43=(CheckBox)findViewById(R.id.checkBox43);
        c44=(CheckBox)findViewById(R.id.checkBox44);
        c45=(CheckBox)findViewById(R.id.checkBox45);
        c46=(CheckBox)findViewById(R.id.checkBox46);
        c47=(CheckBox)findViewById(R.id.checkBox47);
        c48=(CheckBox)findViewById(R.id.checkBox48);
        c49=(CheckBox)findViewById(R.id.checkBox49);
        c50=(CheckBox)findViewById(R.id.checkBox50);
        c51=(CheckBox)findViewById(R.id.checkBox51);
        c52=(CheckBox)findViewById(R.id.checkBox52);
        c53=(CheckBox)findViewById(R.id.checkBox53);
        c54=(CheckBox)findViewById(R.id.checkBox54);
        c55=(CheckBox)findViewById(R.id.checkBox55);
        c56=(CheckBox)findViewById(R.id.checkBox56);
        c57=(CheckBox)findViewById(R.id.checkBox57);
        c58=(CheckBox)findViewById(R.id.checkBox58);
        c59=(CheckBox)findViewById(R.id.checkBox59);
        tv=(TextView)findViewById(R.id.textView);
        tv1=(TextView)findViewById(R.id.textView1);
        tv2=(TextView)findViewById(R.id.textView2);
        t11=(TextView)findViewById(R.id.textView11);
        t12=(TextView)findViewById(R.id.textView12);
        t21=(TextView)findViewById(R.id.textView21);
        t22=(TextView)findViewById(R.id.textView22);
        t31=(TextView)findViewById(R.id.textView31);
        t32=(TextView)findViewById(R.id.textView32);
        ti1=(TextView)findViewById(R.id.textViewi1);
        ti2=(TextView)findViewById(R.id.textViewi2);
        t41=(TextView)findViewById(R.id.textView41);
        t42=(TextView)findViewById(R.id.textView42);
        t51=(TextView)findViewById(R.id.textView51);
        t52=(TextView)findViewById(R.id.textView52);
        t61=(TextView)findViewById(R.id.textView61);
        t62=(TextView)findViewById(R.id.textView62);
        t71=(TextView)findViewById(R.id.textView71);
        t72=(TextView)findViewById(R.id.textView72);
        t81=(TextView)findViewById(R.id.textView81);
        t82=(TextView)findViewById(R.id.textView82);
        button=(Button)findViewById(R.id.button);
        b1=(Button)findViewById(R.id.button11);
        b2=(Button)findViewById(R.id.button22);
        b3=(Button)findViewById(R.id.button33);
        bi=(Button)findViewById(R.id.buttonii);
        b4=(Button)findViewById(R.id.button44);
        b5=(Button)findViewById(R.id.button55);
        b6=(Button)findViewById(R.id.button66);
        b7=(Button)findViewById(R.id.button77);
        b8=(Button)findViewById(R.id.button88);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1=" ";
                int b1=0;
                if(c.isChecked())
                {
                    t11.setText(c.getText().toString());
                    s1=s1+" "+c.getText().toString();
                    b1=b1+4;
                }

                if(c21.isChecked())
                {
                    t11.setText(c21.getText().toString());
                    s1=s1+" "+c21.getText().toString();
                    b1=b1+4;
                }

                if(c39.isChecked())
                {
                    t11.setText(c39.getText().toString());
                    s1=s1+" "+c39.getText().toString();
                    b1=b1+4;

                }

                if(c42.isChecked())
                {
                    t11.setText(c42.getText().toString());
                    s1=s1+" "+c42.getText().toString();
                    b1=b1+2;
                }
                if(c43.isChecked())
                {
                    t11.setText(c43.getText().toString());
                    s1=s1+" "+c43.getText().toString();
                    b1=b1+2;
                }

                if(c45.isChecked())
                {
                    t11.setText(c45.getText().toString());
                    s1=s1+" "+c45.getText().toString();
                    b1=b1+2;
                }
                if(c46.isChecked())
                {
                    t11.setText(c46.getText().toString());
                    s1=s1+" "+c46.getText().toString();
                    b1=b1+4;
                }

                if(c53.isChecked())
                {
                    t11.setText(c53.getText().toString());
                    s1=s1+" "+c53.getText().toString();
                    b1=b1+4;
                }
                t11.setText(s1);
                t12.setText(Integer.toString(b1));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s2=" ";
                int b2=0;

                if(c1.isChecked())
                {
                    t21.setText(c1.getText().toString());
                    s2=s2+" "+c1.getText().toString();
                    b2=b2+4;
                }

                if(c17.isChecked())
                {
                    t21.setText(c17.getText().toString());
                    s2=s2+" "+c17.getText().toString();
                    b2=b2+4;
                }
                if(c22.isChecked())
                {
                    t21.setText(c22.getText().toString());
                    s2=s2+" "+c22.getText().toString();
                    b2=b2+2;
                }

                if(c40.isChecked())
                {
                    t21.setText(c40.getText().toString());
                    s2=s2+" "+c40.getText().toString();
                    b2=b2+3;
                }
                if(c41.isChecked())
                {
                    t21.setText(c41.getText().toString());
                    s2=s2+" "+c41.getText().toString();
                    b2=b2+3;
                }

                if(c47.isChecked())
                {
                    t21.setText(c47.getText().toString());
                    s2=s2+" "+c47.getText().toString();
                    b2=b2+3;
                }
                if(c48.isChecked())
                {
                    t21.setText(c48.getText().toString());
                    s2=s2+" "+c48.getText().toString();
                    b2=b2+4;
                }
                t21.setText(s2);
                t22.setText(Integer.toString(b2));
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s3=" ";
                int b3=0;
                if(c2.isChecked())
                {
                    t31.setText(c2.getText().toString());
                    s3=s3+" "+c2.getText().toString();
                    b3=b3+4;
                }
                if(c3.isChecked())
                {
                    t31.setText(c3.getText().toString());
                    s3=s3+" "+c3.getText().toString();
                    b3=b3+4;
                }
                if(c12.isChecked())
                {
                    t31.setText(c12.getText().toString());
                    s3=s3+" "+c12.getText().toString();
                    b3=b3+2;
                }
                if(c14.isChecked())
                {
                    t31.setText(c14.getText().toString());
                    s3=s3+" "+c14.getText().toString();
                    b3=b3+1;
                }
                if(c26.isChecked())
                {
                    t31.setText(c26.getText().toString());
                    s3=s3+" "+c26.getText().toString();
                    b3=b3+3;
                }
                if(c27.isChecked())
                {
                    t31.setText(c27.getText().toString());
                    s3=s3+" "+c27.getText().toString();
                    b3=b3+3;
                }
                if(c49.isChecked())
                {
                    t31.setText(c49.getText().toString());
                    s3=s3+" "+c49.getText().toString();
                    b3=b3+3;
                }
                t31.setText(s3);
                t32.setText(Integer.toString(b3));
            }
        });

        bi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String si=" ";
                int bi=0;
                if(c4.isChecked())
                {
                    ti1.setText(c4.getText().toString());
                    si=si+" "+c4.getText().toString();
                    bi=bi+4;
                }

                if(c6.isChecked())
                {
                    ti1.setText(c6.getText().toString());
                    si=si+" "+c6.getText().toString();
                    bi=bi+4;
                }
                if(c8.isChecked())
                {
                    ti1.setText(c8.getText().toString());
                    si=si+" "+c8.getText().toString();
                    bi=bi+4;
                }

                ti1.setText(si);
                ti2.setText(Integer.toString(bi));
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s4=" ";
                int b4=0;
                if(c5.isChecked())
                {
                    t41.setText(c5.getText().toString());
                    s4=s4+" "+c5.getText().toString();
                    b4=b4+4;
                }
                if(c7.isChecked())
                {
                    t41.setText(c7.getText().toString());
                    s4=s4+" "+c7.getText().toString();
                    b4=b4+4;
                }
                if(c15.isChecked())
                {
                    t41.setText(c15.getText().toString());
                    s4=s4+" "+c15.getText().toString();
                    b4=b4+1;
                }
                if(c31.isChecked())
                {
                    t41.setText(c31.getText().toString());
                    s4=s4+" "+c31.getText().toString();
                    b4=b4+3;
                }
                if(c44.isChecked())
                {
                    t41.setText(c44.getText().toString());
                    s4=s4+" "+c44.getText().toString();
                    b4=b4+2;
                }
                if(c51.isChecked())
                {
                    t41.setText(c51.getText().toString());
                    s4=s4+" "+c51.getText().toString();
                    b4=b4+3;
                }
                if(c52.isChecked())
                {
                    t41.setText(c52.getText().toString());
                    s4=s4+" "+c52.getText().toString();
                    b4=b4+4;
                }
                if(c53.isChecked())
                {
                    t41.setText(c53.getText().toString());
                    s4=s4+" "+c53.getText().toString();
                    b4=b4+4;
                }
                if(c58.isChecked())
                {
                    t41.setText(c58.getText().toString());
                    s4=s4+" "+c58.getText().toString();
                    b4=b4+1;
                }
                t41.setText(s4);
                t42.setText(Integer.toString(b4));
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s5=" ";
                int b5=0;
                if(c9.isChecked())
                {
                    t51.setText(c9.getText().toString());
                    s5=s5+" "+c9.getText().toString();
                    b5=b5+4;
                }
                if(c10.isChecked())
                {
                    t51.setText(c10.getText().toString());
                    s5=s5+" "+c10.getText().toString();
                    b5=b5+4;
                }
                if(c11.isChecked())
                {
                    t51.setText(c11.getText().toString());
                    s5=s5+" "+c11.getText().toString();
                    b5=b5+4;
                }
                if(c13.isChecked())
                {
                    t51.setText(c13.getText().toString());
                    s5=s5+" "+c13.getText().toString();
                    b5=b5+2;
                }
                if(c23.isChecked())
                {
                    t51.setText(c23.getText().toString());
                    s5=s5+" "+c23.getText().toString();
                    b5=b5+3;
                }
                if(c24.isChecked())
                {
                    t51.setText(c24.getText().toString());
                    s5=s5+" "+c24.getText().toString();
                    b5=b5+3;
                }
                t51.setText(s5);
                t52.setText(Integer.toString(b5));
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s6=" ";
                int b6=0;

                if(c16.isChecked()) {
                    t61.setText(c16.getText().toString());
                    s6 = s6 + " " + c16.getText().toString();
                    b6 = b6 + 2;
                }
                if(c18.isChecked())
                {
                    t61.setText(c18.getText().toString());
                    s6=s6+" "+c18.getText().toString();
                    b6=b6+4;
                }
                if(c19.isChecked())
                {
                    t61.setText(c19.getText().toString());
                    s6=s6+" "+c19.getText().toString();
                    b6=b6+3;
                }
                if(c20.isChecked())
                {
                    t61.setText(c20.getText().toString());
                    s6=s6+" "+c20.getText().toString();
                    b6=b6+4;
                }
                if(c25.isChecked())
                {
                    t61.setText(c25.getText().toString());
                    s6=s6+" "+c25.getText().toString();
                    b6=b6+3;
                }
                if(c28.isChecked())
                {
                    t61.setText(c28.getText().toString());
                    s6=s6+" "+c28.getText().toString();
                    b6=b6+3;
                }
                if(c29.isChecked())
                {
                    t61.setText(c29.getText().toString());
                    s6=s6+" "+c29.getText().toString();
                    b6=b6+3;
                }
                t61.setText(s6);
                t62.setText(Integer.toString(b6));
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s7=" ";
                int b7=0;
                if(c36.isChecked())
                {
                    t71.setText(c36.getText().toString());
                    s7=s7+" "+c36.getText().toString();
                    b7=b7+4;
                }
                if(c37.isChecked())
                {
                    t71.setText(c37.getText().toString());
                    s7=s7+" "+c37.getText().toString();
                    b7=b7+4;
                }
                if(c50.isChecked())
                {
                    t71.setText(c50.getText().toString());
                    s7=s7+" "+c50.getText().toString();
                    b7=b7+3;
                }
                if(c54.isChecked())
                {
                    t71.setText(c54.getText().toString());
                    s7=s7+" "+c54.getText().toString();
                    b7=b7+3;
                }
                if(c55.isChecked())
                {
                    t71.setText(c55.getText().toString());
                    s7=s7+" "+c55.getText().toString();
                    b7=b7+3;
                }
                if(c57.isChecked())
                {
                    t71.setText(c57.getText().toString());
                    s7=s7+" "+c57.getText().toString();
                    b7=b7+4;
                }
                if(c59.isChecked())
                {
                    t71.setText(c59.getText().toString());
                    s7=s7+" "+c59.getText().toString();
                    b7=b7+1;
                }
                t71.setText(s7);
                t72.setText(Integer.toString(b7));
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s8=" ";
                int b8=0;
                if(c30.isChecked())
                {
                    t81.setText(c30.getText().toString());
                    s8=s8+" "+c30.getText().toString();
                    b8=b8+3;
                }
                if(c32.isChecked())
                {
                    t81.setText(c32.getText().toString());
                    s8=s8+" "+c32.getText().toString();
                    b8=b8+3;
                }
                if(c33.isChecked())
                {
                    t81.setText(c33.getText().toString());
                    s8=s8+" "+c33.getText().toString();
                    b8=b8+3;
                }
                if(c34.isChecked())
                {
                    t81.setText(c34.getText().toString());
                    s8=s8+" "+c34.getText().toString();
                    b8=b8+3;
                }
                if(c35.isChecked())
                {
                    t81.setText(c35.getText().toString());
                    s8=s8+" "+c35.getText().toString();
                    b8=b8+4;
                }
                if(c38.isChecked())
                {
                    t81.setText(c38.getText().toString());
                    s8=s8+" "+c38.getText().toString();
                    b8=b8+4;
                }
                if(c56.isChecked())
                {
                    t81.setText(c56.getText().toString());
                    s8=s8+" "+c56.getText().toString();
                    b8=b8+4;
                }
                t81.setText(s8);
                t82.setText(Integer.toString(b8));
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String s=" ";
                int b=0;
                if(c.isChecked())
                {
                    tv.setText(c.getText().toString());
                    s=s+" "+c.getText().toString();
                    b=b+4;
                }
                if(c1.isChecked())
                {
                    tv.setText(c1.getText().toString());
                    s=s+" "+c1.getText().toString();
                    b=b+4;
                }
                if(c2.isChecked())
                {
                    tv.setText(c2.getText().toString());
                    s=s+" "+c2.getText().toString();
                    b=b+4;
                }
                if(c3.isChecked())
                {
                    tv.setText(c3.getText().toString());
                    s=s+" "+c3.getText().toString();
                    b=b+4;
                }
                if(c3.isChecked())
                {
                    tv.setText(c3.getText().toString());
                    s=s+" "+c3.getText().toString();
                    b=b+4;
                }
                if(c4.isChecked())
                {
                    tv.setText(c4.getText().toString());
                    s=s+" "+c4.getText().toString();
                    b=b+4;
                }
                if(c5.isChecked())
                {
                    tv.setText(c5.getText().toString());
                    s=s+" "+c5.getText().toString();
                    b=b+4;
                }
                if(c6.isChecked())
                {
                    tv.setText(c6.getText().toString());
                    s=s+" "+c6.getText().toString();
                    b=b+4;
                }
                if(c7.isChecked())
                {
                    tv.setText(c7.getText().toString());
                    s=s+" "+c7.getText().toString();
                    b=b+4;
                }
                if(c8.isChecked())
                {
                    tv.setText(c8.getText().toString());
                    s=s+" "+c8.getText().toString();
                    b=b+4;
                }
                if(c9.isChecked())
                {
                    tv.setText(c9.getText().toString());
                    s=s+" "+c9.getText().toString();
                    b=b+4;
                }
                if(c10.isChecked())
                {
                    tv.setText(c10.getText().toString());
                    s=s+" "+c10.getText().toString();
                    b=b+4;
                }
                if(c11.isChecked())
                {
                    tv.setText(c11.getText().toString());
                    s=s+" "+c11.getText().toString();
                    b=b+4;
                }
                if(c12.isChecked())
                {
                    tv.setText(c12.getText().toString());
                    s=s+" "+c12.getText().toString();
                    b=b+2;
                }
                if(c13.isChecked())
                {
                    tv.setText(c13.getText().toString());
                    s=s+" "+c13.getText().toString();
                    b=b+2;
                }
                if(c14.isChecked())
                {
                    tv.setText(c14.getText().toString());
                    s=s+" "+c14.getText().toString();
                    b=b+1;
                }
                if(c15.isChecked())
                {
                    tv.setText(c15.getText().toString());
                    s=s+" "+c15.getText().toString();
                    b=b+1;
                }
                if(c16.isChecked()) {
                    tv.setText(c16.getText().toString());
                    s = s + " " + c16.getText().toString();
                    b = b + 2;
                }
                if(c17.isChecked())
                {
                    tv.setText(c17.getText().toString());
                    s=s+" "+c17.getText().toString();
                    b=b+4;
                }
                if(c18.isChecked())
                {
                    tv.setText(c18.getText().toString());
                    s=s+" "+c18.getText().toString();
                    b=b+4;
                }
                if(c19.isChecked())
                {
                    tv.setText(c19.getText().toString());
                    s=s+" "+c19.getText().toString();
                    b=b+3;
                }
                if(c20.isChecked())
                {
                    tv.setText(c20.getText().toString());
                    s=s+" "+c20.getText().toString();
                    b=b+4;
                }
                if(c21.isChecked())
                {
                    tv.setText(c21.getText().toString());
                    s=s+" "+c21.getText().toString();
                    b=b+4;
                }
                if(c22.isChecked())
                {
                    tv.setText(c22.getText().toString());
                    s=s+" "+c22.getText().toString();
                    b=b+2;
                }
                if(c23.isChecked())
                {
                    tv.setText(c23.getText().toString());
                    s=s+" "+c23.getText().toString();
                    b=b+3;
                }
                if(c24.isChecked())
                {
                    tv.setText(c24.getText().toString());
                    s=s+" "+c24.getText().toString();
                    b=b+3;
                }
                if(c25.isChecked())
                {
                    tv.setText(c25.getText().toString());
                    s=s+" "+c25.getText().toString();
                    b=b+3;
                }
                if(c26.isChecked())
                {
                    tv.setText(c26.getText().toString());
                    s=s+" "+c26.getText().toString();
                    b=b+3;
                }
                if(c27.isChecked())
                {
                    tv.setText(c27.getText().toString());
                    s=s+" "+c27.getText().toString();
                    b=b+3;
                }
                if(c28.isChecked())
                {
                    tv.setText(c28.getText().toString());
                    s=s+" "+c28.getText().toString();
                    b=b+3;
                }
                if(c29.isChecked())
                {
                    tv.setText(c29.getText().toString());
                    s=s+" "+c29.getText().toString();
                    b=b+3;
                }
                if(c30.isChecked())
                {
                    tv.setText(c30.getText().toString());
                    s=s+" "+c30.getText().toString();
                    b=b+3;
                }
                if(c31.isChecked())
                {
                    tv.setText(c31.getText().toString());
                    s=s+" "+c31.getText().toString();
                    b=b+3;
                }
                if(c32.isChecked())
                {
                    tv.setText(c32.getText().toString());
                    s=s+" "+c32.getText().toString();
                    b=b+3;
                }
                if(c33.isChecked())
                {
                    tv.setText(c33.getText().toString());
                    s=s+" "+c33.getText().toString();
                    b=b+3;
                }
                if(c34.isChecked())
                {
                    tv.setText(c34.getText().toString());
                    s=s+" "+c34.getText().toString();
                    b=b+3;
                }
                if(c35.isChecked())
                {
                    tv.setText(c35.getText().toString());
                    s=s+" "+c35.getText().toString();
                    b=b+4;
                }
                if(c36.isChecked())
                {
                    tv.setText(c36.getText().toString());
                    s=s+" "+c36.getText().toString();
                    b=b+4;
                }
                if(c37.isChecked())
                {
                    tv.setText(c37.getText().toString());
                    s=s+" "+c37.getText().toString();
                    b=b+4;
                }
                if(c38.isChecked())
                {
                    tv.setText(c38.getText().toString());
                    s=s+" "+c38.getText().toString();
                    b=b+4;
                }
                if(c39.isChecked())
                {
                    tv.setText(c39.getText().toString());
                    s=s+" "+c39.getText().toString();
                    b=b+4;

                }
                if(c40.isChecked())
                {
                    tv.setText(c40.getText().toString());
                    s=s+" "+c40.getText().toString();
                    b=b+3;
                }
                if(c41.isChecked())
                {
                    tv.setText(c41.getText().toString());
                    s=s+" "+c41.getText().toString();
                    b=b+3;
                }
                if(c42.isChecked())
                {
                    tv.setText(c42.getText().toString());
                    s=s+" "+c42.getText().toString();
                    b=b+2;
                }
                if(c43.isChecked())
                {
                    tv.setText(c43.getText().toString());
                    s=s+" "+c43.getText().toString();
                    b=b+2;
                }
                if(c44.isChecked())
                {
                    tv.setText(c44.getText().toString());
                    s=s+" "+c44.getText().toString();
                    b=b+2;
                }
                if(c45.isChecked())
                {
                    tv.setText(c45.getText().toString());
                    s=s+" "+c45.getText().toString();
                    b=b+2;
                }
                if(c46.isChecked())
                {
                    tv.setText(c46.getText().toString());
                    s=s+" "+c46.getText().toString();
                    b=b+4;
                }
                if(c47.isChecked())
                {
                    tv.setText(c47.getText().toString());
                    s=s+" "+c47.getText().toString();
                    b=b+3;
                }
                if(c48.isChecked())
                {
                    tv.setText(c48.getText().toString());
                    s=s+" "+c48.getText().toString();
                    b=b+4;
                }
                if(c49.isChecked())
                {
                    tv.setText(c49.getText().toString());
                    s=s+" "+c49.getText().toString();
                    b=b+3;
                }
                if(c50.isChecked())
                {
                    tv.setText(c50.getText().toString());
                    s=s+" "+c50.getText().toString();
                    b=b+3;
                }
                if(c51.isChecked())
                {
                    tv.setText(c51.getText().toString());
                    s=s+" "+c51.getText().toString();
                    b=b+3;
                }
                if(c52.isChecked())
                {
                    tv.setText(c52.getText().toString());
                    s=s+" "+c52.getText().toString();
                    b=b+4;
                }
                if(c53.isChecked())
                {
                    tv.setText(c53.getText().toString());
                    s=s+" "+c53.getText().toString();
                    b=b+4;
                }
                if(c54.isChecked())
                {
                    tv.setText(c54.getText().toString());
                    s=s+" "+c54.getText().toString();
                    b=b+3;
                }
                if(c55.isChecked())
                {
                    tv.setText(c55.getText().toString());
                    s=s+" "+c55.getText().toString();
                    b=b+3;
                }
                if(c56.isChecked())
                {
                    tv.setText(c56.getText().toString());
                    s=s+" "+c56.getText().toString();
                    b=b+4;
                }
                if(c57.isChecked())
                {
                    tv.setText(c57.getText().toString());
                    s=s+" "+c57.getText().toString();
                    b=b+4;
                }
                if(c58.isChecked())
                {
                    tv.setText(c58.getText().toString());
                    s=s+" "+c58.getText().toString();
                    b=b+1;
                }
                if(c59.isChecked())
                {
                    tv.setText(c59.getText().toString());
                    s=s+" "+c59.getText().toString();
                    b=b+1;
                }
                tv.setText(s);
                tv1.setText(Integer.toString(b));
                int x=180-b;
                tv2.setText(Integer.toString(x));
            }
        });
    }
}