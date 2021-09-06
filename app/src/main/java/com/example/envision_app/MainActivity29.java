package com.example.envision_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class MainActivity29 extends AppCompatActivity {

    BarChart barchart;
    ArrayList<BarEntry> barEntryArrayList;
    ArrayList<String> labels;
    ArrayList<Teachers> teachersArrayList = new ArrayList<>();
    Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main29);
        b = (Button)findViewById(R.id.button14);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity29.this , MainActivity30.class);

                startActivity(intent);
            }
        });

        barchart = findViewById(R.id.barChart);

        barEntryArrayList = new ArrayList<>();
        labels = new ArrayList<>();
        fillsubjects();

        for (int i =0; i<teachersArrayList.size();i++) {
       String teacher = teachersArrayList.get(i).getTeacher();
         int number = teachersArrayList.get(i).getNumber();

           barEntryArrayList.add(new BarEntry(i,number));
            labels.add(teacher);
        }

        BarDataSet barDataSet = new BarDataSet(barEntryArrayList, "NUMBER OF SUBJECTS");
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
    private void fillsubjects() {
        teachersArrayList.clear();
        teachersArrayList.add(new Teachers("CSE",23));
        teachersArrayList.add(new Teachers("DSN",5));
        teachersArrayList.add(new Teachers("ECE",5));
        teachersArrayList.add(new Teachers("NAS",4));
        teachersArrayList.add(new Teachers("CHY",2));
        teachersArrayList.add(new Teachers("ENG",2));
        teachersArrayList.add(new Teachers("MAT",7));
        teachersArrayList.add(new Teachers("PHY",3));
        teachersArrayList.add(new Teachers("PLA",2));
        teachersArrayList.add(new Teachers("STS",2));
        teachersArrayList.add(new Teachers("OTHERS",3));


    }


}