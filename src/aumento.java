import java.util.Locale;
import java.util.Scanner;

public class aumento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salarioAtual, aumento, novoSalario, porcentagem;

		System.out.println("Digite o salario da pessoa:");
		salarioAtual = sc.nextDouble();

		if (salarioAtual <= 1000.00) {
			aumento = salarioAtual * 0.20;
			novoSalario= aumento + salarioAtual;
			System.out.printf("Novo salario = R$%.2.f\n", novoSalario);
			System.out.printf("Aumento = R$%.2.f\n", aumento);
			System.out.printf("Porcentagem = 20 %");

		} else if (salarioAtual > 1000.00 && salarioAtual < 3000.00) {
			aumento = salarioAtual * 0.15;
			novoSalario= aumento + salarioAtual;
			System.out.printf("Novo salario = R$%.2f\n", novoSalario);
			System.out.printf("Aumento = R$%.2f\n", aumento);
			System.out.printf("Porcentagem = 15 %%\n");

		} else if (salarioAtual > 3000.00 && salarioAtual <= 8000.00) {
			aumento = salarioAtual * 0.10;
			novoSalario= aumento + salarioAtual;
			System.out.printf("Novo salario = R$%.2f\n", novoSalario);
			System.out.printf("Aumento = R$%.2f\n", aumento);
			System.out.printf("Porcentagem = 10 %%\n");
		} else {
			aumento = salarioAtual * 0.5;
			novoSalario= aumento + salarioAtual;
		    System.out.printf("Novo salario = R$%.2f\n", novoSalario);
		    System.out.printf("Aumento = R$%.2f\n", aumento);
		    System.out.printf("Porcentagem = 5 %%\n");
	}
sc.close();
}

}