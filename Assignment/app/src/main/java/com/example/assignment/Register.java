package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

    }
        public void register(View v){
            EditText fullname;
            EditText age;
            TextView result;
            fullname = (EditText) findViewById(R.id.fullname);
            age = (EditText) findViewById(R.id.age);
            result=(TextView)findViewById(R.id.textView8) ;
            String fname = (String.valueOf(fullname.getText())).toString();
            Integer num2 = Integer.valueOf((String.valueOf(age.getText()).toString()));
            result.setText("Your name is"+" "+fname+" "+"and"+" "+"your age is"+" "+num2);

        }




    }
