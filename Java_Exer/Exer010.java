package application;
import java.util.Scanner;

public class Exer010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome1 = sc.next();
		String nome2 = sc.next();
		System.out.print("Valor por hora: ");
		double valor = sc.nextDouble();
		System.out.print("Horas trabalhadas: ");
		double horas = sc.nextDouble();
		
		double pagamento = horas * valor;
		
		System.out.printf("O pagamento para %s %s deve ser %.2f", nome1, nome2, pagamento);
		sc.close();
	}

}
