package com.lakhmaniuk.geekhub.lakhmaniukhometask3.activities;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.lakhmaniuk.geekhub.lakhmaniukhometask3.R;

public class AnimationActivity extends Activity {

    private Animation animOne, animTwo, animThree, animFour, animFive;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animation_layout);

        imageView = (ImageView) findViewById(R.id.imageView);

        // Подгружаем все анимации
        animOne = AnimationUtils.loadAnimation(this, R.anim.alpha_animation);
        animTwo = AnimationUtils.loadAnimation(this, R.anim.rotate_animation);
        animThree = AnimationUtils.loadAnimation(this, R.anim.scale_animation);
        animFour = AnimationUtils.loadAnimation(this, R.anim.translate_animation);
        animFive = AnimationUtils.loadAnimation(this, R.anim.set_animation);

    }

    // Анимация №1
    public void onAnimationImageOne(View v){
        imageView.startAnimation(animOne);
    }

    // Анимация №2
    public void onAnimationImageTwo(View v){
        imageView.startAnimation(animTwo);
    }

    // Анимация №3
    public void onAnimationImageThree(View v){
        imageView.startAnimation(animThree);
    }

    // Анимация №4
    public void onAnimationImageFour(View v){
        imageView.startAnimation(animFour);
    }

    // Анимация №5
    public void onAnimationImageFive(View v){
        imageView.startAnimation(animFive);
    }


    public void goToMain(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }




}
