import java.util.Locale;
import java.util.Scanner;

public class multiplos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numeroA, numeroB;

		System.out.println("Digite dois numeros inteiros:");
		numeroA = sc.nextInt();
		numeroB = sc.nextInt();

		if (numeroA % numeroB == 0 || numeroB % numeroA == 0) {

			System.out.println("Sao multiplos");

		} else
			System.out.println(" Não São multiplos");

		sc.close();
	}

}
