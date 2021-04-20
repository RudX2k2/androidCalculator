package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    String num = "";

    public void On7ButtonClick(View v) {
        TextView tv = (TextView) findViewById(R.id.result);
        num += "7";
        tv.setText(num);
    }

    public void On8ButtonClick(View v) {
        TextView tv = (TextView) findViewById(R.id.result);
        num += "8";
        tv.setText(num);
    }

    public void On9ButtonClick(View v) {
        TextView tv = (TextView) findViewById(R.id.result);
        num += "9";
        tv.setText(num);
    }

    public void OnResultButtonClick(View v) {


        String[] parts = num.split("[\\*-\\+\\/]");

        char[] symb = new char[parts.length - 1];
        int j = 0;
        for (int i = 0; i < num.toCharArray().length; i++) {
            if (num.toCharArray()[i] == '+' || num.toCharArray()[i] == '-' || num.toCharArray()[i] == '*' || num.toCharArray()[i] == '/') {
                symb[j] = num.toCharArray()[i];
                j++;
            }
        }
        String result = "";
        for (int k = 0; k < parts.length; k++) {
            switch (symb[k]) {
                case '+':
                    result = String.valueOf(Double.parseDouble(parts[k]) + Double.parseDouble(parts[k+1]));
                    break;
                case '-':
                    result = String.valueOf(Double.parseDouble(parts[k]) - Double.parseDouble(parts[k+1]));
                    break;
                case '*':
                    result = String.valueOf(Double.parseDouble(parts[k]) * Double.parseDouble(parts[k+1]));
                    break;
                case '/':
                    result = String.valueOf(Double.parseDouble(parts[k]) / Double.parseDouble(parts[k+1]));
                    break;
                default:
                    break;
            }

        }
        TextView tv = (TextView) findViewById(R.id.result);
        tv.setText(result);
    }

    public void OnMultiplyButtonClick(View v) {
        TextView tv = (TextView) findViewById(R.id.result);
        num += "*";
        tv.setText(num);
    }

    public void OnDivideButtonClick(View v) {
        TextView tv = (TextView) findViewById(R.id.result);
        num += "/";
        tv.setText(num);
    }
}
