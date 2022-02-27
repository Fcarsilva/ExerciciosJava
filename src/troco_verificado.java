import java.util.Locale;
import java.util.Scanner;

public class troco_verificado {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double precoUnitario, quantidadesCompradas, valorDadoCliente, valorTroco, dinheiroInsuficiente;
		String  R = "REAIS" ;
		
		System.out.println("Preço unitário do produto:");
		precoUnitario = sc.nextDouble();
		
		System.out.println("Quantidade comprada:");
		quantidadesCompradas = sc.nextDouble();
		
		System.out.println("Dinheiro recebido:");
		valorDadoCliente = sc.nextDouble();
		
		if (valorDadoCliente < (precoUnitario*quantidadesCompradas)) {
			
		   dinheiroInsuficiente = (precoUnitario*quantidadesCompradas) - valorDadoCliente  ;
		   /*System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f %s\n" , dinheiroInsuficiente , R);*/	
		   System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS\n" , dinheiroInsuficiente); 
			
	} else {
		 
		valorTroco = valorDadoCliente -(quantidadesCompradas*precoUnitario);
		
		System.out.printf("Troco = %.2f\n", valorTroco);
		
		sc.close();
		

		
	}

}
}
