package aula003;

public class Mercadoria {
		
	public String nome;
	public double preco;
	public int codigo;
	
	@Override
	public String toString() {
		return this.nome.toUpperCase() + " - " + this.preco + "R$" + "\n    (c�digo) ==>  " + this.codigo;
	} 
	
	// configura a fun��o toString para a visualiza��o do usuario.
}
