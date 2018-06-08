package com.example.beyzasalyador.agrickaton;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;

public class FromageDetails extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fromage_details);

        //TO ADD THE NAVIGATION DRAWER TO THE ACTIVITY
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigationdrawer_fromagedetails);
        navigationView.setNavigationItemSelectedListener(this);

        CheckBox main = (CheckBox) findViewById(R.id.main);
        CheckBox raclette = (CheckBox) findViewById(R.id.raclette);
        CheckBox cuisson = (CheckBox) findViewById(R.id.cuisson);



    }

    public void main (View view)
    {

    }

    public void raclette (View view)
    {

    }

    public void cuisson (View view)
    {

    }

    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_langues:
                Intent intent1 = new Intent(FromageDetails.this, Langues.class);
                startActivity(intent1);
                return true;

            case R.id.item_info:
                Intent intent2 = new Intent(FromageDetails.this, ExplicationAlpage.class);
                startActivity(intent2);
                return true;

            case R.id.item_recherche:
                Intent intent3 = new Intent(FromageDetails.this, Filtre.class);
                startActivity(intent3);
                return true;


            default:
                return false;
        }
    }

}
