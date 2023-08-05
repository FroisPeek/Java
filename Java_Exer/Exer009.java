package application;
import java.util.Scanner;

public class Exer009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do raio do circulo: ");
		double raio = sc.nextDouble();
		double area = 3.14159 * (raio*raio);
		System.out.printf("Area: %.3f", area);
		
		sc.close();
	}

}
