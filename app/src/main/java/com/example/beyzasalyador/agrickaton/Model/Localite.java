package com.example.beyzasalyador.agrickaton.Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import io.reactivex.annotations.NonNull;

// CORRESPOND A UNE TABLE, ET CHAMP = COLONNE


@Entity(tableName = "localite")
public class Localite {

    @NonNull
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "Id")
    private int id;

    @NonNull
    @ColumnInfo(name = "Ville")
    private String ville;

    @NonNull
    @ColumnInfo(name = "Pays")
    private String pays;

    @NonNull
    @ColumnInfo(name = "Adresse")
    private String adresse;

    @NonNull
    @ColumnInfo(name = "CP")
    private int cp;

    @NonNull
    @ColumnInfo(name = "NumeroRue")
    private int numero_rue;

    public Localite(String ville, String pays, String adresse, int cp, int numero_rue) {
        this.ville = ville;
        this.pays = pays;
        this.adresse = adresse;
        this.cp = cp;
        this.numero_rue = numero_rue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public int getNumero_rue() {
        return numero_rue;
    }

    public void setNumero_rue(int numero_rue) {
        this.numero_rue = numero_rue;
    }

    @Override
    public String toString() {
        return "Localite{" +
                "id=" + id +
                ", ville='" + ville + '\'' +
                ", pays='" + pays + '\'' +
                ", adresse='" + adresse + '\'' +
                ", cp=" + cp +
                ", numero_rue=" + numero_rue +
                '}';
    }
}

