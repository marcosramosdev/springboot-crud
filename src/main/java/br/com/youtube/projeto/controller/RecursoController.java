package br.com.youtube.projeto.controller;


import br.com.youtube.projeto.dto.RecursoDTO;
import br.com.youtube.projeto.service.RecursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/recurso")
@CrossOrigin
public class RecursoController {

    @Autowired
    private RecursoService recursoService;

    @GetMapping
    public List<RecursoDTO> listar(){
        return recursoService.listar();
    }

    @GetMapping("/{id}")
    public RecursoDTO buscarPorId(@PathVariable Long id){
        return recursoService.buscarRecursoPorId(id);
    }

    @PostMapping
    public void inserir(@RequestBody RecursoDTO recursoDTO){
        recursoService.inserir(recursoDTO);
    }

    @PutMapping
    public RecursoDTO alterar(@RequestBody RecursoDTO recursoDTO){
        return recursoService.alterar(recursoDTO);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable("id") Long id){
        recursoService.excluir(id);
        return ResponseEntity.ok().build();
    }

}
