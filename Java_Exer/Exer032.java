package application;

import java.util.Scanner;

public class Exer032 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int somap = 0, somai = 0;
		
        System.out.println("Digite um numero inteiro: ");
        int x = sc.nextInt();
        
        while (x != 0) {
        	if (x % 2 == 0) {
        		for (int i = x; i < x + 10; i += 2) {
                    System.out.println("I: " + i);
                    somap += i;
                }
        		System.out.println("Soma: " + somap);
        	} 
        	
        	else if(x % 2 != 0) {
        		x = x + 1;
        		for (int i = x; i < x + 10; i += 2) {
        			System.out.println("i: "+ i);
        			somai += i;
        		}
        		System.out.println("Soma: " + somai);
        	}
        	
            System.out.println("Digite um numero inteiro: ");
            x = sc.nextInt();
        } 
        sc.close();
	}    
}