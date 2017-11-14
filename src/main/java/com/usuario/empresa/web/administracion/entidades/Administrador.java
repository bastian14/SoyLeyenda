package com.usuario.empresa.web.administracion.entidades;

public class Administrador {
    private String nombre_usuario;
    private String contrasena;
    private String nombre_real;
    private String apellido;

    public Administrador(String nombre_usuario, String contrasena, String nombre_real, String apellido) {
        this.nombre_usuario = nombre_usuario;
        this.contrasena = contrasena;
        this.nombre_real = nombre_real;
        this.apellido = apellido;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre_real() {
        return nombre_real;
    }

    public void setNombre_real(String nombre_real) {
        this.nombre_real = nombre_real;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
}
