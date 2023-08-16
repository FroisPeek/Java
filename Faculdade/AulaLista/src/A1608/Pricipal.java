package A1608;
import java.util.ArrayList;

public class Pricipal {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.nome = "Franscisco Molina";
		p1.ra = "12324";
		p1.idade = 40;
		
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Eduardo Frois";
		
		Pessoa p3 = new Pessoa();
		p3.nome = "Lourrane";
		
		ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		
		listaPessoas.add(p1);
		listaPessoas.add(p2);
		listaPessoas.add(p3);
		
		System.out.println("Tamanho da lista: "+ listaPessoas.size());
		
		for (int i = 0; i < listaPessoas.size(); i++) {
			System.out.println(listaPessoas.get(i).nome);
		}
		
		
		
	
		
		}
}

