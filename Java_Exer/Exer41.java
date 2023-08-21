package Repetição;
import java.util.Scanner;

public class Exer41 {
	public static void main(String[] args) {
		
		// proposta de exercicio: 
		// Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para 
		// organizar os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano, 
		// quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada. Este 
		// laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas 
		// informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia 
		// utilizada e a quantidade de cobaias utilizadas em cada experimento. Faça um programa que leia um 
		// valor inteiro N que indica os vários casos de teste que vem a seguir. Cada caso de teste contém um 
		// inteiro que representa a quantidade de cobaias utilizadas e uma letra ('C', 'R' ou 'S'), indicando o tipo 
		// de cobaia (R:Rato S:Sapo C:Coelho). Apresente o total de cobaias utilizadas, o total de cada tipo de 
		// cobaia utilizada e o percentual de cada uma em relação ao total de cobaias utilizadas, sendo que o 
		// percentual deve ser apresentado com dois dígitos após o ponto. 
		
		Scanner sc = new Scanner(System.in);
		int ctT = 0, ctS = 0, ctR = 0, ctC = 0; // declarando o contador
		
		System.out.print("Quantos casos de teste serao digitados: ");
		int casos = sc.nextInt(); // declarando a contidade de vezes em que o codigo de repeticao for vai repetir
		for (int i = 1; i <= casos; i++) { // estrutura de repeticao for
			System.out.print("Informe a quantidade de cobaias: ");
			int quantidade = sc.nextInt();
			System.out.println("Informe o tipo de cobaia (C para coelho, R para rato, S para sapo): ");
			String tipo = sc.next().toLowerCase(); // .toLowerCase(); = tudo digitado vai ficar minusculo
			if (tipo.equals("c")) { // verifica se foi digitado c e adiciona nos contadores
				ctC += quantidade;
				ctT += quantidade;
			} else if(tipo.equals("r")) { // verifica se foi digitado r e adiciona nos contadores
				ctR += quantidade;
				ctT += quantidade;
			} else if(tipo.equals("s")) { // verifica se foi digitado s e adiciona nos contadores
				ctS += quantidade;
				ctT += quantidade;
			} else {
				System.out.println("Informe um valor valido");
			}
		}
		System.out.println("Relatorio Final: ");
		System.out.println("Total: "+ ctT);
		System.out.println("Coelhos: " + ctC);
        System.out.println("Ratos: " + ctR);
        System.out.println("Sapos: " + ctS);
		
		sc.close();
	}
}