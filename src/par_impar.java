import java.util.Locale;
import java.util.Scanner;

public class par_impar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, valor;

		System.out.println("Quantos numeros voce vai digitar?");
		n = sc.nextInt();

		for (int i = 0; n > i; i++) {

			System.out.println("Digite um numero:");
			valor = sc.nextInt();

			if (valor != 0) {

				if (valor % 2 == 0) {

					if (valor > 0) {

						System.out.print("PAR POSITIVO");

					} else {

						System.out.println("PAR NEGATIVO ");
					}

				} else {

					if (valor > 0) {

						System.out.println("IMPAR POSITIVO");

					} else {

						System.out.println("IMPAR NEGATIVO");
					}

				}
			} else {
				System.out.println("NULO");
			}
			
			
		}
		
		sc.close();	
		
	}
}