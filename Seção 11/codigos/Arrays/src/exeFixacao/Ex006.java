package exeFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Ex006 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Quantos números você vai digitar? ");
		int qtdNumeros = input.nextInt();
		int[] a = new int[qtdNumeros];
		int[] b = new int[qtdNumeros];
		int[] c = new int[qtdNumeros];

		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextInt();
		}

		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i < b.length; i++) {
			b[i] = input.nextInt();
		}

		for (int i = 0; i < c.length; i++) {
			c[i] = a[i] + b[i];
		}

		System.out.println("VETOR RESULTANTE: ");

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

		input.close();

	}

}
