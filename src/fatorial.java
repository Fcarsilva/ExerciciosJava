import java.util.Locale;
import java.util.Scanner;

public class fatorial {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int n, i, fatorial = 0;

		System.out.println("Digite o valor de N:");


		n = sc.nextInt();

		if (n <= 15)

			fatorial = 1;
			for (i = n; i > 0; i--) {

				fatorial = fatorial * i;

			}
		System.out.printf("FATORIAL =%d\n", fatorial);
		sc.close();
	}

}