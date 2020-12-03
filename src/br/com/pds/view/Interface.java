package br.com.pds.view;

import br.com.pds.model.*;
import br.com.pds.controller.*;

import java.util.Scanner;

public class Interface {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {	
		boolean operadorMenu = true;
		boolean operadorRodada = true;
		int opcaoMenuInterno;
		int opcaoMenuExterno;
		PedraPapelTesoura jogo = new PedraPapelTesoura();
		Placar placar = new Placar();
		ControladorPlacarDeJogo controlador = new ControladorPlacarDeJogo();
		Jogador jogador = new Jogador();
		Computador computador = new Computador();

		System.out.println("Seja Bem-Vindo ao Célebre Jogo PPT: Pedra, Papel, Tesoura.");
		while(operadorMenu) {
			System.out.println("--------------------MENU--------------------");
			System.out.println("#1--->Jogar uma Partida");
			System.out.println("#2--->Verificar Retrospecto do Jogador");
			System.out.println("#3--->Sobre");
			System.out.println("#4--->Sair");
			System.out.println("----------------------------------------------------------------------------------------");
			System.out.println("Digite uma das Opções Acima para Prosseguir: ");
			opcaoMenuExterno = entrada.nextInt();
			switch(opcaoMenuExterno) {
				case 1:
					entrada.nextLine();
					operadorRodada = true;
					placar.setQtdVitoriasJogador(0);
					placar.setQtdVitoriasComputador(0);
					System.out.println("INSTRUÇÕES:");
					System.out.println("Quando a Rodada Começar, Digite a Opção que Representará Sua Jogada!");
					System.out.println("As Opções São: 'pedra', 'papel' ou 'tesoura'.");
					System.out.println("Pedra vence Tesoura. Tesoura vence Papel. Papel vence Pedra.");
					System.out.println("----------------------------------------------------------------------------------------");
					while(operadorRodada) {
						System.out.println("Abaixo, Digite 'pedra', 'papel' ou 'tesoura': ");
						String palpite = entrada.nextLine();
						int resultado = jogo.rodada(jogador, computador, controlador, palpite);
						if (resultado == 3) {
							System.out.println("Jogada Inválida.");
						} else {
							if(resultado == 0) {
								System.out.println("A Rodada Empatou.");
							}else if(resultado == 1) {
								placar.setQtdVitoriasJogador((placar.getQtdVitoriasJogador() + 1));
								System.out.println("O Jogador Venceu a Rodada.");
							}else if(resultado == 2) {
								placar.setQtdVitoriasComputador((placar.getQtdVitoriasComputador()+1));
								System.out.println("O Computador Venceu a Rodada.");
							}
							System.out.println("Placar Atual---> Jogador " + placar.getQtdVitoriasJogador() + " X " + placar.getQtdVitoriasComputador() + " Computador: " );
							System.out.println("----------------------------------------------------------------------------------------");
						}
						System.out.println("Digite 1 Para Jogar Outra Rodada OU Digite 0 Para Sair:  ");
						opcaoMenuInterno = entrada.nextInt();
						entrada.nextLine();
						if(opcaoMenuInterno == 0) {
						 if(placar.vencedorJogo(placar) == 0) {
							System.out.println("O Jogo Terminou Empate.");
						 }else if(placar.vencedorJogo(placar) == 1) {
							System.out.println("O Jogador Venceu a Partida!");
						 }else if(placar.vencedorJogo(placar) == 2){
							System.out.println("O Computador Venceu a Partida!");
						 }
						 operadorRodada=false;
						}
					}
					break;
				case 2:
					System.out.println("RETROSPECTIVA GERAL DO JOGADOR: ");
					System.out.println(jogador);
					break;
				case 3:
					System.out.println("Este Sistema foi desenvolvido como Desafio da disciplina de Projeto Detalhado de Software 2020.2, na Universidade Federal do Ceará.");
					System.out.println("----------------------------------------------------------------------------------------");
					System.out.println("Desenvolvedores: ");
					System.out.println("Ítalo Lima Dantas || Github: https://github.com/italolima04");
					System.out.println("Marcos Gênesis da Silva || Github: https://github.com/marcosgenesis");
					break;
				case 4:
					operadorMenu = false;
					System.out.println("Fechando Aplicação...");
					System.exit(1);
					break;
				default: 
					System.out.println("Opção Inválida :/");
					break;
			}
		}
	}
}
