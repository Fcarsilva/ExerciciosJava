import java.util.Locale;
import java.util.Scanner;

public class glicose {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double medidaGlicose, normal, elevado, diabetes;
		
		
		System.out.println("Digite a medida da glicose:");
		medidaGlicose = sc.nextDouble();
		
		if (medidaGlicose <= 100) {
			System.out.println("Classificacao: Normal");
		
		}else if(medidaGlicose > 100 && medidaGlicose <= 140) {
			
			System.out.println("Classificacao: Elevado");
		}else 
			System.out.println("Classificacao: Diabetes");
	}

}
