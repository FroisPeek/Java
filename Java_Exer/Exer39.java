package Repetição;
import java.util.Scanner;

public class Exer39 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Proposta de exercicio: 
		// Leia um valor inteiro N. Este valor será a quantidade de números inteiros que serão lidos em seguida. 
		// Para cada valor lido, mostre uma mensagem dizendo se este valor lido é PAR ou IMPAR, e também 
		// se é POSITIVO ou NEGATIVO. No caso do valor ser igual a zero (0), seu programa deverá imprimir 
		// apenas NULO. 
		
		System.out.println("Quantos numeros voce vai digitar: ");
		int quantidade = sc.nextInt();
		
		for (int i = 0; i < quantidade; i++) { //estrutura de repetição for, vai repetir a pergunta a quantidade de vezes que o usuario solicitar
			System.out.println("Digite um numero inteiro: ");
			int numero = sc.nextInt();
			if (numero % 2 == 0 && numero > 0) { // condição para ser um par positivo
				System.out.println("PAR POSITIVO");
			} else if(numero % 2 == 0 && numero < 0) { // condição para ser um par negativo
				System.out.println("PAR NEGATIVO");
			} else if(numero % 2 != 0 && numero > 0) { // condição para ser um impar positivo
				System.out.println("IMPAR POSITIVO");
			} else if(numero % 2 != 0 && numero < 0) { // condição para ser um impar negativo
				System.out.println("IMPAR NEGATIVO");
			} else {
				System.out.println("NULO"); // a unica condição nao dita, valor 0 = nulo
			}
		}
		sc.close();
	}
}