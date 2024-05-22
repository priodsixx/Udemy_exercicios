package packs6;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		
		int number = sc.nextInt();
		
		if(number < 0) {
			
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NAO NEGATIVO");
		}
		System.out.println("Deseja continuar?(Y/N)");
		
		char prog = sc.next().charAt(0);
		
		while(prog == 'Y') {
			
			System.out.println("Digite um número inteiro: ");
			
			 number = sc.nextInt();
			
			if(number < 0) {
				
				System.out.println("NEGATIVO");
			}
			else {
				System.out.println("NAO NEGATIVO");
			}
			
			System.out.println("Deseja continuar?(Y/N)");
			
			 prog = sc.next().charAt(0);
			
		}
		
		if (prog == 'N') {
			
			System.out.println("O programa termina aqui.");
		}
		
		

	}

}
