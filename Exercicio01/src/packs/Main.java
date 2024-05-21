/*Estudos de Desenvolvimento de Sistemas licenciado pela UDEMY lecionado pelo professor Nélio Alves feito por Carlos Miguel Bezerra de Oliveira,Curitiba-PR(21/05/2024)*/

package packs;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int a , b, soma;
		
		char gorgeus ;
		
		a = sc.nextInt();
		
		b = sc.nextInt();
		
		soma = a + b;
		
		System.out.println(soma);
		
		System.out.println("Deseja continuar?(Y/N)");
		
		gorgeus = sc.next().charAt(0);
		
		while (gorgeus == 'Y') {
			
			a = sc.nextInt();
			
			b = sc.nextInt();
			
			soma = a + b;
			
			System.out.println(soma);
			
			System.out.println("Deseja continuar?(Y/N)");
			
			gorgeus = sc.next().charAt(0);
			
		}		
		if (gorgeus == 'N') {
			
			System.out.println("End of the program.");
		}
		

	}

}
