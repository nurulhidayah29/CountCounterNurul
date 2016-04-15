package com.example.asus.countcounternurul;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView2;
    TextView textView3;
    TextView text1;
    TextView textView;
    int counter;
    int counters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        text1 = (TextView) findViewById(R.id.text1);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView = (TextView) findViewById(R.id.textView);


        // change font size of the text
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);

    }



    @Override
    public void onClick(View v) {

    }

    public void btnA3(View view) {

        counter =+3+counter;
        textView.setText(Integer.toString(counter));
        textView.setBackgroundColor(Color.CYAN);
    }

    public void btnA2(View view) {
        counter=+2+counter;
        textView.setText(Integer.toString(counter));
        textView.setBackgroundColor(Color.GREEN);
    }

    public void btnA1(View view) {
        counter++;
        textView.setText(Integer.toString(counter));
        textView.setBackgroundColor(Color.TRANSPARENT);
    }

    public void btnB3(View view) {
        counters = +3+counters;
        textView2.setText(Integer.toString(counters));
        textView2.setBackgroundColor(Color.CYAN);
    }

    public void btnB2(View view) {
        counters = +2+counters;
        textView2.setText(Integer.toString(counters));
        textView2.setBackgroundColor(Color.GREEN);
    }


    public void btnB1(View view) {
        counters++;
        textView2.setText(Integer.toString(counters));
        textView2.setBackgroundColor(Color.TRANSPARENT);
    }


    public void reset(View view) {
        counter=0;
        counters=0;
        textView.setText(Integer.toString(counter));
        textView.setBackgroundColor(Color.TRANSPARENT);
        textView2.setText(Integer.toString(counters));
        textView2.setBackgroundColor(Color.TRANSPARENT);
    }
}
