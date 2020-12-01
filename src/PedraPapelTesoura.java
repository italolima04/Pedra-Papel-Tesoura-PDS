import java.util.Scanner;
import java.util.Random;

public class PedraPapelTesoura implements Jogo{
	static Scanner entrada = new Scanner(System.in);
	Random numeroAleatorio = new Random();
	
	public int palpiteJogador() {
		String palpite = entrada.nextLine();
		if(palpite.equals("pedra")) {
			return 0;
		} else if(palpite.equals("papel")) {
			return 1;
		} else if(palpite.equals("tesoura")) {
			return 2;
		}
		return 3;
	}
	
	public int palpiteComputador() {
		int palpite = numeroAleatorio.nextInt(2);
		return palpite;
	}
	
	public void converteJogada(int palpite) {
		if(palpite == 0) {
			System.out.println("Jogou: Pedra");
		}else if(palpite == 1) {
			System.out.println("Jogou: Papel");
		}else if(palpite == 2) {
			System.out.println("Jogou: Tesoura");
		}
	}
	
	public int rodada() {
		int palpiteJogador = palpiteJogador();
		converteJogada(palpiteJogador);
		int palpiteComputador = palpiteComputador();
		converteJogada(palpiteComputador);
		if((palpiteJogador == 1 && palpiteComputador == 0)|| (palpiteJogador == 0 && palpiteComputador == 2) || (palpiteJogador == 2 && palpiteComputador == 1)) {
			return 1;
		}else if((palpiteJogador == 0 && palpiteComputador == 1)|| (palpiteJogador == 2 && palpiteComputador == 0) || (palpiteJogador == 1 && palpiteComputador == 2) ) {
			return 2;
		}
		return 0;
	}
}
