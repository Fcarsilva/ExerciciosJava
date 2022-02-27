import java.util.Locale;
import java.util.Scanner;

public class temperatura {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		String temperatura;
		double temperaturaFornecida, temperaturaEquivalente;
		
		
		System.out.println("Voce vai digitar a temperatura em qual escala (C/F)?");
		temperatura = sc.next();

		switch (temperatura){
		  
		  case "F":
		  System.out.println("Digite a temperatura em Fahrenheit:");
		  temperaturaFornecida = sc.nextDouble();
		  temperaturaEquivalente= (temperaturaFornecida - 32)/1.8;
		  System.out.printf("Temperatura equivalente em Celsius: %.2f\n", temperaturaEquivalente);
		  
		  break;
		  
		  case "C":
		  System.out.println("Digite a temperatura em Celsius:");
		  temperaturaFornecida = sc.nextDouble();	  
		  temperaturaEquivalente= (temperaturaFornecida * 1.8) + 32; 
		  System.out.printf("Temperatura equivalente em Fahrenheit: %.2fn", temperaturaEquivalente);
		  break;
		
		
			
			
		}
		
		
		sc.close();

	}
	
	

}
