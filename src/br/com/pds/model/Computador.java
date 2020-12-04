package br.com.pds.model;

public class Computador extends Player{	
	@Override
	public String toString() {
		return "Quantidade de Vitórias do Computador: " + this.getQtdVitorias() + "\n" + "Quantidade de Derrotas do Jogador: " + this.getQtdDerrotas();
	}
}
