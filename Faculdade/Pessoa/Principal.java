package Pessoa;

public class Principal {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.nome = "Franscisco Molina";
		p1.ra = "12324";
		p1.idade = 40;
		System.out.println(p1.nome);
		p1.responderChamada(1);
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Eduardo Frois";
		p2.ra = "2321434";
		p2.idade = 18;
		System.out.println(p2.nome);
		p2.responderChamada(2);
		
		}

}