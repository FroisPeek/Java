package listaVetor;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// proposta do exercicio: 
		// Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros 
		// e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 
		
		System.out.println("Quantos numeros voce vai digitar (maximo - 10): ");
		int num = sc.nextInt();
		if (num > 10) {
			System.out.println("Valor maior que 10, por favor  tente novamente: "); 
		} else {
			ArrayList<Integer> ListaDeNumeros = new ArrayList<Integer>();
			for (int i = 1; i <= num; i++) {
				System.out.print("Informe o valor: ");
				int valor = sc.nextInt();
				if(valor < 0) {
					ListaDeNumeros.add(valor);
				}
			}
		System.out.println("Números negativos digitados:");
           	for (Integer numero : ListaDeNumeros) {
           		System.out.println(numero);
            }
		}
		sc.close();
	}
}