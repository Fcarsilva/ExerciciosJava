import java.util.Locale;
import java.util.Scanner;

public class divisao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double n, divisao, numerador, denominador;

		System.out.println("Quantos casos voce vai digitar?");
		n = sc.nextDouble();

		for (int i = 0; n > i; i++) {

			System.out.println("Entre com o numerador:");
			numerador = sc.nextDouble();
			System.out.println("Entre com o denominador:");
			denominador = sc.nextDouble();

			if (numerador > 0) {

				divisao = numerador / denominador;

				System.out.printf("DIVISAO = %.2f\n", divisao);
			}else {
				
				System.out.println("DIVISAO IMPOSSIVEL");
			}

		}

		sc.close();
	}

}
