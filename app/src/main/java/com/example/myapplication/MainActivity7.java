package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        EditText ed=findViewById(R.id.editTextText10);
        EditText editText=findViewById(R.id.editTextText11);
        TextView tv1=findViewById(R.id.textView52);
        TextView tv2=findViewById(R.id.textView62);
        TextView tv3=findViewById(R.id.textView72);
        TextView tv4=findViewById(R.id.textView82);
        TextView tv5=findViewById(R.id.textView92);
        TextView tv6=findViewById(R.id.textView102);
        TextView tv7=findViewById(R.id.textView112);
        Button bt1=findViewById(R.id.button51);
        Button bt2=findViewById(R.id.button61);
        Button bt3=findViewById(R.id.button71);
        Button bt4=findViewById(R.id.button81);
        Button bt5=findViewById(R.id.button91);
        Button bt6=findViewById(R.id.button101);
        Button bt7=findViewById(R.id.button111);
        Button btsend=findViewById(R.id.button22);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(tv1.getText().toString());
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(tv2.getText().toString());
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(tv3.getText().toString());
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(tv4.getText().toString());
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(tv5.getText().toString());
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(tv6.getText().toString());
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(tv7.getText().toString());
            }
        });
        btsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast1 = Toast.makeText(getApplicationContext(),
                        "Перевод по номеру \n"+ed.getText().toString()+"\n"+"На сумму \n"+editText.getText().toString()+"\n"+"Успешно завершен"+"\n", Toast.LENGTH_LONG);
                toast1.show();
                editText.setText("");
                ed.setText("");
            }
        });

    }
}