package com.example.android.phsycologicaldisordersinfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by naveen on 5/27/2016.
 */
public class tests extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);


        View alzhimersImg = findViewById(R.id.img_alz);
        alzhimersImg.setOnClickListener(this);

        View eatingDisorderImg = findViewById(R.id.img_eat);
        eatingDisorderImg.setOnClickListener(this);

        View anxietyImg = findViewById(R.id.img_anx);
        anxietyImg.setOnClickListener(this);

        View schizophreniaImg = findViewById(R.id.img_scz);
        schizophreniaImg.setOnClickListener(this);

        View depressionImg = findViewById(R.id.img_dep);
        depressionImg.setOnClickListener(this);
    }

    //onclick function which listens for clicks
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.img_alz:
                Intent imgalz = new Intent(this, Alz.class);
                imgalz.putExtra("id", 1);
                startActivity(imgalz);
                break;
            case R.id.img_eat:
                Intent imgeat = new Intent(this, Eat.class);
                imgeat.putExtra("id", 1);
                startActivity(imgeat);
                break;
            case R.id.img_anx:
                Intent imganx = new Intent(this, Anx.class);
                imganx.putExtra("id", 1);
                startActivity(imganx);
                break;
            case R.id.img_scz:
                Intent imgscz = new Intent(this, scz.class);
                imgscz.putExtra("id", 1);
                startActivity(imgscz);
                break;
            case R.id.img_dep:
                Intent imgdep = new Intent(this, dep.class);
                imgdep.putExtra("id", 1);
                startActivity(imgdep);
                break;
        }
    }

}
