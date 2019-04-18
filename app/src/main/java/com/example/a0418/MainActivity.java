package com.example.a0418;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tr,tg,tb;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tr=findViewById(R.id.textView3);
        TextView tg=findViewById(R.id.textView4);
        TextView tb=findViewById(R.id.textView5);

        Button bt=findViewById(R.id.button);


    }
}
