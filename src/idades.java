import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class idades {

	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade1, idade2;  
		double idadeMedia;
		String nome1, nome2;
		System.out.println("Digite os dados da primeira pessoa:");
		System.out.print("Nome:");
		nome1 = sc.next();
		System.out.print("Idade:");
		idade1 = sc.nextInt();
		
		
		System.out.println("Digite os dados da primeira pessoa:");
		System.out.print("Nome:");
		nome2 = sc.next();
		System.out.print("Idade:");
		idade2 = sc.nextInt();
		
		idadeMedia =  (idade1 + idade2)/2.0;
		
		System.out.printf(" A idade de %s e %s eh de %.1f anos",nome1, nome2, idadeMedia);
		
		sc.close();
	}

		
		
	}

