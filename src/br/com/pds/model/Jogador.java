package br.com.pds.model;

public class Jogador extends Player{
	@Override
	public String toString() {
		return "Quantidade de Vitórias do Jogador: " + this.getQtdVitorias() + "\n" + "Quantidade de Derrotas do Jogador: " + this.getQtdDerrotas() ;
	}
}
