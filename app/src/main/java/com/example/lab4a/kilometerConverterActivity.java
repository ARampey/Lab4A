package com.example.lab4a;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class kilometerConverterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kilometer_converter);
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
    public void convert (View v) {

        String m = ((EditText) findViewById(R.id.milesText)).getText().toString();
        String k = ((EditText) findViewById(R.id.kmText)).getText().toString();

        double mi;
        double km;


        //default is miles to km

        if (m.isEmpty()) {

            if (!k.isEmpty()) {

                km = Double.parseDouble(k);
                mi = (0.621371 * km);

                ((EditText) findViewById(R.id.milesText)).setText(Double.toString(mi));


            }
        }

        else {

            mi = Double.parseDouble(m);
            km = (1.609344 * mi);

            ((EditText) findViewById(R.id.kmText)).setText(Double.toString(km));

            }


        }
    }
