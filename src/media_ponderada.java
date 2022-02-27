import java.util.Locale;
import java.util.Scanner;

public class media_ponderada {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double n1, n2, n3, nCasos, mediaPonderada;

		System.out.println("Quantos casos voce vai digitar?");
		nCasos = sc.nextDouble();

		for (int i = 0; nCasos > i; i++){
			System.out.println("Digite tres numeros:");
			n1 = (2 * sc.nextDouble());
			n2 = (3 * sc.nextDouble());
			n3 = (5 * sc.nextDouble());

			mediaPonderada = (n1 + n2 + n3) / 10;

			

			System.out.printf("MEDIA= %.1f\n", mediaPonderada);
		}

		sc.close();
	}

}
