package com.glemontree.animationdemo;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button button1, button2, button3;
    private ImageView animationIV;
    private ImageView animationIV2;
    private ImageView animationIV3;
    private AnimationDrawable AniDraw, AniDraw2, AniDraw3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(android.R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(AniDraw.isRunning()) {
                    AniDraw.stop();
                } else {
                    AniDraw.start();
                }
            }
        });

        button2 = (Button) findViewById(android.R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(AniDraw2.isRunning()) {
                    AniDraw2.stop();
                } else {
                    AniDraw2.start();
                }
            }
        });

        button3 = (Button) findViewById(android.R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(AniDraw3.isRunning()) {
                    AniDraw3.stop();
                } else {
                    AniDraw3.start();
                }
            }
        });

        animationIV = (ImageView) findViewById(R.id.animationIV);
        animationIV.setBackgroundResource(R.anim.load_animation_1);
        AniDraw = (AnimationDrawable) animationIV.getBackground();

        animationIV2 = (ImageView)findViewById(R.id.animationIV2);
        AniDraw2 = (AnimationDrawable)animationIV2.getDrawable();
        animationIV3 = (ImageView)findViewById(R.id.animationIV3);
        animationIV3.setImageResource(R.anim.wifi_animation_1);
        AniDraw3 = (AnimationDrawable)animationIV3.getDrawable();
    }
}
