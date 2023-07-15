package com.example.bancoproyectos;

import java.util.ArrayList;

public class ListadoProyectoRespuesta {
    private static ArrayList<Listadoproyectos> results = new ArrayList<Listadoproyectos>();

    public static ArrayList<Listadoproyectos> getResults() {
        return results;
    }

    public void setResults(ArrayList<Listadoproyectos> results) {
        this.results = results;
    }

}
