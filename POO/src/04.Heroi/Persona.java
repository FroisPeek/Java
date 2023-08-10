package Heroi;
import java.util.Random;

public class Persona {
	public String nome;
	public int nivel;
	public int forca;
	
	// void --> significa que nao esta retornando. 
	void mostraStatus() {
		System.out.format("Heroi: %s (Lvl %d) com %d de força.\n", nome, nivel, forca);
	}
	
	int calcularDano(){
		Random gerador = new Random(); // 1 ... 20
		int dado20faces = 1 + gerador.nextInt(19); // nextInt(): 0 ... 20  --> 0 ... 19 + 1, isso significa que nunca vai sair 0
		int dano = forca + dado20faces;
		return dano;
	}
	
	// método que nao retorna nada e recebe um parametro alvo que é do tipo String.
	void atacar(String alvo, String habilidade) {
		int danoCausado = calcularDano();
		
		// o tamanho (.length) é igual a 0
		if (habilidade.length() == 0) {
			System.out.printf("%s atacou %s e causou %d de dano.\n", nome, alvo, forca);
		} else { 
			System.out.printf("%s usou '%s' contra %s e causou %d de dano.\n", nome, habilidade, alvo, danoCausado);
		}
		
	}
}
