package com.ciandt.handson.mymusic.repository;

import com.ciandt.handson.mymusic.model.Music;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicRepository extends JpaRepository<Music, Long> {

}