package com.example.lab4a;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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










    // Calculate button and three input fields: total bill, tip percentage, and number of people
    // click calculate, divides tip evenly and computes the total per person
    // total bill of 100.00 and tip of 15% = 38.34/person
    // formatted to 2 decimal places

    public void tipCalculatorActivity(View v) {

    Intent i = new Intent(this, tipCalculatorActivity.class);
    startActivity(i);

    }

    // user enters distance in either miles or kilometers into input field
    // upon pressing "convert", conversion should be shown in opposite field which it was inputted
    // if number found in both fields, default is to convert from miles to kilometers
    // both fields blank, do nothing


    public void kilometerConverterActivity (View v) {

        Intent i = new Intent(this, kilometerConverterActivity.class);
        startActivity(i);
    }

    // default is from fahrenheit to celsius

    public void fahrenheitActivity (View v) {

        Intent i = new Intent(this, fahrenheitActivity.class);
        startActivity(i);
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
