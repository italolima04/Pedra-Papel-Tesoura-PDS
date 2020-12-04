package br.com.pds.model;

import br.com.pds.controller.ControladorPlacarDeJogo;

public interface Jogo {
	public int palpiteJogador(String palpite);
	public int palpiteComputador(); 
	public int rodada(Player jogador, Player computador, ControladorPlacarDeJogo controlador, String palpite);
}
