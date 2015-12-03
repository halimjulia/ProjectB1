package com.example.asus.animationb1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;

public class Kanan7 extends Jalan_activity {

    ImageView ivRight7;
    ImageButton btnRight712, btnLeft712;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kanan7);

        AnimationIn();

        ivRight7 = (ImageView)findViewById(R.id.ivRight7);
        btnRight712 = (ImageButton)findViewById(R.id.btnRight712);
        btnLeft712 = (ImageButton)findViewById(R.id.btnLeft712);

        btnRight712.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeActivity(kanan712.class);
            }
        });

        btnLeft712.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               changeActivity(kiri712.class);
            }
        });
    }

}
