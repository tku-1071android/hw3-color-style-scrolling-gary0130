package com.example.a0418;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView tr,tg,tb,vie;
    Button bt;
    String tt="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         tr=findViewById(R.id.textView3);
         tg=findViewById(R.id.textView4);
         tb=findViewById(R.id.textView5);
         vie=findViewById(R.id.textView6);

        Button bt=findViewById(R.id.button);


    }

    public void change(View v){
        Random r=new Random();
        int red=r.nextInt(256);
        int green=r.nextInt(256);
        int blue=r.nextInt(256);

        tr.setText("RED:"+red);
        tg.setText("GREEN:"+green);
        tb.setText("BLUE:"+blue);

        tr.setTextColor(Color.rgb(red,0,0));
        tg.setTextColor(Color.rgb(0,green,0));
        tb.setTextColor(Color.rgb(0,0,blue));

        tt=red+" ,"+green+" ,"+blue+"\n"+tt;
        vie.setTextSize(16);
        vie.setText(tt);
        vie.setMovementMethod(new ScrollingMovementMethod());
        vie.setBackgroundColor(Color.rgb(red,green,blue));



    }

}
