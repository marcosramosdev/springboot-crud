package br.com.youtube.projeto.service;

import br.com.youtube.projeto.dto.UsuarioDTO;
import br.com.youtube.projeto.entity.UsuarioEntity;
import br.com.youtube.projeto.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<UsuarioDTO> listarTodos(){
        List<UsuarioEntity> lista = usuarioRepository.findAll();
        return lista.stream().map(UsuarioDTO::new).toList();
    }

    public void inserir(UsuarioDTO dto){
        UsuarioEntity usuario = new UsuarioEntity(dto);
        usuarioRepository.save(usuario);
    }

    public UsuarioDTO alterar(UsuarioDTO dto){
        UsuarioEntity usuario = new UsuarioEntity(dto);
        usuarioRepository.save(usuario);
        return new UsuarioDTO(usuario);
    }

    public void excluir(Long id){
        UsuarioEntity usuario = usuarioRepository.findById(id).get();
        usuarioRepository.delete(usuario);
    }

    public UsuarioDTO buscarPorId(Long id){
        UsuarioEntity usuario = usuarioRepository.findById(id).get();
        return new UsuarioDTO(usuario);
    }

}
