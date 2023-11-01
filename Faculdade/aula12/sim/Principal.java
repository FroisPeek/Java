package sim;

public class Principal {
	public static void main(String[] args) {
		PF p1 = new PF();
		p1.nome = "Joao";
		p1.cpf = "00000000";
		p1.apresentarNome();
		
		PF p2 = new PF();
		p2.nome = "Maria";
		p2.apresentarNome();
		
	}
}
