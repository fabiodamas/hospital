package io.github.fabiodamas.hospitalar.service;


import java.util.Optional;

import io.github.fabiodamas.hospitalar.model.entity.Usuario;

public interface UsuarioService {

	Usuario autenticar(String email, String senha);
	
	Usuario salvarUsuario(Usuario usuario);
	
	void validarEmail(String email);
	
	Optional<Usuario> obterPorId(Long id);
	
}