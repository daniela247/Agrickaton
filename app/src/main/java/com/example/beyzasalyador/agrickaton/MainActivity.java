package com.example.beyzasalyador.agrickaton;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TO ADD THE NAVIGATION DRAWER TO THE ACTIVITY
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigationdrawer_listealpages);
        navigationView.setNavigationItemSelectedListener(this);

        String[] tousLesAlpages = {"Alpage de la Loutze", "Alpage Collombey-Muraz", "Alpage de Sion"};

        ListView listView = (ListView)findViewById(R.id.listview_houses);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, tousLesAlpages);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, AlpageDetails.class);
                startActivity(intent);
            }
        });
    }

    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_langues:
                Intent intent1 = new Intent(MainActivity.this, Langues.class);
                startActivity(intent1);
                return true;

            case R.id.item_info:
                Intent intent2 = new Intent(MainActivity.this, ExplicationAlpage.class);
                startActivity(intent2);
                return true;

            case R.id.item_recherche:
                Intent intent3 = new Intent(MainActivity.this, Filtre.class);
                startActivity(intent3);
                return true;


            default:
                return false;
        }
    }
}
