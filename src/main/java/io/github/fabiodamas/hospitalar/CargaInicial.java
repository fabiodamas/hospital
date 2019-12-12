package io.github.fabiodamas.hospitalar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import io.github.fabiodamas.hospitalar.model.entity.Usuario;
import io.github.fabiodamas.hospitalar.model.repository.UsuarioRepository;

@Component
public class CargaInicial implements ApplicationRunner  {
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Usuario fabio = Usuario.builder().id(1).nome("fabio damas").email("fabio.damas@gmail.com").senha("123").build();
		Usuario ludmila = Usuario.builder().id(2).nome("ludmila garcia").email("lulu@gmail.com").senha("123").build();
		
		
		usuarioRepository.saveAndFlush(fabio);
		usuarioRepository.saveAndFlush(ludmila);
		
	}
	
	
}
