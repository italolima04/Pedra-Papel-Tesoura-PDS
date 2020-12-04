package br.com.pds.model;

public class Player {
	int qtdVitorias;
	int qtdDerrotas;
	
	public Player() {
		super();
	}
	
	public Player(int qtdVitorias, int qtdDerrotas) {
		this.qtdVitorias = qtdVitorias;
		this.qtdDerrotas = qtdDerrotas;
	}
	
	public int getQtdVitorias() {
		return this.qtdVitorias;
	}
	
	public void setQtdVitorias(int qtdVitorias) {
		this.qtdVitorias = qtdVitorias;
	}
	
	public int getQtdDerrotas() {
		return this.qtdDerrotas;
	}
	
	public void setQtdDerrotas(int qtdDerrotas) {
		this.qtdDerrotas = qtdDerrotas;
	}
	
}
