package com.example.android.phsycologicaldisordersinfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.koushikdutta.ion.Ion;

public class MainActivity extends Activity implements OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView gif = (ImageView) findViewById(R.id.imageView);

        Ion.with(gif).load("https://67.media.tumblr.com/cacca21303f573301e57e28a12dd29bb/tumblr_o2ll5t0Svj1ukofkbo1_r3_400.gif");

        //onclick listeners for buttons

        View infoButton = findViewById(R.id.psy_info);
        infoButton.setOnClickListener(this);

        View doctorsButton = findViewById(R.id.Doctors);
        doctorsButton.setOnClickListener(this);

        View testsButton = findViewById(R.id.tests);
        testsButton.setOnClickListener(this);

        View aboutButton = findViewById(R.id.about);
        aboutButton.setOnClickListener(this);

    }

    //onclick function which listens for clicks
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.about:
                Intent aboutIntent = new Intent(this, about.class);
                startActivity(aboutIntent);
                break;
            case R.id.tests:
                Intent testsIntent = new Intent(this, tests.class);
                startActivity(testsIntent);
                break;
            case R.id.Doctors:
                Intent doctorsIntent = new Intent(this, doctors.class);
                startActivity(doctorsIntent);
                break;
            case R.id.psy_info:
                Intent infoIntent = new Intent(this, info.class);
                startActivity(infoIntent);
                break;
        }
    }
}

