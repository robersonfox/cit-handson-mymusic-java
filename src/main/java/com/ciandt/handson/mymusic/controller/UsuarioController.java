package com.ciandt.handson.mymusic.controller;

import java.util.List;

import com.ciandt.handson.mymusic.model.Usuario;
import com.ciandt.handson.mymusic.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired UsuarioRepository usuarioRepository;

    // TESTE
    @GetMapping("/all")
     private ResponseEntity getAll() {
        List<Usuario> u = usuarioRepository.findAll();

        return ResponseEntity.ok().body(u);
    }
}
