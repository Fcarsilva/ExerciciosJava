import java.util.Locale;
import java.util.Scanner;

public class medidas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new  Scanner(System.in);

		double a,b,c, areaquadrado, areatriangulo, areatrapezio;
		
		System.out.print("Digite a medida A:");
		a = sc.nextDouble();
		
		System.out.print("Digite a medida B:");
		b = sc.nextDouble();
		
		System.out.print("Digite a medida C:");
		c = sc.nextDouble();
		
		areaquadrado = a*a;
		areatriangulo = (a*b)/2;
		areatrapezio = (a+b)*c/2;
		
		
		System.out.printf("AREA DO QUADRADO = %.4f\n", areaquadrado);
		System.out.printf("AREA DO TRIANGULO= %.4f\n", areatriangulo);
		System.out.printf("AREA DO TRAPEZIO= %.4f\n",areatrapezio);
		
		
		
		sc.close();
		
	}

}
