package pacote;
import java.util.Scanner;

public class Exer036 {
	public static void main(String[] args) {
		
		// Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
		// mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
		//( Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
		
		Scanner sc = new Scanner(System.in); 
		System.out.print("Informe a idade expressa em anos, meses e dias: \n");
		System.out.print("Anos: ");
		int ano = sc.nextInt();
		System.out.print("Meses: ");
		int mes = sc.nextInt();
		System.out.print("Dias: ");
		int dia = sc.nextInt();
		
		int dias = (365 * ano) + (mes * 30) + dia;
		System.out.println("Dias: "+ dias);
		
		
		sc.close();
	}

}
