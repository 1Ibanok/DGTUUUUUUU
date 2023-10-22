package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity5 extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        EditText editText1=findViewById(R.id.editTextText5);
        EditText editText2=findViewById(R.id.editTextText4);
        EditText editText3=findViewById(R.id.editTextText);
        EditText editText4=findViewById(R.id.editTextText6);
        EditText editText5=findViewById(R.id.editTextText3);
        EditText editText6=findViewById(R.id.editTextText2);
        EditText editText7=findViewById(R.id.editTextText9);
        Button bt=findViewById(R.id.button111);
        intent = new Intent(this,MainActivity5.class);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp=getSharedPreferences("User", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor= sp.edit();
                editor.putString("Name",editText1.getText().toString());
                editor.putString("PhoneNum",editText2.getText().toString());
                editor.putString("Mail",editText3.getText().toString());
                editor.putString("who",editText5.getText().toString());
                editor.putString("parentsPhoneNum",editText6.getText().toString());
                editor.putString("passport",editText4.getText().toString());
                editor.putString("password",editText7.getText().toString());
                editor.putBoolean("isReg",true);
                editor.commit();
                finish();
            }
        });
    }
}