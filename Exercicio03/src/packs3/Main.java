/*Estudos de Desenvolvimento de Sistemas licenciado pela UDEMY lecionado pelo professor Nélio Alves feito por Carlos Miguel Bezerra de Oliveira,Curitiba-PR(21/05/2024)*/
package packs3;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int A,B,C,D,DIFERENCA;
		
		A = sc.nextInt();
		
		B = sc.nextInt();
		
		C = sc.nextInt();
		
		D = sc.nextInt();
		
		DIFERENCA = (A*B)-(C*D);
		
		System.out.println("DIFERENCA: "+ DIFERENCA);
		
		System.out.println("Deseja continuar?(Y/N)");
		
		char rex = sc.next().charAt(0);
		
		while(rex == 'Y') {
				
			   A = sc.nextInt();
		
				B = sc.nextInt();
		
				C = sc.nextInt();
		
				D = sc.nextInt();
			
				DIFERENCA = (A*B)-(C*D);
				
				System.out.println("DIFERENCA: "+ DIFERENCA);
				
				System.out.println("Deseja continuar?(Y/N)");
				
				 rex = sc.next().charAt(0);
		
		}
		
		if(rex == 'N') {
			System.out.println("End of the program.");
		}

	}
}
