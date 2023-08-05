package application;
import java.util.Scanner;

public class Exer025 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Hora inicial: ");
		int start = sc.nextInt();
		System.out.print("Hora final: ");
		int end = sc.nextInt();
	
		if (start <= end) {
            int duracao = end - start;
            System.out.printf("O jogo durou: %d horas", duracao);
        } else if (end <= start){
            int duracao = 24 - start + end;
            System.out.printf("O jogo durou: %d horas", duracao);  
        }
	
		sc.close();
	}
}
