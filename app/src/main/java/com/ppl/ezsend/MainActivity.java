package com.ppl.ezsend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import com.ppl.ezsend.activity.cekharga;

public class MainActivity extends AppCompatActivity {

    ImageButton MyImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ntit);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

//        final Animation animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);

        MyImageButton = (ImageButton) findViewById(R.id.user);
        MyImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
//                V.startAnimation(animRotate);
                Intent intentLoadNewActivity = new Intent(MainActivity.this, kirim.class);

                startActivity(intentLoadNewActivity);
            }

        });

        MyImageButton = (ImageButton) findViewById(R.id.job);
        MyImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent intentLoadNewActivity = new Intent(MainActivity.this, cekresi.class);

                startActivity(intentLoadNewActivity);
            }

        });

        MyImageButton = (ImageButton) findViewById(R.id.notif);
        MyImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent intentLoadNewActivity = new Intent(MainActivity.this,cekharga.class);

                startActivity(intentLoadNewActivity);
            }

        });MyImageButton = (ImageButton) findViewById(R.id.mail);
        MyImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent intentLoadNewActivity = new Intent(MainActivity.this, drop.class);

                startActivity(intentLoadNewActivity);
            }

        });

        MyImageButton = (ImageButton) findViewById(R.id.rate);
        MyImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent intentLoadNewActivity = new Intent(MainActivity.this, contactus.class);

                startActivity(intentLoadNewActivity);
            }

        });

        MyImageButton = (ImageButton) findViewById(R.id.rev);
        MyImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent intentLoadNewActivity = new Intent(MainActivity.this, aboutus.class);

                startActivity(intentLoadNewActivity);
            }

        });


    }

}
