package com.dunst.tracebucket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ashokslsk.tracebucket.TraceBucket;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TraceBucket.init(getClass().getSimpleName(), true);
        TraceBucket.log("You are in oncreate");
    }
}
