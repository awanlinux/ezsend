package com.ppl.ezsend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton MyImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyImageButton = (ImageButton) findViewById(R.id.My_Image_Button);
        MyImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent intentLoadNewActivity = new Intent(MainActivity.this, aboutus.class);

                startActivity(intentLoadNewActivity);
            }

        });

        MyImageButton = (ImageButton) findViewById(R.id.imageButton5);
        MyImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent intentLoadNewActivity = new Intent(MainActivity.this,cekharga.class);

                startActivity(intentLoadNewActivity);
            }

        });

        MyImageButton = (ImageButton) findViewById(R.id.imageButton6);
        MyImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent intentLoadNewActivity = new Intent(MainActivity.this, cekresi.class);

                startActivity(intentLoadNewActivity);
            }

        });

        MyImageButton = (ImageButton) findViewById(R.id.imageButton7);
        MyImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent intentLoadNewActivity = new Intent(MainActivity.this, contactus.class);

                startActivity(intentLoadNewActivity);
            }

        });

        MyImageButton = (ImageButton) findViewById(R.id.imageButton8);
        MyImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                Intent intentLoadNewActivity = new Intent(MainActivity.this, droppoint.class);

                startActivity(intentLoadNewActivity);
            }

        });
    }

}
