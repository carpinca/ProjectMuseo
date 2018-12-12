package com.example.dell_5547.projectmuseo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void next (View view) {
        Intent i = null;

        view.getId();
        i = new Intent(this, HomePage2.class);
            startActivity(i);

        }

    public void first (View v) {
        Intent i = null;

        v.getId();
        i = new Intent(this, ArtIsland.class);
        startActivity(i);

    }

    public void second (View v) {
        Intent i = null;

        v.getId();
        i = new Intent(this, Ayala.class);
        startActivity(i);

    }

    public void third (View v) {
        Intent i = null;

        v.getId();
        i = new Intent(this, BNakpil.class);
        startActivity(i);

    }

    public void fourth (View v) {
        Intent i = null;

        v.getId();
        i = new Intent(this, BTsinoy.class);
        startActivity(i);

    }

    public void fifth (View v) {
        Intent i = null;

        v.getId();
        i = new Intent(this, Casa.class);
        startActivity(i);

    }

    public void sixth (View v) {
        Intent i = null;

        v.getId();
        i = new Intent(this, Destileria.class);
        startActivity(i);

    }



}
