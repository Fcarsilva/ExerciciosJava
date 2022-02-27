import java.util.Locale;
import java.util.Scanner;

public class pagamento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double valorHora, horasTrabalhadas, valorPagamento;
		
		
		System.out.print("Nome");
		nome = sc.nextLine();
		
		System.out.print("Valor por hora:");
		valorHora = sc.nextDouble();
		
		System.out.print("Horas trabalhadas:");
		horasTrabalhadas = sc.nextDouble();
		
		
		valorPagamento = ( valorHora * horasTrabalhadas);
		
		System.out.printf("O pagamento para %s deve ser %.2f\n",nome, valorPagamento);
		
		sc.close();
}
}