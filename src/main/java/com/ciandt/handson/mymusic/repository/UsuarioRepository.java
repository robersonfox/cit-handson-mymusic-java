package com.ciandt.handson.mymusic.repository;

import com.ciandt.handson.mymusic.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

}
