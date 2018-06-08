package com.example.beyzasalyador.agrickaton;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;

public class AlpageDetails extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpage_details);

        //TO ADD THE NAVIGATION DRAWER TO THE ACTIVITY
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigationdrawer_alpagedetails);
        navigationView.setNavigationItemSelectedListener(this);

        CheckBox degustation = (CheckBox) findViewById(R.id.degustation);
        CheckBox pointdevente = (CheckBox) findViewById(R.id.pointdevente);
        CheckBox beurre = (CheckBox) findViewById(R.id.beurre);
        CheckBox creme = (CheckBox) findViewById(R.id.creme);
        CheckBox serac = (CheckBox) findViewById(R.id.serac);
        CheckBox yogurt = (CheckBox) findViewById(R.id.yogurt);

    }

    public void degustation (View view) {}
    public void pointdevente (View view) {}
    public void beurre (View view) {}
    public void creme (View view) {}
    public void serac (View view) {}
    public void yogurt (View view) {}


    public void notrefromage(View view){
        Intent intent = new Intent(AlpageDetails.this, FromageDetails.class);
        startActivity(intent);
    }

    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_langues:
                Intent intent1 = new Intent(AlpageDetails.this, Langues.class);
                startActivity(intent1);
                return true;

            case R.id.item_info:
                Intent intent2 = new Intent(AlpageDetails.this, ExplicationAlpage.class);
                startActivity(intent2);
                return true;

            case R.id.item_recherche:
                Intent intent3 = new Intent(AlpageDetails.this, Filtre.class);
                startActivity(intent3);
                return true;


            default:
                return false;
        }
    }
}
