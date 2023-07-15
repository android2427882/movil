package com.example.bancoproyectos.perfil;

import java.util.ArrayList;

public class PerfilRespuesta {
    private static ArrayList<Perfils> results = new ArrayList<Perfils>();

    public static ArrayList<Perfils> getResults() {
        return results;
    }

    public void setResults(ArrayList<Perfils> results) {
        this.results = results;
    }
}
