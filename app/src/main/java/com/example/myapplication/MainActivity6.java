package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {
int points=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        CheckBox chb1=findViewById(R.id.checkBox5);
        CheckBox chb2=findViewById(R.id.checkBox2);
        CheckBox chb3=findViewById(R.id.checkBox3);
        CheckBox chb4=findViewById(R.id.checkBox155);
        CheckBox chb5=findViewById(R.id.checkBox152);
        CheckBox chb6=findViewById(R.id.checkBox153);
        CheckBox chb7=findViewById(R.id.checkBox135);
        CheckBox chb8=findViewById(R.id.checkBox132);
        CheckBox chb9=findViewById(R.id.checkBox133);
        CheckBox chb10=findViewById(R.id.checkBox125);
        CheckBox chb11=findViewById(R.id.checkBox122);
        CheckBox chb12=findViewById(R.id.checkBox123);
        CheckBox chb13=findViewById(R.id.checkBox115);
        CheckBox chb14=findViewById(R.id.checkBox112);
        CheckBox chb15=findViewById(R.id.checkBox113);
        Button bt=findViewById(R.id.button5);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chb1.isChecked()){points+=1;}
                if (chb5.isChecked()){points+=1;}
                if (chb8.isChecked()){points+=1;}
                if (chb10.isChecked()){points+=1;}
                if (chb13.isChecked()){points+=1;}
                Toast toast1 = Toast.makeText(getApplicationContext(),
                        "Ваш результат: "+points, Toast.LENGTH_LONG);
                toast1.show();
                points=0;
            }
        });
    }
}