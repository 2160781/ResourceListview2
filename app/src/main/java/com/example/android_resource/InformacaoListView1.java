package com.example.android_resource;

import java.io.Serializable;

public class InformacaoListView1 implements Serializable {

    private int imgFoto;
    private String titulo;
    private String conteudo;

    public InformacaoListView1(int imgFoto, String titulo, String conteudo) {
        this.imgFoto = imgFoto;
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public int getImgFoto() {
        return imgFoto;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getConteudo() {
        return conteudo;
    }
}
