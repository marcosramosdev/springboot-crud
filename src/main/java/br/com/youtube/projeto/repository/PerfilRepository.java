package br.com.youtube.projeto.repository;


import br.com.youtube.projeto.entity.PerfilEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilRepository extends JpaRepository<PerfilEntity,
        Long> {
}
