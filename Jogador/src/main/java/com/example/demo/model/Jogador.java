package com.example.demo.model;

import com.example.demo.interfaces.Movimentacao;
import com.example.demo.model.enums.Direcao;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Jogador extends Pessoa implements Movimentacao {

	private Long id;
	private int x;
	private int y;
	private int numeroCamisa;
	private String posicao;
	private Direcao direcao;

	@Override
	public boolean movimentar(Direcao direcao) {

		switch (direcao) {
		case NORTE:
			x++;
			break;
		case SUL:
			x--;
			break;
		case LESTE:
			y++;
			break;
		case OESTE:
			y--;
			break;

		}

		return true;
	}

}
