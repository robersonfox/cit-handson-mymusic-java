package com.ciandt.handson.mymusic.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "playlist")
public class Playlist implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

}