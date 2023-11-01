package sim;

public class Pessoa {
	
	public String nome;
	
	public void apresentarNome() {
		System.out.println("Eduardo");
	}
	
	public void apresentarNome(String sobreNome) {
		System.out.println("Eduardo " + sobreNome);
	}
	
	public void apresentarNome(String sobreNome, boolean tornaMaiusculo) {
		if(tornaMaiusculo) {
			System.out.println(("Eduardo " + sobreNome).toUpperCase());	
		}
		else {
			System.out.println("Eduardo " + sobreNome);
		}
	}
	
	
}
