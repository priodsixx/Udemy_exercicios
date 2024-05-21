/*Estudos de Desenvolvimento de Sistemas licenciado pela UDEMY lecionado pelo professor Nélio Alves feito por Carlos Miguel Bezerra de Oliveira,Curitiba-PR(21/05/2024)*/
package Packs5;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int codDapeca1  = sc.nextInt();
		
		int numeroDePeca1 = sc.nextInt();
		
		double valorUnitarioPeca1 =sc.nextDouble() ;
		
		double code1 = valorUnitarioPeca1 * numeroDePeca1;
	
		int codDapeca2  = sc.nextInt();
		
		int numeroDePeca2 = sc.nextInt();
		
		double valorUnitarioPeca2 =sc.nextDouble() ;
		
		double code2 = valorUnitarioPeca2 * numeroDePeca2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", code1 + code2);
		
		System.out.println("Deseja continuar?(Y/N)");
		
		char rework = sc.next().charAt(0);
		
		while(rework =='Y') {
			 
			codDapeca1  = sc.nextInt();
			
			 numeroDePeca1 = sc.nextInt();
			
			 valorUnitarioPeca1 =sc.nextDouble() ;
			
			 code1 = valorUnitarioPeca1 * numeroDePeca1;
		
		     codDapeca2  = sc.nextInt();
			
		     numeroDePeca2 = sc.nextInt();
			
			 valorUnitarioPeca2 =sc.nextDouble() ;
			
			 code2 = valorUnitarioPeca2 * numeroDePeca2;
			
			System.out.printf("VALOR A PAGAR: R$ %.2f%n", code1 + code2);
			
			System.out.println("Deseja continuar?(Y/N)");
			
			 rework = sc.next().charAt(0);
			
			
		}
		
		if (rework == 'N') {
			System.out.println("The program ends here. ");
		}
	
	}

}
