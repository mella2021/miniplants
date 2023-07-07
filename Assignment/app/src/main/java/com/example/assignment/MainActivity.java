package com.example.assignment;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.click);

        btn.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Register.class);
                startActivity(intent);
            }

        });}

        public void addition(View v){
            EditText number1;
            EditText number2;
            TextView result;
            number1 = (EditText) findViewById(R.id.num1);
            number2 = (EditText) findViewById(R.id.num2);
            result=(TextView)findViewById(R.id.result);
            float num1 = Float.parseFloat(Float.valueOf(String.valueOf(number1.getText())).toString());
            float num2 = Float.parseFloat(Float.valueOf(String.valueOf(number2.getText())).toString());
            float re = num1 + num2;
          result.setText(String.valueOf(re));

    }
    public void subtraction(View v){
        EditText number1;
        EditText number2;
        TextView result;
        number1 = (EditText) findViewById(R.id.num1);
        number2 = (EditText) findViewById(R.id.num2);
        result=(TextView)findViewById(R.id.result);
        float num1 = Float.parseFloat(Float.valueOf(String.valueOf(number1.getText())).toString());
        float num2 = Float.parseFloat(Float.valueOf(String.valueOf(number2.getText())).toString());
        float re = num1 - num2;
        result.setText(String.valueOf(re));

    }
    public void multiplication(View v){
        EditText number1;
        EditText number2;
        TextView result;
        number1 = (EditText) findViewById(R.id.num1);
        number2 = (EditText) findViewById(R.id.num2);
        result=(TextView)findViewById(R.id.result);
        float num1 = Float.parseFloat(Float.valueOf(String.valueOf(number1.getText())).toString());
        float num2 = Float.parseFloat(Float.valueOf(String.valueOf(number2.getText())).toString());
        float re = num1 * num2;
        result.setText(String.valueOf(re));

    }
    public void division(View v){
        EditText number1;
        EditText number2;
        TextView result;
        number1 = (EditText) findViewById(R.id.num1);
        number2 = (EditText) findViewById(R.id.num2);
        result=(TextView)findViewById(R.id.result);
        float num1 = Float.parseFloat(Float.valueOf(String.valueOf(number1.getText())).toString());
        float num2 = Float.parseFloat(Float.valueOf(String.valueOf(number2.getText())).toString());
        float re = num1 / num2;
        result.setText(String.valueOf(re));

    }
    }




