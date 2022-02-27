package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Funcionarios {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Employee employee = new Employee();
		
		System.out.println("Nome:");
		employee.nome = sc.nextLine();
		
		System.out.println("Salário bruto:");
		employee.grossSalary = sc.nextDouble();
		
		System.out.println("Imposto");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Funcionário:" + employee);
		System.out.println();
		System.out.println("Qual a porcentagem para aumentar o salário?");
		double percentagem = sc.nextDouble();
		employee.increaseSalary(percentagem);;
		
		System.out.printf("Dados atualizados:"+ employee);
		sc.close();

		

	}

}
