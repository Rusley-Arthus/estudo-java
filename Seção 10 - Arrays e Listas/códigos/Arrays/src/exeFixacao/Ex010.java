package exeFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Ex010 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Quantos alunos serao digitados?");
		int qtdAlunos = input.nextInt();


		String[] nomeAlunos = new String[qtdAlunos];
		double[] primeiraNota = new double[qtdAlunos];
		double[] segundaNota = new double[qtdAlunos];

		for(int i = 0; i < nomeAlunos.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do" +  (i + 1) + "aluno:");
			input.nextLine();
			nomeAlunos[i] = input.nextLine();
			primeiraNota[i] = input.nextDouble();
			segundaNota[i] = input.nextDouble();
		}
		
		System.out.println("Alunos Aprovados: ");
		for (int i = 0; i < primeiraNota.length; i++) {
			if((primeiraNota[i] + segundaNota[i]) / 2 >= 6.0) {
				System.out.println(nomeAlunos[i]);
			}
		}
		



		input.close();

	}

}
