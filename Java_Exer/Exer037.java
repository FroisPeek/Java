package pacote;
import java.util.Scanner;

public class Exer037 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Fazer um programa que imprima a média aritmética dos números 8, 9 e 7. A média dos
		// números 4, 5 e 6. A soma das duas médias. A média das médias.
		
		System.out.print("Média aritmética dos números 8, 9 e 7: ");
		int media1 = (8 + 9 + 7)/3;
		System.out.println(media1);
		System.out.print("Média aritmética dos números 4, 5 e 6: ");
		int media2 = (4 + 5 + 6)/3;
		System.out.println(media2);
		System.out.printf("A soma das duas medias: %d\n", media1 + media2);
		System.out.print("A média das médias: ");
		int medias = (media1 + media2)/2;
		System.out.print(medias);
		
		
		sc.close();
	}

}
