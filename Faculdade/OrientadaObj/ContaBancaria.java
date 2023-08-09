package OrientadaObj;
public class ContaBancaria {

	public String agencia;
	public String conta;
	public String nBanco;
	public double dinheiro;
	
	public void entrarConta(int resposta) {
		if(resposta == 1) {
			System.out.println("Entrou na conta!");
		} else {
			System.out.println("Saiu da conta!");
		}
	}
	
}
