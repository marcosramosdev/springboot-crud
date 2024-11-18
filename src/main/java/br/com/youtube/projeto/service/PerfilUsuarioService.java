package br.com.youtube.projeto.service;


import br.com.youtube.projeto.dto.PerfilUsuarioDTO;
import br.com.youtube.projeto.entity.PerfilUsuarioEntity;
import br.com.youtube.projeto.repository.PerfilUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class PerfilUsuarioService {

    @Autowired
    private PerfilUsuarioRepository perfilUsuarioRepository;
    PerfilUsuarioService(PerfilUsuarioRepository perfilUsuarioRepository) {}

    public void inserir(@RequestBody PerfilUsuarioDTO perfilUsuario){
        PerfilUsuarioEntity perfilUsuarioAdicionado =
                new PerfilUsuarioEntity(perfilUsuario);
        perfilUsuarioRepository.save(perfilUsuarioAdicionado);
    }

    public List<PerfilUsuarioDTO> listar(){
        List<PerfilUsuarioEntity> lista = perfilUsuarioRepository.findAll();
        return lista.stream().map(PerfilUsuarioDTO::new).toList();
    }


    public PerfilUsuarioDTO alterar(@RequestBody PerfilUsuarioDTO perfilUsuario){
        PerfilUsuarioEntity perfilUsuarioEntity = new PerfilUsuarioEntity(perfilUsuario);
        perfilUsuarioRepository.save(perfilUsuarioEntity);
        return new PerfilUsuarioDTO(perfilUsuarioEntity);
    }

    public PerfilUsuarioDTO exlcuir(Long id){
        PerfilUsuarioEntity item =
                perfilUsuarioRepository.findById(id).get();
        perfilUsuarioRepository.delete(item);
        return new PerfilUsuarioDTO(item);
    }

}
