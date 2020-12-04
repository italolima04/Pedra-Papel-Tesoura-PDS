package br.com.pds.controller;

import br.com.pds.model.*;

public class ControladorPlacarDeJogo {
	public void incrementaVitorias(Player player) {
		player.setQtdVitorias((player.getQtdVitorias() + 1));
	}
	
	public void incrementaDerrotas(Player player) {
		player.setQtdDerrotas((player.getQtdDerrotas() + 1));
	}
}
