package com.example.asus.animationb1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;

public class kiri712 extends Jalan_activity {

    ImageView ivLeft712;
    ImageButton btn700, btn721;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kiri712);

        AnimationIn();

        ivLeft712 = (ImageView)findViewById(R.id.ivLeft712);
        btn700 = (ImageButton)findViewById(R.id.btn700);
        btn721 = (ImageButton)findViewById(R.id.btn721);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_kiri712, menu);
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
