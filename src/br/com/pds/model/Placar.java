package br.com.pds.model;

public class Placar {
	int qtdVitoriasJogador;	
	int qtdVitoriasComputador;
	
	public int getQtdVitoriasJogador() {
		return this.qtdVitoriasJogador;
	}
	
	public void setQtdVitoriasJogador(int qtdVitoriasJogador) {
		this.qtdVitoriasJogador = qtdVitoriasJogador;
	}
	
	public int getQtdVitoriasComputador() {
		return this.qtdVitoriasComputador;
	}
	
	public void setQtdVitoriasComputador(int qtdVitoriasComputador) {
		this.qtdVitoriasComputador = qtdVitoriasComputador;
	}
	
	public int vencedorJogo(Placar placar) {
		if(placar.getQtdVitoriasJogador() > placar.getQtdVitoriasComputador()) {
			return 1;
		} else if(placar.getQtdVitoriasComputador() > placar.getQtdVitoriasJogador()) {
			return 2;
		}
		return 0;
	}
}
