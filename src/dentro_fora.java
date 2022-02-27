import java.util.Locale;
import java.util.Scanner;

public class dentro_fora {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, dentro = 0, fora = 0;
		
		System.out.println("Quantos numeros voce vai digitar?");
		n = sc.nextInt();
		
		for (int i = n; i <=n; i++) {
			
			System.out.println("Digite um numero:");
			n=sc.nextInt();
			
		if (n<10 || n <20) {
			
			dentro ++;
			
		}else {
			
		  fora ++;
		
		

	}}
		System.out.printf("DENTRO %d\n", dentro);
		System.out.printf("FORA %d\n", fora);
 sc.close();
}
}
