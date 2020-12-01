import java.util.Scanner;

public class Interface {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {	
		PedraPapelTesoura ppt = new PedraPapelTesoura();
		Jogador jog1 = new Jogador();
		Jogador jog2 = new Jogador();
		System.out.println("Seja Bem-Vindo ao Célebre Jogo PPT: Pedra, Papel, Tesoura. Vamos Jogar! :)");
		System.out.println("Instruções a Seguir: ");
		System.out.println("Por Favor, digite 'pedra', 'papel' ou 'tesoura' para representar sua jogada");
		int resultado = ppt.rodada();
		if(resultado == 0) {
			System.out.println("Empate");
			System.out.println("Quantidade de Vitórias do Jogador: " + jog1.getQtdVitorias());
		}else if(resultado == 1) {
			jog1.setQtdVitorias((jog1.getQtdVitorias() + 1)); 
			jog1.setQtdDerrotas((jog1.getQtdDerrotas() + 1));
			System.out.println("O Jogador Venceu");
			System.out.println("Quantidade de Vitórias do Jogador: " + jog1.getQtdVitorias());
		}else if(resultado == 2) {
			
			System.out.println("O Computador Venceu");
			System.out.println("Quantidade de Vitórias do Jogador: " + jog1.getQtdVitorias());

		}
	}
}
