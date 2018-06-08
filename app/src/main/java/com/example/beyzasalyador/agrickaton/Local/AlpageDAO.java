package com.example.beyzasalyador.agrickaton.Local;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;


import com.example.beyzasalyador.agrickaton.Model.Alpage;

import java.util.List;

@Dao
public interface AlpageDAO
{
    // SELECTIONNE TOUS LES ALPAGES D'UNE LOCALITE
    @Query("SELECT * FROM alpage WHERE IdLocalite=:localiteId")
    List<Alpage> getAlpageLocalite(int localiteId);
}