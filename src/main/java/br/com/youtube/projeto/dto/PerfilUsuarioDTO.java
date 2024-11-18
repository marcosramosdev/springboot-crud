package br.com.youtube.projeto.dto;


import br.com.youtube.projeto.entity.PerfilUsuarioEntity;
import lombok.*;
import org.springframework.beans.BeanUtils;



@NoArgsConstructor
@Getter
@Setter
public class PerfilUsuarioDTO {
    private Long id;
    private UsuarioDTO usuario;
    private PerfilDTO perfil;


   public PerfilUsuarioDTO(PerfilUsuarioEntity perfilUsuario) {
       BeanUtils.copyProperties(perfilUsuario, this);

       if(perfilUsuario != null && perfilUsuario.getUsuario() != null) {
           this.usuario = new UsuarioDTO(perfilUsuario.getUsuario());
       }

       if(perfilUsuario != null && perfilUsuario.getPerfil() != null) {
           this.perfil = new PerfilDTO(perfilUsuario.getPerfil());
       }
   }

}
