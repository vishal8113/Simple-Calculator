package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.zip.DeflaterOutputStream;

public class MainActivity extends AppCompatActivity {

    EditText etn1 ,etn2;
    Button btn1,btn2,btn3,btn4;
    TextView tv;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etn1 = findViewById(R.id.et1);
        etn2 = findViewById(R.id.et2);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        tv = findViewById(R.id.tv);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int first, second, result;
                first = Integer.parseInt(etn1.getText().toString());
                second = Integer.parseInt(etn2.getText().toString());

                result = first + second;
                tv.setText("Result is " + result);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int first, second, result;
                first = Integer.parseInt(etn1.getText().toString());
                second = Integer.parseInt(etn2.getText().toString());

                result = first - second;
                tv.setText("Result is " + result);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int first, second, result;
                first = Integer.parseInt(etn1.getText().toString());
                second = Integer.parseInt(etn2.getText().toString());

                result = first * second;
                tv.setText("Result is " + result);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float first,second,result;
                first = Float.parseFloat(etn1.getText().toString());
                second = Float.parseFloat(etn2.getText().toString());

                result = first / second;
                tv.setText("Result is " + result);
            }
        });


    }
}