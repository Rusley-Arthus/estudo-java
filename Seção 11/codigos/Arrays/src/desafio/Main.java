package desafio;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		Student[] rooms = new Student[10];

		System.out.println("How Many rooms will be rented?");
		int n = input.nextInt();

		String name, email;
		int nRoom;

		for (int i = 0; i < n; i++) {
			do {
				System.out.println();
				System.out.println("Rent #" + (i + 1) + ":");
				System.out.print("Name:");
				input.next();
				name = input.nextLine();
				System.out.print("Email:");
				email = input.nextLine();
				System.out.print("Room: ");
				nRoom = input.nextInt() - 1;

			} while (rooms[nRoom] != null);

			rooms[nRoom] = new Student(name, email);

		}
		
		System.out.println();
		System.out.println("Busy rooms:");

		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.println((i + 1) + ":" + rooms[i].getName() + ", " + rooms[i].getEmail());

			}
		}

		input.close();
	}

}
