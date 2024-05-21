/*Estudos de Desenvolvimento de Sistemas licenciado pela UDEMY lecionado pelo professor Nélio Alves feito por Carlos Miguel Bezerra de Oliveira,Curitiba-PR(21/05/2024)*/
package packs2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o raio de um circulo: ");
		
		double raio = sc.nextDouble();
		
		double pi = 3.14159;
		
		double formula = pi * Math.pow(raio,2.0);
		
		System.out.println("A ="+ formula );
		
		System.out.println("Deseja continuar?");
		
		char pledge = sc.next().charAt(0);
		
		
		while (pledge == 'Y'){
			
			System.out.println("Informe o raio de um circulo: ");
			
			 raio = sc.nextDouble();
			
			 System.out.println("A ="+ formula );
			
			System.out.println("Deseja continuar?");
			
			 pledge = sc.next().charAt(0);

			
	}

		if (pledge =='N') {
			
			System.out.println("End of the program.");
		}
  }
}