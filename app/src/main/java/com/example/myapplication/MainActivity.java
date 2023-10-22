package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
static int count=0;
static String pas="";
    Intent intent;
    TextView deb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView=(TextView) findViewById(R.id.textView2);
        deb=(TextView) findViewById(R.id.textView);
        Button button0 =(Button) findViewById(R.id.button19);
        Button button1 =(Button) findViewById(R.id.button11);
        Button button2 =(Button) findViewById(R.id.button17);
        Button button3 =(Button) findViewById(R.id.button12);
        Button button4 =(Button) findViewById(R.id.button16);
        Button button5 =(Button) findViewById(R.id.button10);
        Button button6 =(Button) findViewById(R.id.button13);
        Button button7 =(Button) findViewById(R.id.button14);
        Button button8 =(Button) findViewById(R.id.button15);
        Button button9 =(Button) findViewById(R.id.button18);


        intent=new Intent(this, MainActivity5.class);
        SharedPreferences sp2=getApplicationContext().getSharedPreferences("User", Context.MODE_PRIVATE);
        boolean b=sp2.getBoolean("isReg",false);
        /*String pass=sp2.getString("password","");
        */
        if (!b);
        {
            if (!b)
            {
                startActivity(intent);
            }
        }

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"0");
                count+=1;
                pas=textView.getText().toString();
                passwordRec();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"1");
                count+=1;
                pas=textView.getText().toString();
                passwordRec();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"2");
                count+=1;
                pas=textView.getText().toString();
                passwordRec();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"3");
                count+=1;
                pas=textView.getText().toString();
                passwordRec();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"4");
                count+=1;
                pas=textView.getText().toString();
                passwordRec();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"5");
                count+=1;
                pas=textView.getText().toString();
                passwordRec();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"6");
                count+=1;
                pas=textView.getText().toString();
                passwordRec();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"7");
                count+=1;
                pas=textView.getText().toString();
                passwordRec();
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"8");
                count+=1;
                pas=textView.getText().toString();
                passwordRec();
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"9");
                count+=1;
                pas=textView.getText().toString();
                passwordRec();
            }
        });


    }
    void passwordRec()
    {

        SharedPreferences sp2=getApplicationContext().getSharedPreferences("User", Context.MODE_PRIVATE);
        String pass=sp2.getString("password","");
        if (pas.equals(pass))
        {
            Toast toast1 = Toast.makeText(getApplicationContext(),
                    "Вход успешно завершен", Toast.LENGTH_SHORT);
            toast1.show();
            Intent intent1=new Intent(this, MainActivity2.class);
            startActivity(intent1);
        }
    }
}