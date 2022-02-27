import java.util.Locale;
import java.util.Scanner;

public class menor_de_tres {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int primeiroValor, segundoValor, terceirovalor, menor;

		System.out.print("Primeiro valor:");
		primeiroValor = sc.nextInt();

		System.out.print("Segundo valor:");
		segundoValor = sc.nextInt();

		System.out.print("Terceiro valor:");
		terceirovalor = sc.nextInt();

		if (primeiroValor < segundoValor && primeiroValor < terceirovalor) {
			menor = primeiroValor;
			System.out.printf("MENOR = %d\n", menor);

	   }else if (segundoValor < primeiroValor && segundoValor < terceirovalor) {
			 menor = segundoValor;
			 System.out.printf("Menor = %d\n", menor);

	   } else {
			 menor = terceirovalor;
			 System.out.printf("Menor = %d\n", menor);

	  } 
		sc.close();
		}
		

	}

