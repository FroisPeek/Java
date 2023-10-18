package sim;

public class aula11 {
	public static void main(String[] args) {
		int numeros[] = { 6, 4, 8, 2, 1, 7 };

		System.out.print("Array original: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

		bubbleSort(numeros);
		System.out.println();

		System.out.print("Arrey ordenado: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
	}

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
