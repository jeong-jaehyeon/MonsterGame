package com.example.monstergame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView monsterAnimationImage;
    AnimationDrawable animationDrawable;

//    ImageView firstBall;
//    ImageView secondBall;
//    ImageView thirdBall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        firstBall = findViewById(R.id.first_Ball);
//        secondBall = findViewById(R.id.second_Ball);
//        thirdBall = findViewById(R.id.third_Ball);

        monsterAnimationImage = findViewById(R.id.monster_animation_image);
        animationDrawable = (AnimationDrawable) monsterAnimationImage.getDrawable();
        animationDrawable.start();
    }

    public void ball_click(View view) {
        switch (view.getId()) {
            case R.id.first_Ball :

        }

    }

}
