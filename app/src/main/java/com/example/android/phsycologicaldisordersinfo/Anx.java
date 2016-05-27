package com.example.android.phsycologicaldisordersinfo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by naveen on 5/26/2016.
 */
public class Anx extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_recycle_view);


        Integer receive = getIntent().getExtras().getInt("id");

        if (2 == receive) {
            ImageView img = (ImageView) findViewById(R.id.img_one);
            img.setImageResource(R.drawable.anx);

            TextView tv = (TextView) findViewById(R.id.text_view);
            tv.setText(R.string.anxinfo);
        } else {
            ImageView img = (ImageView) findViewById(R.id.img_one);
            img.setImageResource(R.drawable.anx);

            TextView tv = (TextView) findViewById(R.id.text_view);
            tv.setText(R.string.anxtests);
        }


    }


}

