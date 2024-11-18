package br.com.youtube.projeto.controller;

import br.com.youtube.projeto.dto.PerfilUsuarioDTO;
import br.com.youtube.projeto.service.PerfilUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/perfil-usuario")
public class PerfilUsuarioController {

    @Autowired
    private PerfilUsuarioService perfilUsuarioService;

    @PostMapping
    public void inserir(@RequestBody PerfilUsuarioDTO perfilUsuario){
        perfilUsuarioService.inserir(perfilUsuario);
    }

    @GetMapping
    public List<PerfilUsuarioDTO> listar(){
        return perfilUsuarioService.listar();
    }

    @PutMapping
    public PerfilUsuarioDTO alterar(@RequestBody PerfilUsuarioDTO perfilUsuario){
        return perfilUsuarioService.alterar(perfilUsuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable("id") Long id){
        perfilUsuarioService.exlcuir(id);
        return ResponseEntity.ok().build();
    }

}