package com.example.demo.model;

import com.example.demo.model.enums.Sexo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {

	private Long id;
	private int idade;
	private String nome;
	private String cpf;
	private Sexo sexo;

}
