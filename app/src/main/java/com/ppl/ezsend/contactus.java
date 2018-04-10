package com.ppl.ezsend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class contactus extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);
        this.setTitle("Contact Us");


        btn1 = (Button)findViewById(R.id.satu);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(contactus.this, CkirimPaket.class);

                startActivity(intentLoadNewActivity);
            }
        });

        btn2 = (Button) findViewById(R.id.dua);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(contactus.this, PsampaiMana.class);

                startActivity(intentLoadNewActivity);
            }
        });

        btn3 = (Button) findViewById(R.id .tiga);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(contactus.this, droppoinTerdekat.class);

                startActivity(intentLoadNewActivity);
            }
        });

        btn4 = (Button) findViewById(R.id .hubungikami);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(contactus.this, hubungi_kami.class);

                startActivity(intentLoadNewActivity);
            }
        });


    };


}
