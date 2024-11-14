package br.com.youtube.projeto.service;


import br.com.youtube.projeto.dto.RecursoDTO;
import br.com.youtube.projeto.entity.RecursoEntity;
import br.com.youtube.projeto.repository.RecursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecursoService {

    @Autowired
    private RecursoRepository recursoRepository;


    public List<RecursoDTO> listar() {
        List<RecursoEntity> lista = recursoRepository.findAll();
        return lista.stream().map(RecursoDTO::new).toList();
    }


    public RecursoDTO buscarRecursoPorId(Long id) {
        RecursoEntity recurso = recursoRepository.findById(id).get();
        return new RecursoDTO(recurso);
    }

    public void inserir(RecursoDTO dto) {
        RecursoEntity entity = new RecursoEntity(dto);
        recursoRepository.save(entity);
    }

    public RecursoDTO alterar(RecursoDTO dto) {
        RecursoEntity entity = new RecursoEntity(dto);
        recursoRepository.save(entity);
        return new RecursoDTO(entity);
    }


    public void excluir(Long id) {
        RecursoEntity entity = recursoRepository.findById(id).get();
        recursoRepository.delete(entity);

    }

}
