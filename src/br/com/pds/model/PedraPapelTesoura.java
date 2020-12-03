package br.com.pds.model;

import java.util.Random;

import br.com.pds.controller.ControladorPlacarDeJogo;

public class PedraPapelTesoura implements Jogo{
	Random numeroAleatorio = new Random();
	
	public PedraPapelTesoura() {
	super();
	}
	
	public int palpiteJogador(String palpite) {
		if(palpite.equalsIgnoreCase("pedra")) {
			return 0;
		} else if(palpite.equalsIgnoreCase("papel")) {
			return 1;
		} else if(palpite.equalsIgnoreCase("tesoura")) {
			return 2;
		}
		return 3;
	}
	
	public int palpiteComputador() {
		int palpite = numeroAleatorio.nextInt(2);
		return palpite;
	}
	
	public void converteJogada(int palpite, Object objeto) {
		if(palpite == 3) {
			System.out.println("Opção Inválida");
		}else {
			if(objeto instanceof Jogador) {
				if(palpite == 0) {
					System.out.println("Jogador: Pedra");
				}else if(palpite == 1) {
					System.out.println("Jogador: Papel");
				}else if(palpite == 2) {
					System.out.println("Jogador: Tesoura");
				}
			} else if(objeto instanceof Computador) {
				if(palpite == 0) {
					System.out.println("Computador: Pedra");
				}else if(palpite == 1) {
					System.out.println("Computador: Papel");
				}else if(palpite == 2) {
					System.out.println("Computador: Tesoura");
				}else {
					System.out.println("Opção Inválida");
				}
			}
		}
	}
	
	public int rodada(Jogador jogador, Computador computador, ControladorPlacarDeJogo controlador, String palpite) {
		int palpiteJogador = palpiteJogador(palpite);
		if(palpiteJogador == 3) {
			return 3;
		}else {
			converteJogada(palpiteJogador, jogador);
			int palpiteComputador = palpiteComputador();
			converteJogada(palpiteComputador, computador);
			 if((palpiteJogador == 1 && palpiteComputador == 0)|| (palpiteJogador == 0 && palpiteComputador == 2) || (palpiteJogador == 2 && palpiteComputador == 1)) {
				controlador.incrementaPlacarJogador(jogador);
				controlador.decrementaPlacarComputador(computador);
				return 1;
			}else if((palpiteJogador == 0 && palpiteComputador == 1)|| (palpiteJogador == 2 && palpiteComputador == 0) || (palpiteJogador == 1 && palpiteComputador == 2) ) {
				controlador.incrementaPlacarComputador(computador);
				controlador.decrementaPlacarJogador(jogador);
				return 2;
			} else {
				return 0;
			}
		}
		}
}
