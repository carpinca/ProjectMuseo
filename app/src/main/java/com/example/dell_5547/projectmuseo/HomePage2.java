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

    public void metro (View v) {
        Intent i = null;

        v.getId();
        i = new Intent(this, Metro.class);
        startActivity(i);

    }

    public void money (View v) {
        Intent i = null;

        v.getId();
        i = new Intent(this, Money.class);
        startActivity(i);

    }

    public void pambata (View v) {
        Intent i = null;

        v.getId();
        i = new Intent(this, Pambata.class);
        startActivity(i);

    }

    public void national (View v) {
        Intent i = null;

        v.getId();
        i = new Intent(this, National.class);
        startActivity(i);

    }

    public void pasig (View v) {
        Intent i = null;

        v.getId();
        i = new Intent(this, Pasig.class);
        startActivity(i);

    }

    public void agustin (View v) {
        Intent i = null;

        v.getId();
        i = new Intent(this, Agustin.class);
        startActivity(i);

    }
}
