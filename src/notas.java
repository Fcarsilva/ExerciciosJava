import java.util.Locale;
import java.util.Scanner;

public class notas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double primeiraNota, segundaNota, notaFinal;

		System.out.print("Digite a primeira nota:");
		primeiraNota = sc.nextDouble();

		System.out.print("Digite a segunda nota:");
		segundaNota = sc.nextDouble();

		notaFinal = primeiraNota + segundaNota;

		if (notaFinal < 60) {

			System.out.printf("Nota final = %.1f\n", notaFinal);
			System.out.println("Reprovado");
			
		} else {
			System.out.printf("Nota final =%.1f\n", notaFinal);

		}

		sc.close();

	}

}
