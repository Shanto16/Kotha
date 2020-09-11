package com.app.reem.kotha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {


    private VideoView videoStream;
    private Button btn_histogram;
    private TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Typeface font = Typeface.createFromAsset(getAssets(), "font/casper.ttf");


        videoStream = findViewById(R.id.vv_camera);
        btn_histogram = findViewById(R.id.btn_histo);
        tv_result = findViewById(R.id.tv_result);

//        tv_result.setTypeface(font);
    }
}