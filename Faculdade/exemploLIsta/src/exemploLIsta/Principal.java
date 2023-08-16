package exemploLIsta;
import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		figura f1 = new figura();
		f1.nome = "cubo";
		f1.nrLados = 6;
		f1.tipo = "forma geometrica";
		
		figura f2 = new figura();
		f2.nome = "triangulo";
		f2.nrLados = 3;
		f2.tipo = "forma geometrica";
		
		figura f3 = new figura();
		f3.nome = "estrela";
		f3.nrLados = 10;
		f3.tipo = "desenho";
		
		figura f4 = new figura();
		f4.nome = "quadrado";
		f4.nrLados = 4;
		f4.tipo = "forma geometrica";
		
		figura f5 = new figura();
		f5.nome = "pentagono";
		f5.nrLados = 5;
		f5.tipo = "forma geometrica";
		
		ArrayList<figura> ListaDeFiguras = new ArrayList<figura>();
		ListaDeFiguras.add(f1);
		ListaDeFiguras.add(f2);
		ListaDeFiguras.add(f3);
		ListaDeFiguras.add(f4);
		ListaDeFiguras.add(f5);
		
		for (int i = 0; i < ListaDeFiguras.size(); i++) {
			System.out.println(ListaDeFiguras.get(i).nome);
			System.out.println(ListaDeFiguras.get(i).nrLados);
			System.out.println("-------------------------------------------");
		}
	}
}