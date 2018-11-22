package com.example.dell_5547.projectmuseo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomePage2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page2);
    }


    public void back (View v) {
        Intent i = null;

        v.getId();
        i = new Intent(this, HomePage.class);
        startActivity(i);

    }

    public void one (View v) {
        Intent i = null;

        v.getId();
        i = new Intent(this, Metro.class);
        startActivity(i);

    }

    public void two (View v) {
        Intent i = null;

        v.getId();
        i = new Intent(this, Money.class);
        startActivity(i);

    }

    public void three (View v) {
        Intent i = null;

        v.getId();
        i = new Intent(this, Pambata.class);
        startActivity(i);

    }

    public void four (View v) {
        Intent i = null;

        v.getId();
        i = new Intent(this, Contemp.class);
        startActivity(i);

    }

    public void five (View v) {
        Intent i = null;

        v.getId();
        i = new Intent(this, National.class);
        startActivity(i);

    }

    public void six (View v) {
        Intent i = null;

        v.getId();
        i = new Intent(this, Pasig.class);
        startActivity(i);

    }
}
