package packs8;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira dois valores para comparar: ");
		
		int A = sc.nextInt();
		
		int B = sc.nextInt();
		
		if(A % 2 == 0 && B % 2 == 0) {
			
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		System.out.println("Deseja continuar?(Y/N)");
		
		char hell = sc.next().charAt(0);
		
		while (hell == 'Y') {
			System.out.println("Insira dois valores para comparar: ");
			
		    A = sc.nextInt();
			
			B = sc.nextInt();
			
			if(A % 2 == 0 && B % 2 == 0) {
				
				System.out.println("Sao Multiplos");
			}
			else {
				System.out.println("Nao sao Multiplos");
			}
			
			System.out.println("Deseja continuar?(Y/N)");
			
			 hell = sc.next().charAt(0);
			
		}
		if(hell == 'N') {
			System.out.println("O programa termina aqui.");
		}

	}

}
