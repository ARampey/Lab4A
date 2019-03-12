package com.example.lab4a;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.*;


public class fahrenheitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fahrenheit);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void convert(View v) {
        String f = ((EditText) findViewById(R.id.fahrenheitText)).getText().toString();
        String c = ((EditText) findViewById(R.id.celsiusText)).getText().toString();


        double fahrenheit;
        double celsius;

        //
        if (f.isEmpty()) {

            if (!c.isEmpty()) {

                celsius = Double.valueOf(c);
                fahrenheit = ((celsius * 9/5) + 32);
                ((EditText) findViewById(R.id.fahrenheitText)).setText(Double.toString(fahrenheit));

            }
        }

        else {
            fahrenheit = Double.valueOf(f);
            celsius = ((fahrenheit - 32) * 5/9);
            ((EditText) findViewById(R.id.celsiusText)).setText(Double.toString(celsius));
        }

    }

}
