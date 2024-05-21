/*Estudos de Desenvolvimento de Sistemas licenciado pela UDEMY lecionado pelo professor Nélio Alves feito por Carlos Miguel Bezerra de Oliveira,Curitiba-PR(21/05/2024)*/
package packs4;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite o número do funcionario:");
			
			int numeroFunc= sc.nextInt();
			
			System.out.println("Digite o número de horas trabalhadas do funcionario:");
			
			double horasTrabalhadas=sc.nextDouble();
			
			System.out.println("Digite o número de salario por horas trabalhadas do funcionario:");
			
			double salarioPorHoras =sc.nextDouble();
			
			double FAC = horasTrabalhadas * salarioPorHoras;
			
			System.out.println("NUMBER:" + numeroFunc);
			
			System.out.printf("SALARY = U$ %.2f%n", FAC);
			
			System.out.println("Deseja continuar?(Y/N)");
			
			char roud = sc.next().charAt(0);
			
			while(roud =='Y') {
				System.out.println("Digite o número do funcionario:");
				
				 numeroFunc= sc.nextInt();
				
				System.out.println("Digite o número de horas trabalhadas do funcionario:");
				
				 horasTrabalhadas=sc.nextDouble();
				
				System.out.println("Digite o número de salario por horas trabalhadas do funcionario:");
				
				salarioPorHoras =sc.nextDouble();
				
				 FAC = horasTrabalhadas * salarioPorHoras;
				
				System.out.println("NUMBER:" + numeroFunc);
				
				System.out.printf("SALARY = U$ %.2f%n", FAC);
				
				System.out.println("Deseja continuar?(Y/N)");
				
				 roud = sc.next().charAt(0);
				
			}
			
			if (roud == 'N') {
				System.out.println("The program ends here.");
			}
	}
}
