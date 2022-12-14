package exeFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Ex008 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Quantos elementos vai ter o vetor? ");
		int qtdElementos = input.nextInt();
		int[] vetor = new int[qtdElementos];

		int somatorio = 0;
		double media = 0;
		int qtdPares = 0;

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um numero:");
			vetor[i] = input.nextInt();
			if (vetor[i] % 2 == 0) {
				somatorio += vetor[i];
				qtdPares++;
			}

		}
		
		if (somatorio > 0) {
			media = somatorio / qtdPares;
			System.out.printf("MEDIA DOS PARES = %.1f%n", media);
		} else {
			
			System.out.println("NENHUM NÚMERO PAR");
		}

		input.close();

	}

}
