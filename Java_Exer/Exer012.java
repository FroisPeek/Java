package application;
import java.util.Scanner;

public class Exer012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a medida A: ");
		double a = sc.nextDouble();
		System.out.print("Digite a medida B: ");
		double b = sc.nextDouble();
		System.out.print("Digite a medida C: ");
		double c = sc.nextDouble();
		
		double areaq = a*a;
		double areat = a*b/2;
		double areatt = (a+b)*c/2;
		
		System.out.printf("\nArea do quadrado: %.4f", areaq);
		System.out.printf("\nArea do triangulo: %.4f", areat);
		System.out.printf("\nArea do trapezio: %.4f", areatt);
		
		sc.close();
	}
}
