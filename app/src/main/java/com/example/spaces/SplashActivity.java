package com.example.spaces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    private int splash_Time_Out = 4000;
    ImageView splash_image;
    TextView splash_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Start find View By ID
        splash_image = findViewById(R.id.splash_image);
        splash_name = findViewById(R.id.splash_name);
        //End find View By ID

        String android_id = Settings.Secure.getString(getApplicationContext().getContentResolver(), Settings.Secure.ANDROID_ID);
        Log.d("android_id" , android_id);

        //Start Animation
        Animation animation =  AnimationUtils.loadAnimation(this , R.anim.anim);
        Animation animationImage =  AnimationUtils.loadAnimation(this , R.anim.anim_image);
        splash_image.startAnimation(animationImage);
        splash_name.startAnimation(animation);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent mainIntent = new Intent(SplashActivity.this, MainActivity.class);
                SplashActivity.this.startActivity(mainIntent);
                SplashActivity.this.finish();
            }
        }, splash_Time_Out);
        //End Animation

    }
}
