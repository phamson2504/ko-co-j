package com.example.thtuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    ImageView img_music;
    ImageView img_taylor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        img_music = findViewById(R.id.imageView7);
        img_taylor = findViewById(R.id.imageView5);


        Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.aniblink);


        img_music.startAnimation(animation1);
     
    }
}