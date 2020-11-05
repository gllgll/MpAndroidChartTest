package com.example.mpandroidcharttest;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;

public class LineChartTable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.line_chart);

        LineChart chart = findViewById(R.id.chart);
        Description description = new Description();
        description.setText("LineChart测试");
        description.setTextSize(40);
        description.setPosition(700,50);
        description.setTextColor(Color.BLUE);
        chart.setDescription(description);
//        chart.getDescription().setEnabled(false); // 隐藏图标描述

        XAxis xAxis = chart.getXAxis(); //获取x轴
        xAxis.setDrawAxisLine(true);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawGridLines(false);//绘制网格线，默认为true
        xAxis.setGridColor(Color.RED);//设置该轴的网格线颜色。
        xAxis.setGridLineWidth(5f);// 设置该轴网格线的宽度。
        xAxis.setTextColor(Color.RED);
        xAxis.setGridColor(Color.RED);
        xAxis.setAxisLineColor(Color.RED);
        xAxis.setAxisLineWidth(3f);

        YAxis yAxis = chart.getAxisLeft();
        yAxis.setTextColor(Color.RED);

        ArrayList<Entry> poitList = new ArrayList<Entry>();
        for (int i = 0; i < 10; i++) {
            float mult = 30 / 2f;
            float val = (float) (Math.random() * mult) + 60;
            poitList.add(new Entry(i, val));
        }
        LineDataSet dataSet = new LineDataSet(poitList, "温度变化表");
        dataSet.setAxisDependency(YAxis.AxisDependency.LEFT);
        dataSet.setHighLightColor(Color.RED); // 设置点击某个点时，横竖两条线的颜色
        dataSet.setDrawValues(true);//在点上显示数值 默认true
        dataSet.setLineWidth(2f);
        //dataSet.disableDashedLine();
        dataSet.setValueTextSize(12f);//数值字体大小，同样可以设置字体颜色、自定义字体等

        LineData data = new LineData(dataSet);

        chart.setData(data);
    }
}