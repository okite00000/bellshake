package com.example.animationex02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bell = findViewById(R.id.bell);
        Animation aniShake = AnimationUtils.loadAnimation(MainActivity.this, R.anim.shake);
        bell.startAnimation(aniShake);


    }
}
