package com.example.bancoproyectos;

import java.io.Serializable;

public class ListElement implements Serializable {
    public String color;
    public String name;
    public String descripcion;

    public String status;

    public ListElement(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListElement(String color, String name, String descripcion) {
        this.color = color;
        this.name = name;
        this.descripcion = descripcion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
