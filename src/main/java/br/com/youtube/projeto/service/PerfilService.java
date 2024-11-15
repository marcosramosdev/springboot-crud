package br.com.youtube.projeto.service;



import br.com.youtube.projeto.dto.PerfilDTO;
import br.com.youtube.projeto.entity.PerfilEntity;
import br.com.youtube.projeto.repository.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@Service
public class PerfilService {

    @Autowired
    private PerfilRepository perfilRepository;

    public void inserir(PerfilDTO perfil){
        PerfilEntity perfilEntity = new PerfilEntity(perfil);
        perfilRepository.save(perfilEntity);
    }

    public List<PerfilDTO> listar(){
        List<PerfilEntity> perfilEntities = perfilRepository.findAll();
        return perfilEntities.stream().map(PerfilDTO::new).toList();
    }

    public PerfilDTO buscarPorId(Long id){
        PerfilEntity perfilEntity = perfilRepository.findById(id).get();
        return new PerfilDTO(perfilEntity);
    }

    public PerfilDTO alterar(@RequestBody PerfilDTO perfil){
        PerfilEntity perfilEntity = new PerfilEntity(perfil);
        perfilRepository.save(perfilEntity);
        return new PerfilDTO(perfilEntity);
    }

    public void excluir(Long id){
        PerfilEntity perfilEntity = perfilRepository.findById(id).get();
        perfilRepository.delete(perfilEntity);
    }


}
