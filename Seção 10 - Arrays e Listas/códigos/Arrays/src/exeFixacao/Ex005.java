package exeFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Ex005 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar?");
		int qtdNumeros = input.nextInt();
		double[] numeros = new double[qtdNumeros];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero:");
			numeros[i] = input.nextDouble();	
		}
		
		double maiorValor = 0;
		int posicao = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] > maiorValor) {
				maiorValor = numeros[i];
				posicao = i;
			}
		}
		
		System.out.println("\nMAIOR VALOR = " + maiorValor);
		System.out.println("POSIÇÃO DO MAIOR VALOR = " + posicao);

		input.close();
		
	}

}
