import java.util.Locale;
import java.util.Scanner;

public class validacao_de_nota {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double primeiraNota, segundaNota, media;

		System.out.println("Digite a primeira nota");
		primeiraNota = sc.nextDouble();
		
		while (primeiraNota < 0 || primeiraNota > 10 ) {
			System.out.println("Valor invalido! Tente novamente:");
			primeiraNota = sc.nextDouble();
		}

		System.out.println("Digite a segunda nota:");
		segundaNota = sc.nextDouble();
		
		while (segundaNota < 0 || segundaNota > 10) {
			System.out.println("Valor invalido! Tente novamente:");
			segundaNota= sc.nextDouble();
			}
		
			media = (primeiraNota + segundaNota) / 2;
			System.out.printf("MEDIA =%.2f\n", media);
			
			sc.close();
		}
		
	
}



