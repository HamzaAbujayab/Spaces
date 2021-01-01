package com.example.criminalrecord.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.criminalrecord.R;

public class Splash extends AppCompatActivity {

    private int splash_Time_Out = 4000;
    ImageView splash_image;
    TextView splash_name , splash_subName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        //Start find View By ID
        splash_image = findViewById(R.id.splash_image);
        splash_name = findViewById(R.id.splash_name);
        splash_subName = findViewById(R.id.splash_subName);
        //End find View By ID

        //Start Animation
        Animation animation =  AnimationUtils.loadAnimation(this , R.anim.anim);
        Animation animationImage =  AnimationUtils.loadAnimation(this , R.anim.anim_image);
        splash_image.startAnimation(animationImage);
        splash_name.startAnimation(animation);
        splash_subName.startAnimation(animation);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent mainIntent = new Intent(Splash.this, Login.class);
                Splash.this.startActivity(mainIntent);
                Splash.this.finish();
            }
        }, splash_Time_Out);
        //End Animation

    }
}
