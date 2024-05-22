package packs7;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in); 
			
		System.out.println("Digite um número inteiro:");
		
		int numbr = sc.nextInt();
		
		if(numbr % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		System.out.println("Deseja continuar?(Y/N)");
		
		char prog = sc.next().charAt(0);
		
		while (prog == 'Y') {
			
			System.out.println("Digite um número inteiro:");
			
			 numbr = sc.nextInt();
			
			if(numbr % 2 == 0) {
				System.out.println("PAR");
			}
			else {
				System.out.println("IMPAR");
			}
			System.out.println("Deseja continuar?(Y/N)");
			
			 prog = sc.next().charAt(0);
			
			
		}
		
		if (prog == 'N') {
			System.out.println("O programa termina aqui.");
		}
	}

}
