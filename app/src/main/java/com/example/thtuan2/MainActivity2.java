package com.example.thtuan2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // we are adding fade animation, between two imageviews.
        Fade fade = new Fade();
        View decor = getWindow().getDecorView();

        // we are adding fade animation for enter transition.
        getWindow().setEnterTransition(fade);

        // we are also setting fade animation for exit transition.
        getWindow().setExitTransition(fade);
        // initializing our imageview.

        final ImageView imageView = findViewById(R.id.imageView6);
        // setting on click listener for our imageview.
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // and adding animation between this two activities.
                Intent intent = new Intent(MainActivity2.this,
                        MainActivity3.class);
                // below method is used to make scene transition
                // and adding fade animation in it.
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                MainActivity2.this, imageView,
                                ViewCompat.getTransitionName(imageView));

                // starting our activity with below method.
                startActivity(intent, options.toBundle());
            }
        });
        final ImageView imageView2 = findViewById(R.id.imageView4);
        // setting on click listener for our imageview.
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // and adding animation between this two activities.
                Intent intent = new Intent(MainActivity2.this,
                        MainActivity4.class);
                // below method is used to make scene transition
                // and adding fade animation in it.
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                MainActivity2.this, imageView2,
                                ViewCompat.getTransitionName(imageView2));

                // starting our activity with below method.
                startActivity(intent, options.toBundle());
            }
        });

    }
}