package aula003;

// import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		
		Mercadoria m1 = new Mercadoria();
		m1.nome = "Televisão";
		m1.codigo = 123;
		m1.preco = 1000.50;
		
//		Scanner sc = new Scanner(System.in);
//		
//		Mercadoria m2 = new Mercadoria();
//		System.out.println("Informe o nome do produto: ");
//		m2.nome = sc.next();
//		System.out.println("Informe o codigo do produto: ");
//		m2.codigo = sc.nextInt();
//		System.out.println("Informe o preço do produto: ");
//		m2.preco = sc.nextDouble();
//		
//		System.out.println(m2.nome);
//		System.out.println(m2.codigo);
//		System.out.println(m2.preco);
//		
//		sc.close();
		
		Mercadoria m3 = new Mercadoria(); // declarando novo objeto m3
		
		m3.nome = JOptionPane.showInputDialog("Informe o nome: "); // jeito de declara o nome do objeto de uma forma que aparece uma nova janela
		m3.codigo = Integer.valueOf(JOptionPane.showInputDialog("Informe o codigo: ")); // Integer.valueOf = declara como inteiro o valor digitado na janela
		m3.preco = Double.valueOf(JOptionPane.showInputDialog("Informe o preço do produto: ")); // Double.valueOf = declara como double
		
		JOptionPane.showMessageDialog(null, m3.toString()); // metodo toString, uma maneira mais pratica de mostrar os dados capitados
				
		//System.out.println("Nome: "+ m3.nome);
		//System.out.println("Codigo: "+ m3.codigo);
		//System.out.println("Preço: "+ m3.preco);
		
	}
}











