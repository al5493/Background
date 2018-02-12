package com.example.tal.background;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton tb1;
    Switch sw1;
    LinearLayout currentLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb1=(ToggleButton)findViewById(R.id.tb1);
        sw1=(Switch)findViewById(R.id.sw1);
        currentLayout=(LinearLayout)findViewById(R.id.currentLayout);
    }

    public void tb1Click(View view) {
        if (tb1.isChecked())
            currentLayout.setBackgroundColor(Color.BLUE);
        else
            currentLayout.setBackgroundColor(Color.WHITE);
    }

    public void sw1Click(View view) {
        if (sw1.isChecked())
            currentLayout.setBackgroundColor(Color.YELLOW);
        else
            currentLayout.setBackgroundColor(Color.RED);
    }
}
