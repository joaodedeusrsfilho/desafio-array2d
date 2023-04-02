package desafio2D;

public class Array2D {

	public static void main(String[] args) {
		/*
		 * Dado um array 2D representando uma planilha, calcule o checksum da planilha.
		 * O checksum é calculado somando o checksum de cada linha. O checksum da linha
		 * é a diferença entre o maior e o menor número.
		 * 
		 * data:
		 * 
		 * 5 1 9 5 7 5 3 2 4 6 8
		 * 
		 * Primeira linha: 9 - 1 = 8 
		 * Segunda linha: 7 - 3 = 4 
		 * Terceira linha: 8 - 2 = 6
		 * 
		 * Checksum = 8 + 4 + 6 = 18
		 */
		int[][] array2D = { { 5, 1, 9, 5 }, { 7, 5, 3 }, { 2, 4, 6, 8 } };
		int checksum = 0;

		for (int i = 0; i < array2D.length; i++) {
			int maior = Integer.MIN_VALUE;
			int menor = Integer.MAX_VALUE;

			for (int j = 0; j < array2D[i].length; j++) {
				if (array2D[i][j] > maior) {
					maior = array2D[i][j];
				}
				if (array2D[i][j] < menor) {
					menor = array2D[i][j];
				}
			}
			System.out.println("Linha " + (i + 1) + ": " + maior + " - " + menor + " = " + (maior - menor));
			checksum += (maior - menor);
		}
		System.out.println("Checksum = " + checksum);
	}
}
