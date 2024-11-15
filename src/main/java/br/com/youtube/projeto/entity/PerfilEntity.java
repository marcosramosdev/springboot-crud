package br.com.youtube.projeto.entity;


import br.com.youtube.projeto.dto.PerfilDTO;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Entity
@Table(name = "TB_PERFIL")
@Getter
@Setter
@EqualsAndHashCode
public class PerfilEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String descricao;

    public PerfilEntity() {}

    public PerfilEntity(PerfilDTO perfilDTO){
        BeanUtils.copyProperties(perfilDTO, this);
    }
}
