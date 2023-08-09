package Pessoa;

public class Pessoa {
	public String nome;
	public String ra;
	public int idade;
	
	public void responderChamada(int resposta) {
		if(resposta == 1) { 
			System.out.println("Presente!");
		} else {
			System.out.println("Faltou!");
		}
	}
}
