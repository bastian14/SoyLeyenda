package com.usuario.empresa.web.administracion.entidades;

import java.util.Date;

public class Noticia {
    private int id_noticia;
    private String titulo;
    private String cuerpo;
    private Date fecha;
    private String fuente;
    private String url_imagen;
    private String tag1;
    private String tag2;
    private String tag3;
        
    public Noticia() {}

    public Noticia(int id_noticia, String titulo, String cuerpo, Date fecha, String fuente, String url_imagen, String tag1, String tag2, String tag3) {
        this.id_noticia = id_noticia;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.fecha = fecha;
        this.fuente = fuente;
        this.url_imagen = url_imagen;
        this.tag1 = tag1;
        this.tag2 = tag2;
        this.tag3 = tag3;
        
    }

    public int getId_noticia() {
        return id_noticia;
    }

    public void setId_noticia(int id_noticia) {
        this.id_noticia = id_noticia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public String getUrl_imagen() {
        return url_imagen;
    }

   public void setUrl_imagen(String url_imagen) {
        this.url_imagen = url_imagen;
    }

    public String getTag1() {
        return tag1;
    }

    public void setTag1(String tag1) {
        this.tag1 = tag1;
    }

    public String getTag2() {
        return tag2;
    }

    public void setTag2(String tag2) {
        this.tag2 = tag2;
    }

    public String getTag3() {
        return tag3;
    }

    public void setTag3(String tag3) {
        this.tag3 = tag3;
    }

       
    
}