package com.etudiant.immo3000fx.models;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Datas {

    private final ObservableList<Appartement> lesAppartements;
    private final ObservableList<Semaine> lesSemaines;
    private final ObservableList<Saison> lesSaisons;
    private static Datas Instance;

    private Datas() {
        lesAppartements = FXCollections.observableArrayList();
        lesSaisons = FXCollections.observableArrayList();
        lesSemaines = FXCollections.observableArrayList();
        load();
    }

    public static Datas getInstance() {
        if (Instance == null) {
            Instance = new Datas();
        }
        return Instance;
    }

    public ObservableList<Appartement> getLesAppartements() {
        return lesAppartements;
    }

    public ObservableList<Semaine> getLesSemaines() {
        return lesSemaines;
    }

    public ObservableList<Saison> getLesSaisons() {
        return lesSaisons;
    }

    public ObservableList<Semaine> getLesSemaines(Saison s) {
        //Doit retourner la liste des Semaines qui correspondent à 
        //la saison passée en paramètre
        return null;
    }

    private void load() {
        lesAppartements.add(new Appartement(1, "Appt 21 Les lilas fleuris", "15 avenue Charras 63000 Clermont-Ferrand"));
        lesAppartements.add(new Appartement(2, "Appt 22 Les lilas fleuris", "15 avenue Charras 63000 Clermont-Ferrand"));
        lesAppartements.add(new Appartement(3, "Appt 3 Le peuplier coupé", "14 avenue Victor Hugo 63000 Clermont-Ferrand"));
        lesAppartements.add(new Appartement(4, "Appt 17 Les framboises mûres", "12 rue Godefroy de Bouillon 63000 Clermont-Ferrand"));
        lesSaisons.add(new Saison("Basse Saison", 300));
        lesSaisons.add(new Saison("Moyenne Saison", 500));
        lesSaisons.add(new Saison("Haute Saison", 1200));
        for (int i = 1; i <= 20; i++) {
            lesSemaines.add(new Semaine(i, lesSaisons.get(0)));
        }
        for (int i = 21; i <= 45; i++) {
            lesSemaines.add(new Semaine(i, lesSaisons.get(1)));
        }
        for (int i = 46; i <= 52; i++) {
            lesSemaines.add(new Semaine(i, lesSaisons.get(2)));
        }

    }
}
