package OrientadaObj;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ContaBancaria p1 = new ContaBancaria();
		p1.agencia = "22-4667";
		p1.conta = "86905.5";
		p1.nBanco = "77759.0";
		p1.dinheiro = 689.90;
				
		
		System.out.println(p1.conta);
		p1.entrarConta(1);
		
		ContaBancaria p2 = new ContaBancaria();
		p2.agencia = "56535-434";
		p2.conta = "4334.6";
		p2.nBanco = "436435.0";
		p2.dinheiro = 560095.44;
		
		System.out.println(p2.conta);
		p2.entrarConta(2);
		
	
		
		sc.close();
	}
}