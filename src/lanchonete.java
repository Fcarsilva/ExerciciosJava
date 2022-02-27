import java.util.Locale;
import java.util.Scanner;

public class lanchonete {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoDoProduto; 
		double quantidadeComprada,valoraPagar;
		
		System.out.println("Codigo do produto comprado:");
		codigoDoProduto = sc.nextInt();
		
		System.out.println("Quantidade comprada:");
		quantidadeComprada=sc.nextDouble();
		
		
		
		switch (codigoDoProduto) {
		
		case 1:
			valoraPagar = quantidadeComprada * 5.00;
			
			System.out.printf("Valor a pagar:R$ %.2f\n",valoraPagar );
		
		
		break;
		
		case 2:
			valoraPagar = quantidadeComprada * 3.50;
			
			System.out.printf("Valor a pagar:R$ %.2f\n",valoraPagar );
			
		break;
		
		case 3:
			valoraPagar = quantidadeComprada * 4.80;
			
			System.out.printf("Valor a pagar:R$ %.2f\n",valoraPagar );
			
		break;
		
		case 4:
			valoraPagar = quantidadeComprada * 8.90;
			
			System.out.printf("Valor a pagar:R$ %.2f\n",valoraPagar );
			
		break;
		
		case 5:
			valoraPagar = quantidadeComprada * 7.32;
			
			System.out.printf("Valor a pagar:R$ %.2f\n",valoraPagar );
			
		break;
		
	}
		sc.close();
}
	
}
