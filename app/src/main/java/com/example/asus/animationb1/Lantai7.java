package com.example.asus.animationb1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class Lantai7 extends Jalan_activity {

    ImageButton btnLeft, btnRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lantai7);

        AnimationIn();

        btnLeft = (ImageButton)findViewById(R.id.btnLeft);
        btnRight = (ImageButton)findViewById(R.id.btnRight);

        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeActivity(Kiri7.class);
            }
        });

        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {changeActivity(Kanan7.class);}});
    }

}
