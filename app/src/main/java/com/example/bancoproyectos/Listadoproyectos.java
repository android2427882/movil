package com.example.bancoproyectos;

public class Listadoproyectos {
    private int id;
    private String nombre_proyecto;
    private  String descripcion;
    private  String foto;
    private int aprendiz;
    private String codigo_fuente;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_proyecto() {
        return nombre_proyecto;
    }

    public void setNombre_proyecto(String nombre_proyecto) {
        this.nombre_proyecto = nombre_proyecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getAprendiz() {
        return aprendiz;
    }

    public void setAprendiz(int aprendiz) {
        this.aprendiz = aprendiz;
    }

    public String getCodigo_fuente() {
        return codigo_fuente;
    }

    public void setCodigo_fuente(String codigo_fuente) {
        this.codigo_fuente = codigo_fuente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    private String estado;



}
