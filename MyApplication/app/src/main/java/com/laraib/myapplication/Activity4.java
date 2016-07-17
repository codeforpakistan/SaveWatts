package com.laraib.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {

    TextView t1, t2, t3;
    ImageView img1, img2, img3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        t1=(TextView) findViewById(R.id.textView4);
        t2=(TextView) findViewById(R.id.textView5);
        t3=(TextView) findViewById(R.id.textView6);

        img1=(ImageView) findViewById(R.id.imageView2);
        img1.setImageResource(R.drawable.tag1);

        img2=(ImageView) findViewById(R.id.imageView4);
        img2.setImageResource(R.drawable.tag2);

        img3=(ImageView) findViewById(R.id.imageView3);
        img3.setImageResource(R.drawable.tag3);




    }
}
