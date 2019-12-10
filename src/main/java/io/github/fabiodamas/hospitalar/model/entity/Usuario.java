package io.github.fabiodamas.hospitalar.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name="usuario")

@Builder
@Data
@AllArgsConstructor
public class Usuario {
	
	@Id
	private int id;
	
	@Column(name="nome")
	private String name;
	
	@Column(name="email")
	private String email;
	
	
}
