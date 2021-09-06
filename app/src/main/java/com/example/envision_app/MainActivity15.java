package com.example.envision_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity15 extends AppCompatActivity {

    BarChart barchart;
    ArrayList<BarEntry> barEntryArrayList;
    ArrayList<String> labels;
    ArrayList<Teachers> teachersArrayList = new ArrayList<>();
    Button b1,b2,b3,b4,b5,b6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);
        b1 = (Button)findViewById(R.id.button8);
        b2 = (Button)findViewById(R.id.button9);
        b3 = (Button)findViewById(R.id.button10);
        b4 = (Button)findViewById(R.id.button11);
        b5 = (Button)findViewById(R.id.button12);
        b6 = (Button)findViewById(R.id.button13);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity15.this , MainActivity16.class);

                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity15.this , MainActivity17.class);

                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity15.this , MainActivity18.class);

                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity15.this , MainActivity19.class);

                startActivity(intent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity15.this , MainActivity20.class);

                startActivity(intent);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity15.this , MainActivity21.class);

                startActivity(intent);
            }
        });

        barchart = findViewById(R.id.barChart);

        barEntryArrayList = new ArrayList<>();
        labels = new ArrayList<>();
        fillteachers();

        for (int i =0; i<teachersArrayList.size();i++) {
            String teacher = teachersArrayList.get(i).getTeacher();
            int number = teachersArrayList.get(i).getNumber();

            barEntryArrayList.add(new BarEntry(i,number));
            labels.add(teacher);
        }

        BarDataSet barDataSet = new BarDataSet(barEntryArrayList, "NUMBER OF TEACHERS");
        barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        barDataSet.setValueTextSize(20f);
        Description description = new Description();
        description.setText("Teachers");
        barchart.setDescription(description);
        BarData barData = new BarData(barDataSet);
        barchart.setData(barData);
        // set axis value formater
        XAxis xAxis = barchart.getXAxis();
        xAxis.setValueFormatter(new IndexAxisValueFormatter(labels));
        //set position of labels
        xAxis.setPosition(XAxis.XAxisPosition.TOP);
        xAxis.setDrawGridLines(false);
        xAxis.setDrawAxisLine(false);
        xAxis.setGranularity(1f);
        xAxis.setLabelCount(labels.size());
        xAxis.setLabelRotationAngle(270);
        barchart.animateY(2000);
        barchart.invalidate();


    }
    private void fillteachers() {
        teachersArrayList.clear();
        teachersArrayList.add(new Teachers("SCSE",38));
        teachersArrayList.add(new Teachers("SAS",20));
        teachersArrayList.add(new Teachers("SASL",23));
        teachersArrayList.add(new Teachers("SEEE",15));
        teachersArrayList.add(new Teachers("SMEC",9));
        teachersArrayList.add(new Teachers("OTHERS",6));



    }
}