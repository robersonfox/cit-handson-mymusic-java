package com.ciandt.handson.mymusic.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Usuarios")
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "PlaylistId")
    private Playlist playlistId;
}
