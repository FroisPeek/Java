package application;
import java.util.Scanner;

public class Exer031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codg, cta = 0, ctg = 0, ctd = 0;

        do {
            System.out.println("Informe o código (1, 2, 3) ou 4 para parar: ");
            codg = sc.nextInt();
            
            if (codg == 4) {
                System.out.println("MUITO OBRIGADO!");
                break; 
            }
            else {
            	switch (codg) {
            	case 1: 
            		cta += 1;
            		break;
            	case 2:
            		ctg += 1;
            		break;
            	case 3:
            	ctd += 1;
            	break;
            	}
            }	
            
        } while (true); 
        System.out.printf("Alcool: %d", cta);
        System.out.printf("\nGasolina: %d", ctg);
        System.out.printf("\nDiesel: %d", ctd);

        sc.close();
    }
}
