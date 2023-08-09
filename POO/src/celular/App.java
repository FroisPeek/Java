package celular;

public class App {
	public static void main(String[] args) {
		
		// Iphone 12, tela de 6.1", 256gb
		// Galaxy Note, tela de 6.9", 256gb
		// Xiomi Mi 11 Pro, tela 6.81", 128gb
		
		
		// Declarando um objeto do tipo Celular -> Instanciando um objeto.
		Celular celularA = new Celular(); // Informações do Iphone 12 (Objeto celularA)
		celularA.nome = "Iphone 12";
		celularA.tamanho = 6.1;
		celularA.armazenamento = 256;
		celularA.sistemaOperacional = "ioS";
		
		System.out.printf("Celular %s com tela de %.2f polegadas, com %dgb de armazenamento e SO %s.", celularA.nome, celularA.tamanho, celularA.armazenamento, celularA.sistemaOperacional);
		
		
		Celular celularB = new Celular(); //Informações do Galaxy Note (Objeto celularB)
		celularB.nome = "Galaxy Note";
		celularB.tamanho = 6.9;
		celularB.armazenamento = 256;
		celularB.sistemaOperacional = "Android";
		
		System.out.printf("\nCelular %s com tela de %.2f polegadas, com %dgb de armazenamento e SO %s.", celularB.nome, celularB.tamanho, celularB.armazenamento, celularB.sistemaOperacional);

		
		Celular celularC = new Celular(); //Informações do Xiomi Mi (Objeto CelularC)
		celularC.nome = "Xiomi Mi";
		celularC.tamanho = 6.81;
		celularC.armazenamento = 128;
		celularC.sistemaOperacional = "Android";
		
		System.out.printf("\nCelular %s com tela de %.2f polegadas, com %dgb de armazenamento e SO %s.", celularC.nome, celularC.tamanho, celularC.armazenamento, celularC.sistemaOperacional);

	}

}