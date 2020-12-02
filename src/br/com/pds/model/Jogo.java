package br.com.pds.model;

import br.com.pds.controller.*;

public interface Jogo {
	public int palpiteJogador(String palpite);
	public int palpiteComputador(); 
	public int rodada(Jogador jogador, Computador computador, ControladorPlacarDeJogo controlador, String palpite);
}
