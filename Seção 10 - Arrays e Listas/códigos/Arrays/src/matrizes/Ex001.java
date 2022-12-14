package matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Ex001 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int linhas = input.nextInt();
		int colunas = input.nextInt();

		int[][] matriz = new int[linhas][colunas];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = input.nextInt();
			}
		}

		int numero = input.nextInt();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == numero) {
					System.out.println("Position " + i + "," + j + ":");

					if (j > 0 && j <= (colunas - 1)) {
						System.out.println("Left: " + matriz[i][j - 1]);
					}

					if (j + 1 <= matriz[1].length) {
						System.out.println("Right: " + matriz[i][j + 1]);
					}

					if (i - 1 >= 0) {
						System.out.println("Up: " + matriz[(i - 1)][j]);
					}

					if (i + 1 <= matriz[i].length) {
						System.out.println("Down: " + matriz[(i + 1)][j]);
					}

				}
			}
		}

		input.close();
	}

}
