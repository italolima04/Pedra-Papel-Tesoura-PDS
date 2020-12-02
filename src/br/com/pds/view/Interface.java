package br.com.pds.view;

import br.com.pds.model.*;
import br.com.pds.controller.*;

import java.util.Scanner;

public class Interface {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {	
		boolean operadorRodada = true;
		int opcao;
		PedraPapelTesoura jogo = new PedraPapelTesoura();
		ControladorPlacarDeJogo controlador = new ControladorPlacarDeJogo();
		Jogador jogador = new Jogador();
		Computador computador = new Computador();

		System.out.println("Seja Bem-Vindo ao Célebre Jogo PPT: Pedra, Papel, Tesoura. Vamos Jogar :)");
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("INSTRUÇÕES:");
		System.out.println("Quando a Rodada Começar, Digite a Opção que Representará Sua Jogada!");
		System.out.println("As Opções São: 'pedra', 'papel' ou 'tesoura'.");
		System.out.println("Pedra vence Tesoura. Tesoura vence Papel. Papel vence Pedra.");
		System.out.println("----------------------------------------------------------------------------------------");
		while(operadorRodada) {
			System.out.println("Abaixo, Digite 'pedra', 'papel' ou 'tesoura': ");
			String palpite = entrada.nextLine();
			int resultado = jogo.rodada(jogador, computador, controlador, palpite);
			if(resultado == 0) {
				System.out.println("Empate");
			}else if(resultado == 1) {
				jogo.setQtdVitoriasJogador((jogo.getQtdVitoriasJogador() + 1));
				System.out.println("O Jogador Venceu");
			}else if(resultado == 2) {
				jogo.setQtdVitoriasComputador((jogo.getQtdVitoriasComputador()+1));
				System.out.println("O Computador Venceu");
			}
			System.out.println("Placar Atual---> Jogador " + jogo.getQtdVitoriasJogador() + " X " + jogo.getQtdVitoriasComputador() + " Computador: " );
			System.out.println("----------------------------------------------------------------------------------------");
			System.out.println("Digite 1 Para Jogar Outra Rodada OU Digite 0 Para Sair:  ");
			opcao = entrada.nextInt();
			entrada.nextLine();
			if(opcao == 0) {
			 operadorRodada=false;
			 System.out.println("PLACAR GERAL: ");
			 System.out.println("----------------------------------------------------------------------------------------");
			 System.out.println(jogador);
			 System.out.println(computador);
			}
		}
	}
}
