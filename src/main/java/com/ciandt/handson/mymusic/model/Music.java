package com.ciandt.handson.mymusic.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;

/*
"id": "string",
"nome": "string",
"artistaId": "string",
"artista": {
"id": "string",
"nome": "string"
}
*/

@Entity
@Table(name = "music")
public class Music implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String nome;
    private Artista artista;

    public Music() {}

    public Music(String id, String nome, Artista artista) {
        this.id = id;
        this.nome = nome;
        this.artista = artista;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Artista getArtista() {
        return this.artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Music id(String id) {
        this.id = id;
        return this;
    }

    public Music nome(String nome) {
        this.nome = nome;
        return this;
    }

    public Music artista(Artista artista) {
        this.artista = artista;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Music)) {
            return false;
        }
        Music music = (Music) o;
        return Objects.equals(id, music.id) && Objects.equals(nome, music.nome) && Objects.equals(artista, music.artista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, artista);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nome='" + getNome() + "'" +
            ", artista='" + getArtista() + "'" +
            "}";
    }


}