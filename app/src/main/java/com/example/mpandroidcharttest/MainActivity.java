package com.example.mpandroidcharttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonLine, buttonDline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLine = findViewById(R.id.button_linechart);
        buttonDline = findViewById(R.id.button_dlinechart);

        buttonLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LineChartTable.class);
                startActivity(intent);
            }
        });

        buttonDline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DlineChartTable.class);
                startActivity(intent);
            }
        });
    }
}