package boa;
import java.util.ArrayList;

public class a1 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>(); 
		
		// questao a
		numeros.add(10); 
		numeros.add(20);
		numeros.add(30);
		
		// questao b
		System.out.println("A lista tem: " + numeros.size() + " de tamanho!");
		
		// questao c
		numeros.remove(1);
		
		// questao d
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) == 40) {
				System.out.println(numeros.get(i) + ", Valor encontrado!");
			} else { 
				System.out.println(numeros.get(i) + ", Valor desconhecido! (DIFERENTE DE 40)");
			}
		}
	}
}
