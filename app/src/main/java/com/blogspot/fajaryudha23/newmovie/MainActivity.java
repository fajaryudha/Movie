package com.blogspot.fajaryudha23.newmovie;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.blogspot.fajaryudha23.newmovie.NowPlaying.NowPlaying;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        CardView cv_now_playing = (CardView) findViewById(R.id.cardView_now_playing);
        CardView cv_popular = (CardView) findViewById(R.id.cardView_popular);
        CardView cv_top_rated = (CardView) findViewById(R.id.cardView_top_rated);
        CardView cv_upcoming = (CardView) findViewById(R.id.action_upcoming);
        RecyclerView rv_now_playing = (RecyclerView) findViewById(R.id.recyclerview_now_playing);
        RecyclerView rv_popular = (RecyclerView) findViewById(R.id.cardView_popular);
        RecyclerView rv_top_rated = (RecyclerView) findViewById(R.id.cardView_top_rated);
        RecyclerView rv_upcoming = (RecyclerView) findViewById(R.id.action_upcoming);

        cv_now_playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_now_playing) {
            return true;
        } else if (id == R.id.action_popular){
            return true;
        } else if (id == R.id.action_top_rated){
            return true;
        } else if (id == R.id.action_upcoming){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
