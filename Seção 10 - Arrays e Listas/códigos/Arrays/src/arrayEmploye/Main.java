package arrayEmploye;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		int qtd = input.nextInt();
		List<Employe> employees = new ArrayList<>();
		Employe idX, idY;
		for (int i = 0; i < qtd; i++) {

			do {
				System.out.println("Emplyoee #" + (i + 1) + ":");
				System.out.print("Id: ");
				int id = input.nextInt();
				idX = employees.stream().filter(x -> x.getId() == id).findAny().orElse(null);
				System.out.print("Name: ");
				input.nextLine();
				String name = input.nextLine();
				System.out.print("Salary: ");
				double salary = input.nextDouble();
				System.out.println();
				if (idX == null) {
					employees.add(new Employe(id, name, salary));
				} else {
					System.out.println("ID already exist!\nPlease enter whit a different ID:\n");

				}

			} while (idX != null);

		}

		System.out.print("Enter the employee id that will have salary increase: ");
		int idInc = input.nextInt();
		idY = employees.stream().filter(x -> x.getId() == idInc).findAny().orElse(null);
		System.out.print("Enter the percentage: ");
		double percentage = input.nextDouble();
		idY.increaseSalary(percentage);
		System.out.println("\nList of employees: ");
		for (Employe employe : employees) {
			System.out.println(employe);
		}

		input.close();
	}

}
