package io.github.fabiodamas.hospitalar.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import io.github.fabiodamas.hospitalar.model.entity.Usuario;

@RepositoryRestResource (collectionResourceRel="usuario",path="usuario")
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	Optional<Usuario> findByNome(String nome);
	Optional<Usuario> findByEmail(String email);
	boolean existsByEmail (String email);
}
