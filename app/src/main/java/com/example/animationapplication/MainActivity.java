package com.example.animationapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button zoomin,zoomout,fadein,fadeout,slideleft,slideright,slideup,slidedown;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageview);

        zoomin = findViewById(R.id.zoomin);
        zoomin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoomin));
            }
        });

        zoomout = findViewById(R.id.zoomout);
        zoomout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoomout));
            }
        });
        fadein = findViewById(R.id.fadein);
        fadein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fadein));
            }
        });
        fadeout = findViewById(R.id.fadeout);
        fadeout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fadeout));
            }
        });
        slideleft = findViewById(R.id.slideleft);
        slideleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slideleft));
            }
        });
        slideright = findViewById(R.id.slideright);
        slideright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slideright));
            }
        });
        slideup = findViewById(R.id.slideup);
        slideup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slideup));
            }
        });
        slidedown = findViewById(R.id.slidedown);
        slidedown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slidedown));
            }
        });


    }
}