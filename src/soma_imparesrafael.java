import java.util.Locale;
import java.util.Scanner;

public class soma_imparesrafael {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x, y, soma, troca = 0;

		System.out.println("Digite dois numeros:");
		x = sc.nextInt();
		y = sc.nextInt();

		if (x > y) {
			troca = x;
			x = y;
			y = troca;
		}
		if (x % 2 == 0) {
			troca--;

		}
		soma = 0;
		for (int i = troca + 2; i < y; i += 2) {
			soma = soma + i;
		}
		System.out.printf("SOMA DOS IMPARES = %d\n", soma);
	}

}
