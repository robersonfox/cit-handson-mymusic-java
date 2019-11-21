package com.ciandt.handson.mymusic.repository;

import com.ciandt.handson.mymusic.model.Artista;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistasRepository extends JpaRepository<Artista, String> {
}
