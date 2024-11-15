package br.com.youtube.projeto.controller;


import br.com.youtube.projeto.dto.PerfilDTO;
import br.com.youtube.projeto.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/perfil")
public class PerfilController {

    @Autowired
    private PerfilService perfilService;

    @PostMapping
    public void inserir(@RequestBody PerfilDTO perfil){
        perfilService.inserir(perfil);
    }

    @GetMapping
    public List<PerfilDTO> listar(){
        return perfilService.listar();
    }

    @PutMapping
    public PerfilDTO atualizar(@RequestBody PerfilDTO perfil){
       return perfilService.alterar(perfil);
    }

   @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable("id") Long id){
        perfilService.excluir(id);
        return ResponseEntity.ok().build();
   }
}
