package com.example.beyzasalyador.agrickaton.Local;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;


import com.example.beyzasalyador.agrickaton.Model.Fromage;

import java.util.List;

@Dao
public interface FromageDAO
{
    // SELECTIONNE TOUS LES FROMAGES D'UN ALPAGE
    @Query("SELECT * FROM fromage WHERE IdAlpage=:alpageId")
    List<Fromage> getFromageAlpage(int alpageId);
}