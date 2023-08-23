package aula003;

public class Mercadoria {
		
	public String nome;
	public double preco;
	public int codigo;
	
	@Override
	public String toString() {
		return this.nome.toUpperCase() + " - " + this.preco + "R$" + "\n    (código) ==>  " + this.codigo;
	} 
	
	// configura a função toString para a visualização do usuario.
}
