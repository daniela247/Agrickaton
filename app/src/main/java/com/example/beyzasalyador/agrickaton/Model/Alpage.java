package com.example.beyzasalyador.agrickaton.Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import io.reactivex.annotations.NonNull;

// CORRESPOND A UNE TABLE, ET CHAMP = COLONNE


@Entity(tableName = "alpage")
public class Alpage {

    @NonNull
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "Id")
    private int id;

    @NonNull
    @ColumnInfo(name = "Nom")
    private String nom;

    @NonNull
    @ColumnInfo(name = "Description")
    private String description;

    @NonNull
    @ForeignKey(entity = Localite.class, parentColumns = "id", childColumns = "Id")
    @ColumnInfo(name = "IdLocalite")
    private int idLocalite;


    public Alpage(String nom, String description, int idLocalite) {
        this.nom = nom;
        this.description = description;
        this.idLocalite = idLocalite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIdLocalite() {
        return idLocalite;
    }

    public void setIdLocalite(int idLocalite) {
        this.idLocalite = idLocalite;
    }

    @Override
    public String toString() {
        return "Alpage{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", idLocalite=" + idLocalite +
                '}';
    }
}
