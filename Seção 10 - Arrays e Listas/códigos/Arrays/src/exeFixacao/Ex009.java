package exeFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Ex009 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Quantas pessoas você vai digitar ? ");
		int qtdPessoas = input.nextInt();

		String[] nomes = new String[qtdPessoas];
		int[] idades = new int[qtdPessoas];

		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Dados da " + (i + 1) + "pessoa:");
			input.nextLine();
			System.out.println("Nome:");
			nomes[i] = input.nextLine();
			System.out.println("Idade: ");
			idades[i] = input.nextInt();
		}

		int idadeAnterior = 0;
		int indiceMaior = 0;

		for (int i = 0; i < idades.length; i++) {
			if (idades[i] > idadeAnterior) {
				idadeAnterior = idades[i];
				indiceMaior = i;

			}

		}

		System.out.println("Pessoa mais velha: " + nomes[indiceMaior]);

		input.close();

	}
}