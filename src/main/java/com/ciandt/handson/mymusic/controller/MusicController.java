package com.ciandt.handson.mymusic.controller;

import java.util.ArrayList;
import java.util.List;

import com.ciandt.handson.mymusic.model.Artista;
import com.ciandt.handson.mymusic.model.Music;
import com.ciandt.handson.mymusic.repository.ArtistasRepository;
import com.ciandt.handson.mymusic.repository.MusicRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api")
public class MusicController {

    /**
     * Método: ​ GET
        - Rota:​ /api/musicas?filtro=​ ’ ​ Bruno+Mars’
        - Parâmetros:​ ​ QueryString: {filtro} string - Opcional
        - Retorno: ​ Array do objeto “Musica” do modelo Json
        - Erros tratados: ​ 204 ​ com array vazio​ ​ quando não houver dados e ​ 400 ​ quando caracteres de busca
     */

     @Autowired
     private MusicRepository musicRepository;

     @Autowired
     private ArtistasRepository artistasRepository;

    @ApiResponses(value = {
        @ApiResponse(code = 204, message = "array vazio​ ​ quando não houver dados"),
        @ApiResponse(code = 400, message = "400 ​ quando caracteres de busca")
    })
     @GetMapping("/musicas")
     private ResponseEntity getByFilter(@RequestParam("filtro") final String filtro) {
        List<Music> musics = new ArrayList<>();

        // Verifica se menor que 3 caracteres
        if (filtro.length() < 3) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        try {
            musics = musicRepository.getByFilter("%" + filtro.toLowerCase() + "%");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(musics);
        }

        return ResponseEntity.ok().body(musics);
     }

     @GetMapping("/all")
     private ResponseEntity getAll() {
        List<Music> musics = new ArrayList<>();

        musics = musicRepository.findAll();
        try {
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(musics);
        }

        return ResponseEntity.ok().body(musics);
     }

     @GetMapping("/all-artists")
     private ResponseEntity getAllArtists() {

         try {
            List<Artista> artistas = artistasRepository.findAll();
            return ResponseEntity.ok().body(artistas);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(new ArrayList<Artista>());
        }
     }
}
