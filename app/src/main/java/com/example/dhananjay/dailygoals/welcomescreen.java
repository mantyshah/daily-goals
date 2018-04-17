package com.example.dhananjay.dailygoals;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class welcomescreen extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 4000;

    ImageView wakingupIcon, bathingIcon, eatingIcon, runningIcon, cookingIcon, sleepingIcon  ;
    TextView appName, punchLine;
    Button trackGoals;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcomescreen);

        appName = findViewById(R.id.appName);
        wakingupIcon = findViewById(R.id.wakingupIcon);
        bathingIcon = findViewById(R.id.bathingIcon);
        eatingIcon = findViewById(R.id.eatingIcon);
        runningIcon = findViewById(R.id.runningIcon);
        cookingIcon = findViewById(R.id.cookingIcon);
        sleepingIcon = findViewById(R.id.sleepingIcon);
        punchLine = findViewById(R.id.punchLine);
        trackGoals = findViewById(R.id.trackGoals);

        Animation animWakingUp = AnimationUtils.loadAnimation(welcomescreen.this, R.anim.anim);
        animWakingUp.setInterpolator((new AccelerateDecelerateInterpolator()));
        animWakingUp.setFillAfter(true);
        wakingupIcon.setAnimation(animWakingUp);

        Animation animbathing = AnimationUtils.loadAnimation(welcomescreen.this, R.anim.animbathing);
        animbathing.setInterpolator((new AccelerateDecelerateInterpolator()));
        animbathing.setFillAfter(true);
        bathingIcon.setAnimation(animbathing);

        Animation animeating = AnimationUtils.loadAnimation(welcomescreen.this, R.anim.animeating);
        animeating.setInterpolator((new AccelerateDecelerateInterpolator()));
        animeating.setFillAfter(true);
        eatingIcon.setAnimation(animeating);

        Animation animrunning = AnimationUtils.loadAnimation(welcomescreen.this, R.anim.animrunning);
        animrunning.setInterpolator((new AccelerateDecelerateInterpolator()));
        animrunning.setFillAfter(true);
        runningIcon.setAnimation(animrunning);

        Animation animCookingIcon = AnimationUtils.loadAnimation(welcomescreen.this, R.anim.animcooking);
        animCookingIcon.setInterpolator((new AccelerateDecelerateInterpolator()));
        animCookingIcon.setFillAfter(true);
        cookingIcon.setAnimation(animCookingIcon);

        Animation animSleepingIcon = AnimationUtils.loadAnimation(welcomescreen.this, R.anim.animsleeping);
        animSleepingIcon.setInterpolator((new AccelerateDecelerateInterpolator()));
        animSleepingIcon.setFillAfter(true);
        sleepingIcon.setAnimation(animSleepingIcon);


        Animation animName = AnimationUtils.loadAnimation(welcomescreen.this, R.anim.animuptodown);
        animName.setInterpolator((new AccelerateDecelerateInterpolator()));
        animName.setFillAfter(true);
        appName.setAnimation(animName);

        Animation animPunchLine = AnimationUtils.loadAnimation(welcomescreen.this, R.anim.scaleup);
        animPunchLine.setInterpolator((new AccelerateDecelerateInterpolator()));
        animPunchLine.setFillAfter(true);
        punchLine.setAnimation(animPunchLine);

        Animation animTrackGoals = AnimationUtils.loadAnimation(welcomescreen.this, R.anim.animdowntoup);
        animTrackGoals.setInterpolator((new AccelerateDecelerateInterpolator()));
        animTrackGoals.setFillAfter(true);
        trackGoals.setAnimation(animTrackGoals);

        trackGoals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(welcomescreen.this, MainActivity.class));
                finish();
            }
        });



    }
}
