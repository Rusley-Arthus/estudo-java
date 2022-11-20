package exeFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Ex003 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Quantas pessoas serão digitadas? ");
		int qtdPessoas = input.nextInt();

		Pessoa[] pessoas = new Pessoa[qtdPessoas];
		double alturas = 0;
		double somaMenor16 = 0;		

		for (int i = 0; i < pessoas.length; i++) {
			input.nextLine();
			System.out.println("Dados da " + (i + 1) + " pessoa: ");
			System.out.print("Nome: ");
			String nome = input.nextLine();
			System.out.print("Idade: ");
			int idade = input.nextInt();
			System.out.print("altura: ");
			double altura = input.nextDouble();
			pessoas[i] = new Pessoa(nome, idade, altura);
		}
		
		for (Pessoa pessoa: pessoas) {
			alturas += pessoa.getAltura();
			if(pessoa.getIdade() < 16) {
				somaMenor16 ++;
			}
			
		}
		
		double porcentagem = (somaMenor16 * 100) / pessoas.length;
		double alturaMedia = alturas / qtdPessoas;
		System.out.printf("\nAltura média: %.2f%n", alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos: %.2f%%%n", porcentagem);
		
		for (Pessoa pessoa: pessoas) {
			if(pessoa.getIdade() < 16) {
				System.out.println(pessoa.getNome());
			}
			
		}
		
		input.close();

	}

}
