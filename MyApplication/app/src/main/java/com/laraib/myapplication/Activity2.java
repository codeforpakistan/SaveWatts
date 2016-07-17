package com.laraib.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

public class Activity2 extends AppCompatActivity {
    ListView lv;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Bundle bundle = getIntent().getExtras();
        String category = bundle.getString("category");

        Log.d("category", category);

        CustomAdapter.activity="2";

        if(category.equals("Air Conditioners"))
        {
            context=this;

            int [] prgmImages={R.drawable.images5,R.drawable.images6,R.drawable.images7,R.drawable.images8,R.drawable.images9};
            String [] prgmNameList={"1 Ton","1.5 Tons","2 Tons","2.5 Tons","3 Tons"};

            lv=(ListView) findViewById(R.id.listView);
            lv.setAdapter(new CustomAdapter(this, prgmNameList,prgmImages));
        }

        else
        {
            context=this;

            int [] prgmImages={R.drawable.images5,R.drawable.images6,R.drawable.images7,R.drawable.images8,R.drawable.images9};
            String [] prgmNameList={"Amet","Consectetur","Adipiscing","Elit","Sed","Lorem"};

            lv=(ListView) findViewById(R.id.listView);
            lv.setAdapter(new CustomAdapter(this, prgmNameList,prgmImages));
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }

}
