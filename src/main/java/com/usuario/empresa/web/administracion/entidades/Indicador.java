package com.usuario.empresa.web.administracion.entidades;

public class Indicador {
    private int id_indicador;
    private String nombre;
    private boolean estado;
    private double valor;

    public Indicador() {}
    
    public Indicador(int id_indicador, String nombre, boolean estado, double valor) {
        this.id_indicador = id_indicador;
        this.nombre = nombre;
        this.estado = estado;
        this.valor = valor;
    }

    public int getId_indicador() {
        return id_indicador;
    }

    public void setId_indicador(int id_indicador) {
        this.id_indicador = id_indicador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
