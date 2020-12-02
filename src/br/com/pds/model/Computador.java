package br.com.pds.model;

public class Computador {
	int qtdVitorias;
	int qtdDerrotas;
	
	public Computador() {
		super();
	}
	
	public Computador(int qtdVitorias, int qtdDerrotas) {
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
	
	@Override
	public String toString() {
		return "Quantidade de Vitórias do Computador: " + this.getQtdVitorias();
	}
}
