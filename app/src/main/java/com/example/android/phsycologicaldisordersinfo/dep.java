package com.example.android.phsycologicaldisordersinfo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by naveen on 5/26/2016.
 */
public class dep extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_recycle_view);

        Integer receive = getIntent().getExtras().getInt("id");

        switch (receive) {
            case 2: {
                ImageView img = (ImageView) findViewById(R.id.img_one);
                img.setPadding(110, 30, 3, 3);
                img.setImageResource(R.drawable.dep);

                TextView tv = (TextView) findViewById(R.id.text_view);
                tv.setText(R.string.depinfo);
            }
            break;
            case 1: {
                ImageView img = (ImageView) findViewById(R.id.img_one);
                img.setPadding(110, 30, 3, 3);
                img.setImageResource(R.drawable.dep);

                TextView tv = (TextView) findViewById(R.id.text_view);
                tv.setText(R.string.deptests);
            }
            break;

        }

    }
}
