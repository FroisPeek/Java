package sim;
import java.util.Iterator;
import javax.swing.JOptionPane;


public class Main {	
	public static int[] lista = { 432, 809, 213, 725, 37, 960, 578, 63, 921, 145, 689, 281, 506, 955, 194, 374, 
			820, 62, 890, 485, 786, 911, 394, 178, 627, 902, 420, 579, 733, 96, 311, 654, 250, 771, 9, 624, 712,
			135, 505, 884, 445, 688, 77, 912, 721, 390, 538, 893, 470, 679, 1, 869, 302, 946, 561, 144, 790, 422,
			769, 57, 899, 308, 687, 469, 237, 630, 961, 36, 578, 799, 180, 628, 886, 298, 835, 62, 974, 214, 518,
			746, 132, 899, 243, 511, 798, 235, 681, 61, 918, 375, 692, 993, 183, 553, 846, 24, 954, 286, 647, 129};
	
	public static int[] listaTemp = {};
	public static int[] listaTempH = {};
	
	public static void main(String[] args) {
		apresentaOpcoes();
	}
	
	
	public static void mostrar(int[] paraMostrar) {
		String original = "";
		for (int i = 0; i < paraMostrar.length; i++) {
			original += paraMostrar[i];
			if (i == 99) {
				original += "";
			}
			else {
				original += ", ";
			}
			if (i == 50) {
				original += "\n";
			}
		}
		JOptionPane.showMessageDialog(null, "Lista: " + original);
	}
	
	/**
	 * Ordena e obtém os millisegundos que demorou para executar.
	 * @return
	 */
	public static long ordenarListaBubble() {
		long start = markStartTime();
		listaTemp = Bubble.ordenar(lista);
		long elapsed = markEndTime(start);
		return elapsed;
	}
	
	/**
	 * Ordena e obtém os millisegundos que demorou para executar.
	 * @return
	 */
	public static long ordenarListaHeap() {
		long start = markStartTime();
		listaTempH = Heap.heapsort(lista);
		long elapsed = markEndTime(start);
		return elapsed;
	}
	

	
	public static long markStartTime() {
		return System.currentTimeMillis();
	}
	
	public static long markEndTime(long startTime) {
		return System.currentTimeMillis() - startTime;
	}
	
	
	
	public static void apresentaOpcoes() {
		long elapsedBubble = -1;
		long elapsedHeap = -1;
		while (true) {
			String opcao = JOptionPane.showInputDialog(
					"1 - Ordenar lista Bubble \n" +
					"2 - Ordenar lista Heap \n" +
					"3 - Apresentar comparação \n" +
					"4 - Apresentar lista original \n" +
					"5 - Sair"
				);
			
	
			
			if(opcao.equals("1")) {
				elapsedBubble = ordenarListaBubble(); 
				mostrar(listaTemp);
			} else if(opcao.equals("2")) {
				elapsedHeap = ordenarListaHeap();
				mostrar(listaTempH);
			} else if(opcao.equals("3")) {
				if (elapsedBubble > -1 && elapsedHeap> -1 ) {
					JOptionPane.showMessageDialog(null, "Comparação das listas: \nBubble: "+ (elapsedBubble) + "ms\n" +"Heap: " + (elapsedHeap)+"ms");
				}else {
					JOptionPane.showMessageDialog(null, "Algoritimo ainda não ordenado! ");				
					}
			} else if(opcao.equals("4")) {
				mostrar(lista);
			} else if(opcao.equals("5")) {
				break;
			}
			else {
				JOptionPane.showMessageDialog(null, "Opção Inválida");
			}
		}
	}
}
