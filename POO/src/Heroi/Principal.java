package Heroi;

public class Principal {

	public static void main(String[] args) {
		Persona heroi1 = new Persona();
		heroi1.nome = "Warden";
		heroi1.nivel = 2;
		heroi1.forca = 16;
		
		// "Heroi : <nome> (Lvl <nivel>) com <forca> de força."
		heroi1.mostraStatus();
		
		// Chamei um método atacar e passei como argumento uma sting "Hydra"
		heroi1.atacar("Hydra", "Golpe Duplo");
		
		}

}
