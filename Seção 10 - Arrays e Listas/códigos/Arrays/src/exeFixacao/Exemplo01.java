package exeFixacao;
import java.util.Locale;
import java.util.Scanner;

public class Exemplo01 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int qtdAlturas = input.nextInt();
		double[] alturas = new double[qtdAlturas];
		double media = 0;

		for (int i = 0; i < alturas.length; i++) {
			alturas[i] = input.nextDouble();
			media += alturas[i];
		}

		media /= qtdAlturas;
		System.out.printf("AVERAGE HEIGHT = %.2f ", media);

		input.close();
	}

} 
