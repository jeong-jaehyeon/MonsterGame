package com.example.monstergame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView monsterAnimationImage;
    AnimationDrawable animationDrawable;
    ImageView waitImage;
    ImageView replayButton;

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
        waitImage = findViewById(R.id.wait_image);
        replayButton = findViewById(R.id.replayButton);
    }

    public int setBall() {
        animationDrawable.stop();
        monsterAnimationImage.setVisibility(View.GONE);
        waitImage.setVisibility(View.VISIBLE);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        double num = Math.random();
        int ranNum = (int) (num * 100);
        return ranNum;
    }

    public void ball_click(View view) {
        switch (view.getId()) {
            case R.id.replayButton:
                waitImage.setVisibility(View.GONE);
                monsterAnimationImage.setVisibility(View.VISIBLE);
                animationDrawable.start();
                break;

            case R.id.first_Ball:
                if (setBall() <= 32) {
                    //[?]이 당첨되어 [33]% 의 확률로 포획성공 [num] ,
                    System.out.println("성공");
                } else {
                    System.out.println("실패");
                    //포획실패
                }
                break;

            case R.id.second_Ball:
                if (setBall() <= 65) {
                    //포획성공
                    System.out.println("성공");
                } else {
                    System.out.println("실패");
                    //포획실패
                }
                break;

            case R.id.third_Ball:
                if (setBall() <= 99) {
                    //포획성공
                    System.out.println("성공");
                } else {
                    System.out.println("실패");

                    //포획실패
                }
                break;

        }

    }


}
