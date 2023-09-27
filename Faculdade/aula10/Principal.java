package aula10;

public class Principal {
	public static void main(String[] args) {
		
		PF pf1 = new PF();
		pf1.idade = 18;
		pf1.setCpf("059405461-37");
		pf1.setNome ("Eduardo Frois");
		pf1.data = "24/01/2005";
		
		PJ pj1 = new PJ();
		pj1.cnpj = "000.000.111/01";
		pj1.data = "23/02/2023";
		pj1.idade = 1;
		pj1.setNome("SpaceX");
		
		System.out.println("Nome do dono: " + pf1.getNome());
		System.out.println("Nome da empresa: " + pj1.getNome());
		
	}
}
