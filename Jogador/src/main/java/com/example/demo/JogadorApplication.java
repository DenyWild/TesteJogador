package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Jogador;
import com.example.demo.model.Pessoa;
import com.example.demo.model.enums.Direcao;

@SpringBootApplication
public class JogadorApplication {

	public static void main(String[] args) {
		SpringApplication.run(JogadorApplication.class, args);

		Scanner input = new Scanner(System.in);

		Jogador jogador1 = new Jogador();
		Pessoa jogador2 = new Jogador();

		jogador1.movimentar(Direcao.NORTE);
		jogador1.movimentar(Direcao.NORTE);

		System.out.println("Informe o nome do seu jogador: ");
		jogador2.setNome(input.nextLine());
		System.out.println("Informe a idade do seu jogador: ");
		jogador2.setIdade(input.nextInt());

		System.out.println("JOGADOR 1 ---X");

		System.out.println(jogador1.getX());
		System.out.println(jogador1.getY());

		System.out.println("-------------X");
		System.out.println("JOGADOR 2 ---X");

		System.out.println(jogador2.getNome());
		System.out.println(jogador2.getIdade());

		System.out.println("-------------X");

	}

}
