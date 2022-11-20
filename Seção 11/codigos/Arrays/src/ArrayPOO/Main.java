package ArrayPOO;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int qtdProdutos = input.nextInt();
		Produto[] produtos = new Produto[qtdProdutos];

		for (int i = 0; i < produtos.length; i++) {
			input.nextLine();
			String nome = input.nextLine();			
			double preco = input.nextDouble();

			produtos[i] = new Produto(nome, preco);
		}

		double media = 0;

		for (int i = 0; i < produtos.length; i++) {
			media += produtos[i].getPreco();
		}

		media /= qtdProdutos;
		System.out.printf("AVERAGE PRICE = %.2f%n", media);

		input.close();
	}

}
