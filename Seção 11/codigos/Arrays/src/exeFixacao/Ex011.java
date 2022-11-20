package exeFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Ex011 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Quantas pessoas serão digitadas? ");
		int qtdPessoas = input.nextInt();

		double maiorAltura = 0;
		double menorAltura = 1000;
		double mediaAlturas = 0;
		int nHomens = 0;
		int nMulheres = 0;

		double[] alturas = new double[qtdPessoas];
		char[] genero = new char[qtdPessoas];

		for (int i = 0; i < alturas.length; i++) {
			System.out.println("Altura da " + (i + 1) + "a pessoa:");
			alturas[i] = input.nextDouble();

			System.out.println("Gênero da  " + (i + 1) + "a pessoa:");
			genero[i] = input.next().charAt(0);

		}

		for (int i = 0; i < alturas.length; i++) {

			if (alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
			}

			if (alturas[i] < menorAltura) {
				menorAltura = alturas[i];

			}

			if (genero[i] == 'f') {
				mediaAlturas += alturas[i];
				nMulheres++;
			}

			if (genero[i] == 'm') {
				nHomens++;
			}
		}

		mediaAlturas /= nMulheres;
		System.out.println("Menor Altura: " + menorAltura);
		System.out.println("Maior Altura: " + maiorAltura);
		System.out.printf("Media Alturas das mulheres: %.2f%n", mediaAlturas);
		System.out.println("Número de homens: " + nHomens);

		input.close();
	}

}
