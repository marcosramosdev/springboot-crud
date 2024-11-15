package br.com.youtube.projeto.dto;


import br.com.youtube.projeto.entity.PerfilEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
public class PerfilDTO {

    private Long id;
    private String descricao;

    public PerfilDTO() {}

    public PerfilDTO(PerfilEntity perfil) {
        BeanUtils.copyProperties(perfil, this);
    }
}
