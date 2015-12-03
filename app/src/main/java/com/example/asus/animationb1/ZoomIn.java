package com.example.asus.animationb1;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class ZoomIn extends Activity implements Animation.AnimationListener {

    ImageView imageView;
    Button btnStart;

    //Animation
    Animation animZoomIn;

    @Override //This will be triggered once the animation is over
    public void onAnimationEnd(Animation animation) {
        // Take any action after completing the animation
        // check for fade in animation
        if (animation == animZoomIn) {
            Toast.makeText(getApplicationContext(), "Animation Stopped",
                    Toast.LENGTH_SHORT).show();
        }
    }

    @Override //This will be triggered once the animation started
    public void onAnimationStart(Animation animation) {

    }

    @Override //This will be triggered if the animation repeats
    public void onAnimationRepeat(Animation animation) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView)findViewById(R.id.imageView);
        btnStart = (Button)findViewById(R.id.btnStart);

        //load the animation
        animZoomIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);


        //set Animation Listener
        animZoomIn.setAnimationListener(this);
        imageView.startAnimation(animZoomIn);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);

                // start the animation
                imageView.startAnimation(animZoomIn);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_zoom_in, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
