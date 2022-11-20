package exeFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Ex007 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Quantos elementos vai ter o vetor? ");
		int qtdNumeros = input.nextInt();
		double[] vetor = new double[qtdNumeros];
		double somatorio = 0;
		double media = 0;

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um numero:");
			vetor[i] = input.nextDouble();
			somatorio += vetor[i];
		}

		media = somatorio / qtdNumeros;
		
		System.out.printf("\nMEDIA DO VETOR = %.3f%n", media);
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA:  ");
		
		for (double valor : vetor) {
			if (valor < media) {
				System.out.println(valor);
			}
		}

		input.close();

	}

}
