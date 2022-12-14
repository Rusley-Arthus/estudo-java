package exeFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Ex004 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Quantos números você vai digitar? ");
		int qtdNumeros = input.nextInt();
		int[] numeros = new int[qtdNumeros];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um número: ");
			numeros[i] = input.nextInt();
		}

		int contador = 0;

		System.out.println("\nNÚMEROS PARES: ");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.print(numeros[i] + " ");
				contador++;
			}
		}
		
		System.out.println("\n\nQUANTIDADE DE PARES = " + contador);
		input.close();
	}

}
