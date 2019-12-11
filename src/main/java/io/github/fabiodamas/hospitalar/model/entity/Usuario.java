package io.github.fabiodamas.hospitalar.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="usuario")

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	@Length(min=2, max=50, message="O tamanho do nome deve ser entre {min} e {max} caracteres")
	@Column(name="nome")
	private String nome;
	
	@Column(name="email")
	private String email;

	@Column(name="senha")
	private String senha;
	
	
}
