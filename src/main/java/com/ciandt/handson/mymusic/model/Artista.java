package com.ciandt.handson.mymusic.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Artistas")
public class Artista implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "Id")
    private String id;

    @Column(name = "Nome")
    private String nome;
}
