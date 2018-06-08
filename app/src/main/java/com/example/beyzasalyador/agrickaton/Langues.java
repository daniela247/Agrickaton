package com.example.beyzasalyador.agrickaton;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.content.Intent;
import android.preference.ListPreference;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Locale;


public class Langues extends Activity implements View.OnClickListener {
    private ImageView suisse, italie ;
    private Locale myLocale;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_langues);
        Intent intent = getIntent();

        //LINK TO IMAGEVIEW
        suisse = findViewById(R.id.suisse);
        suisse.setOnClickListener(this);

        italie = findViewById(R.id.italie);
        italie.setOnClickListener(this);

        loadLocale();
    }

    //Loading a saved locale
    public void loadLocale() {
        String langPref = "Language";
        SharedPreferences prefs = getSharedPreferences("CommonPrefs",Activity.MODE_PRIVATE);
        String language = prefs.getString(langPref, "");
        changeLang(language);
    }

    //Save the current locale
    private void saveLocale(String lang) {
        String langPref = "Language";
        SharedPreferences prefs = getSharedPreferences("CommonPrefs", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(langPref, lang);
        editor.commit();
    }

    //Changing the language in the application
    public void changeLang(String lang) {
        if (lang.equalsIgnoreCase(""))
            return;
        myLocale = new Locale(lang);
        saveLocale(lang);
        Locale.setDefault(myLocale);
        android.content.res.Configuration config = new android.content.res.Configuration();
        config.locale = myLocale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
    }

    @Override
    //HERE, DEPEND ON WITCH FLAG YOU CLICK ON, IT TAKES THE RIGHT CASE
    public void onClick(View v) {

        String lang ="fr";
        switch (v.getId()) {
            case R.id.italie:
                lang="it";
                break;

            case R.id.suisse:
                lang="fr";
                break;

            default:
                break;
        }
        changeLang(lang);

        //WHEN THE USER CHANGE THE LANGUAGES, HE MUST SIGN IN
        Intent intent = new Intent(Langues.this, MainActivity.class);
        startActivity(intent);
        this.finish();
    }

    @Override
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (myLocale != null){
            newConfig.locale = myLocale;
            Locale.setDefault(myLocale);
            getBaseContext().getResources().updateConfiguration(newConfig, getBaseContext().getResources().getDisplayMetrics());
        }
    }
}