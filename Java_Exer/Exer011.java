package application;
import java.util.Scanner;

public class Exer011 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Distancia percorrida: ");
		double distancia = sc.nextDouble();
		System.out.print("Combustivel gasto: ");
		double combustivel = sc.nextDouble(); 
		System.out.printf("Consumo medio: %.3f", distancia/combustivel);
		
		sc.close();
	}
}
