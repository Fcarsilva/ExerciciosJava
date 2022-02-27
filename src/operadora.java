import java.util.Locale;
import java.util.Scanner;

public class operadora {
	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc= new Scanner(System.in);
		
		
		double minutos, valorPago, resto, planoBasico = 50;
		
		
		System.out.print("Digite a quantidade de minutos:");
		minutos = sc.nextDouble();
		
		if (minutos > 100) {
			
		planoBasico = 50;
		resto = minutos-100;
	    valorPago = planoBasico +(resto *2);
	    
	    System.out.printf("Valor a pagar: R$%.2f", valorPago);
		
	 } else {
		 System.out.printf("Valor a pagar: R$%.2f", planoBasico);
	 }
		
		
		
		}

}
