package com.laraib.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    LinearLayout layout;
    TextView t1, t2, t3;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        layout = (LinearLayout) findViewById(R.id.layout);
        t1=(TextView) findViewById(R.id.textView);
        t2=(TextView) findViewById(R.id.textView2);
        t3=(TextView) findViewById(R.id.textView3);

        img=(ImageView) findViewById(R.id.imageView);
        img.setImageResource(R.drawable.img1);


    }

    public void next(View v){
        Intent i = new Intent(this, Activity4.class);
        startActivity(i);
    }
}
