package com.example.beyzasalyador.agrickaton.Local;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.beyzasalyador.agrickaton.Model.Alpage;
import com.example.beyzasalyador.agrickaton.Model.Fromage;
import com.example.beyzasalyador.agrickaton.Model.Localite;

import static com.example.beyzasalyador.agrickaton.Local.FromageDatabase.DATABASE_VERSION;


@Database(entities = {Fromage.class, Alpage.class, Localite.class},version = DATABASE_VERSION, exportSchema = false)

// ROOM PREVOIT LES CHANGEMENTS DE STRUCTURE DE LA TABLE USER
// ON TRAVAILLE AVEC UN FICHIER POUR LA DB
// ON GERE LES VERSIONS DES DB, CAR QUAND UN UTILISATEUR TELECHARGE NOTRE APP,
// IL OBTIENT LE "VIEUX FICHIER"

public abstract class FromageDatabase extends RoomDatabase
{
    public static final int DATABASE_VERSION=4;
    public static final String DATABASE_NAME = "EDMT-Database-Room" ;

    public abstract FromageDAO fromageDAO();
    public abstract AlpageDAO alpageDAO();
    public abstract LocaliteDAO localiteDAO();

    private static FromageDatabase mInstance ;


    // CE BUILDER RETOURNE UN OBJECT QUI CREE D'AUTRES OBJETS
    public static FromageDatabase getInstance (Context context)
    {
        if  (mInstance == null)
        {
            // A EVITER DE LE FAIRE PLUSIEURS FOIS CAR CHER COMME APPEL
            mInstance = Room.databaseBuilder(context,FromageDatabase.class,DATABASE_NAME) // REOUTNRE UN BUILDER
                    .allowMainThreadQueries() // LANCE DES REQUETES DANS LA DB DEPUIS LE THREAD UI (PRINCIPAL)
                    .fallbackToDestructiveMigration() // REOUTNRE UN BUILDER PARAMéTRER
                    .build(); // RETOURN UNE INSTANCE DE TYPE USERDATABASE
        }
        return mInstance ;
    }

    public void clearAllTables ()
    {

    }
}
