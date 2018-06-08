package com.example.beyzasalyador.agrickaton.Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import io.reactivex.annotations.NonNull;

// CORRESPOND A UNE TABLE, ET CHAMP = COLONNE


@Entity(tableName = "fromage")
public class Fromage {

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
    @ColumnInfo(name = "Prix") // au kilo
    private int prix;

    @NonNull
    @ColumnInfo(name = "Texture") // (cremeux, dur, mou, gras)
    private String texture;

    @NonNull
    @ColumnInfo(name = "Poids") // moyen
    private int poids;

    @NonNull
    @ColumnInfo(name = "Intensite") // (faible à corsé)
    private int intensite;

    @NonNull
    @ColumnInfo(name = "Sel")
    private int sel;

    @NonNull
    @ColumnInfo(name = "Annee")
    private int annee;

    @NonNull
    @ForeignKey(entity = Alpage.class, parentColumns = "id", childColumns = "Id")
    @ColumnInfo(name = "IdAlpage")
    private int idAlpage;


    public Fromage(String nom, String description, int prix, String texture, int poids, int intensite, int sel, int annee, int idAlpage) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.texture = texture;
        this.poids = poids;
        this.intensite = intensite;
        this.sel = sel;
        this.annee = annee;
        this.idAlpage = idAlpage;
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

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public int getIdAlpage() {
        return idAlpage;
    }

    public void setIdAlpage(int idAlpage) {
        this.idAlpage = idAlpage;
    }

    public int getSel() {
        return sel;
    }

    public void setSel(int sel) {
        this.sel = sel;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public int getIntensite() {
        return intensite;
    }

    public void setIntensite(int intensite) {
        this.intensite = intensite;
    }

    @Override
    public String toString() {
        return "Fromage{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                ", texture='" + texture + '\'' +
                ", poids=" + poids +
                ", intensite=" + intensite +
                ", sel=" + sel +
                ", annee=" + annee +
                ", idAlpage=" + idAlpage +
                '}';
    }
}