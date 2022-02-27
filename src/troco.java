import java.util.Locale;
import java.util.Scanner;

public class troco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double precoUnit, dinheiroRecebido, troco;
		int quantidade;
		
		System.out.println("Preço unitário do produto:");
		precoUnit = sc.nextDouble();
		System.out.println("Quantidade comprada:");
		quantidade = sc.nextInt();
		System.out.println("Dinheiro recebido:");
		dinheiroRecebido = sc.nextDouble();
		
		
		troco = dinheiroRecebido -(precoUnit * quantidade)   ;
		
		System.out.printf("TROCO =%.2f\n", troco);

		sc.close();
		
		
		

	}

}
