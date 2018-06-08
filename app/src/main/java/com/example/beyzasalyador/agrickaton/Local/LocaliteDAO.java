package com.example.beyzasalyador.agrickaton.Local;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.example.beyzasalyador.agrickaton.Model.Localite;

import java.util.List;

@Dao
public interface LocaliteDAO
{
    // AFFICHE UNE LOCALTE PAR SON ID EN PARAMETRE
    @Query("SELECT * FROM localite WHERE Id=:localiteId")
    Localite getLocaliteById(int localiteId);
}