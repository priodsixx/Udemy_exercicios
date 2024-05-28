package packs10;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma senha:");

		int pass = sc.nextInt();

		char goo;

		if (pass != 2002) {
			System.out.println("Senha invalida!");

			System.out.println("Deseja continuar?(Y/N)");
		}

		goo = sc.next().charAt(0);

		while (goo == 'Y') {
			System.out.println("Digite uma senha:");

			pass = sc.nextInt();

			if (pass != 2002) {
				System.out.println("Senha invalida!");

				System.out.println("Deseja continuar?(Y/N)");

				goo = sc.next().charAt(0);
			}

			if (pass == 2002) {
				System.out.println("Acesso permitido.");
				break;
			}

		}
		if (goo == 'N') {
			System.out.println("O programa encerrou.");
		}
	}

}
