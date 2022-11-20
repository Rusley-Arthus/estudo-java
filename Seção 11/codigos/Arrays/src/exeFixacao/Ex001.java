package exeFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Ex001 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int qtdElementos = 0;

		do {
			System.out.println("Quantos números você vai digitar? ");
			qtdElementos = input.nextInt();

		} while (qtdElementos <= 0);

		int[] vetorInteiros = new int[qtdElementos];

		for (int i = 0; i < vetorInteiros.length; i++) {
			System.out.println("Digite um número: ");
			vetorInteiros[i] = input.nextInt();
		}

		System.out.println("NÚMEROS NEGATIVOS:");

		for (int i = 0; i < vetorInteiros.length; i++) {
			if (vetorInteiros[i] < 0) {
				System.out.println(vetorInteiros[i]);
			}
		}

		input.close();
	}

}
