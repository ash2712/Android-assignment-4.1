package com.example.ayush.loginassignmentfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt1 = (Button) findViewById(R.id.dobButton);
        final DatePicker dp1 = (DatePicker) findViewById(R.id.datePicker);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            dp1.setVisibility(View.VISIBLE);
                dp1.init(2017, 5, 14, new DatePicker.OnDateChangedListener() {
                    @Override
                    public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                    }
                });



            ;}
        });
    }
}
