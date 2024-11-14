package br.com.youtube.projeto.controller;

import br.com.youtube.projeto.dto.UsuarioDTO;
import br.com.youtube.projeto.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/usuario")
@CrossOrigin
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


    @GetMapping
    public List<UsuarioDTO> listar(){
        return usuarioService.listarTodos();
    }

    @GetMapping("/{id}")
    public UsuarioDTO buscarPorId(@PathVariable Long id){
        return usuarioService.buscarPorId(id);
    }

    @PostMapping
    public void inserir(@RequestBody UsuarioDTO usuario){
        usuarioService.inserir(usuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        usuarioService.excluir(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public UsuarioDTO alterar(@RequestBody UsuarioDTO usuarioDTO){
        return usuarioService.alterar(usuarioDTO);
    }




}
