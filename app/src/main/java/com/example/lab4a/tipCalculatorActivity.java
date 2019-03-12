package com.example.lab4a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;


public class tipCalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);
    }


    public void calculateButton (View v){
        TextView b = findViewById(R.id.totalBillView);
        TextView p = findViewById(R.id.tipPercentageView);
        TextView n = findViewById(R.id.numberOfPeopleView);



        double totalAmount = Double.parseDouble(b.getText().toString());
        double tipPercentage = Double.parseDouble(p.getText().toString());
        int people = Integer.parseInt(n.getText().toString());

        double totalPerPerson = (totalAmount + (totalAmount * tipPercentage / 100) / people);

        ((TextView)findViewById(R.id.totalPerPersonView)).setText("Amount per person: $" + String.format("%.2f", totalPerPerson));
    }
}
