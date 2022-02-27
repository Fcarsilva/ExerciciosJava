import java.util.Locale;
import java.util.Scanner;

public class dardo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double da, db, dc, maiorDistancia;

		System.out.println("Digite as tres distancias:");
		da = sc.nextDouble();
		db = sc.nextDouble();
		dc = sc.nextDouble();

		if (da > db && da > dc) {
			maiorDistancia = da ;
			System.out.printf("MAIOR DISTANCIA =%.2f\n", maiorDistancia);

	   }else if (db > dc && db > da) {
		   maiorDistancia = db ;
			System.out.printf("MAIOR DISTANCIA =%.2f\n", maiorDistancia);
	   }else {
		   maiorDistancia = dc ;
			System.out.printf("MAIOR DISTANCIA =%.2f\n", maiorDistancia);
		
		
	}
		sc.close();
	}

}
