package application;
import java.util.Scanner;

public class Exer013 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a duracao em segundos: ");
		int tempo = sc.nextInt();
		
		int horas = tempo / 3600;
        int minutos = (tempo % 3600) / 60;
        int segundos = tempo % 60;

        System.out.println("Duração formatada: " + horas + ":" + minutos + ":" + segundos);

		sc.close();
	}

}
