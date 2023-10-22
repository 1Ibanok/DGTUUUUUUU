package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.renderscript.Allocation;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView tvname=findViewById(R.id.textView3);
        TextView tv=findViewById(R.id.textView21);
        ImageView imageView1=findViewById(R.id.imageView4);
        ImageView imageView2=findViewById(R.id.imageView);
        ImageView imageView3=findViewById(R.id.imageView5);
        ImageButton imageButton1=findViewById(R.id.imageButton3);
        ImageButton imageButton2=findViewById(R.id.imageButton);
        ImageButton imageButton3=findViewById(R.id.imageButton2);
        Button bt =findViewById(R.id.button);
        ImageView imageicon1=findViewById(R.id.imageView7);
        ImageView imageicon2=findViewById(R.id.imageView6);
        ImageView imageicon3=findViewById(R.id.imageView2);
        Resources resources= getResources();

        Intent intentSend=new Intent(this,MainActivity4.class);
        Intent TechMe=new Intent(this,MainActivity6.class);
        Intent intentHistory=new Intent(this,MainActivity3.class);
        imageicon2.setImageDrawable(resources.getDrawable(R.drawable.home));
        imageicon2.getLayoutParams().height=265;
        imageicon2.getLayoutParams().width=240;
        imageicon1.setImageDrawable(resources.getDrawable(R.drawable.send));
        imageicon1.getLayoutParams().height=265;
        imageicon1.getLayoutParams().width=240;
        imageicon3.setImageDrawable(resources.getDrawable(R.drawable.history));
        imageicon3.getLayoutParams().height=265;
        imageicon3.getLayoutParams().width=240;
        SharedPreferences sp2=getApplicationContext().getSharedPreferences("User", Context.MODE_PRIVATE);
        tv.setText(sp2.getString("money","56847"));

        String name=sp2.getString("Name","");
        tvname.setText(name);
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageicon1.setImageDrawable(resources.getDrawable(R.drawable.send_active));
                imageicon1.getLayoutParams().height=265;
                imageicon1.getLayoutParams().width=240;
                imageicon3.setImageDrawable(resources.getDrawable(R.drawable.history));
                imageicon2.setImageDrawable(resources.getDrawable(R.drawable.home));
                startActivity(intentSend);
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageicon2.setImageDrawable(resources.getDrawable(R.drawable.home_active));
                imageicon2.getLayoutParams().height=265;
                imageicon2.getLayoutParams().width=240;
                imageicon1.setImageDrawable(resources.getDrawable(R.drawable.send));
                imageicon3.setImageDrawable(resources.getDrawable(R.drawable.history));
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageicon3.setImageDrawable(resources.getDrawable(R.drawable.history_active));
                imageicon3.getLayoutParams().height=265;
                imageicon3.getLayoutParams().width=240;
                imageicon1.setImageDrawable(resources.getDrawable(R.drawable.send));
                imageicon2.setImageDrawable(resources.getDrawable(R.drawable.home));
                startActivity(intentHistory);
            }
        });
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(TechMe);
            }
        });
    }
}