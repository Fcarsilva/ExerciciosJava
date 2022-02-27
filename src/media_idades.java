import java.util.Locale;
import java.util.Scanner;

public class media_idades {

	public static void main(String[] args) {  
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double idade = 0;
		double media = 0;
		double soma = 0;
		double npessoas = 0;

		System.out.println("Digite as idades:");
		idade = sc.nextDouble();

		if (idade < 0) {
			System.out.printf("IMPOSSIVEL CALCULAR");

		} else {

			while (idade >= 0) {

				soma = soma + idade;
				npessoas++;
				media = soma / npessoas;
				idade = sc.nextDouble();

			}
			System.out.printf("MEDIA =%.2f\n", media);
		}

		sc.close();

	}

}
