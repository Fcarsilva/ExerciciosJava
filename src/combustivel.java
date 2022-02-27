import java.util.Locale;
import java.util.Scanner;

public class combustivel {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int alcool = 0, gasolina = 0, diesel = 0, fim, codigo = 0;

		


		while (codigo <= 1 || codigo <=3 || codigo >=5 ) {

			System.out.println("Informe um codigo (1, 2, 3) ou 4 para parar:");
			codigo = sc.nextInt();
			
			if(codigo==1) {
				alcool = alcool +1;	
			}else if (codigo ==2) {
				gasolina= gasolina + 1;
			}else {diesel = diesel + 1;
		}
		
			
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Gasolina:%d\n", gasolina);
		System.out.printf("Alcool:%d\n",alcool);
		System.out.printf("Diesel:%d\n:", diesel);
		

		sc.close();

	}

}
