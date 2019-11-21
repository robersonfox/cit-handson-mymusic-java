package com.ciandt.handson.mymusic.repository;

import java.util.List;

import com.ciandt.handson.mymusic.model.Music;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicRepository extends JpaRepository<Music, String> {
    @Query(value = "select m from Music m left join m.artista a where lower(m.nome) like :nome or lower(a.nome) like :nome")
    List<Music> getByFilter(@Param("nome") String nome);
}
