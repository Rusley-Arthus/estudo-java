package exeFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Ex002 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Quantos números você vai digitar ?");
		int qtdNumeros = input.nextInt();

		double soma = 0.0;
		double media = 0.0;
		double[] numeros = new double[qtdNumeros];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite o número: ");
			numeros[i] = input.nextDouble();
		}

		System.out.print("\nVALORES = ");
		for (double numero : numeros) {
			System.out.print(numero + " ");
			soma += numero;
		}
		
		media = soma / qtdNumeros;
		System.out.printf("\nSOMA = %.2f%nMEDIA = %.2f%n", soma, media);

		input.close();

	}

}
