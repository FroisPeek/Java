package application;
import java.util.Scanner;


public class Exer005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a base do retangulo: ");
		double base = sc.nextDouble();
		System.out.print("Informe a altura do retangulo: ");
		double altura = sc.nextDouble();
		
		double area = base * altura;
		double perimetro = base*2 + altura*2;
		double diagonal = Math.sqrt(base * base + altura * altura);
		
		System.out.printf("\nArea: %.4f", area);
		System.out.printf("\nPerimetro: %.4f", perimetro);
		System.out.printf("\nDiagonal: %.4f", diagonal);
		
		sc.close();
	}
}
