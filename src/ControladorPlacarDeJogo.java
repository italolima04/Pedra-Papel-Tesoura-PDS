
public class ControladorPlacarDeJogo {
	public void incrementaPlacarJogador(Jogador jogador) {
		jogador.setQtdVitorias((jogador.getQtdVitorias() + 1));
	}
	
	public void incrementaPlacarComputador(Computador computador) {
		computador.setQtdVitorias((computador.getQtdVitorias() + 1));
	}
	
	public void decrementaPlacarJogador(Jogador jogador) {
		jogador.setQtdDerrotas((jogador.getQtdDerrotas() + 1));
	}
	
	public void decrementaPlacarComputador(Computador computador) {
		computador.setQtdDerrotas((computador.getQtdDerrotas() + 1));
	}
	
	public void placarAtualJogo(Jogador jogador, Computador computador) {
		
	}
}
