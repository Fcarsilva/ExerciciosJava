import java.util.Locale;
import java.util.Scanner;

public class pares_consecutivos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x, soma = 0, par;
		int i = 1;

		System.out.println("Digite um numero inteiro:");
		x = sc.nextInt();

		if (x !=0) {
		if (x % 2 == 0) {

			while (i <= 5) {
				soma = soma + x;
				x = x + 2;
				i++;
			}

			System.out.printf("SOMA = %d\n", soma);

		} else {
			x = x + 1;
			while (i <= 5) {

				soma = soma + x;
				x = x + 2;
				i++;
			}
			System.out.printf("SOMA = %d\n", soma);

		}
		sc.close();
	}

}
}
