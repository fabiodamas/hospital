package io.github.fabiodamas.hospitalar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.fabiodamas.hospitalar.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	Usuario findByNome(String nome);
}
