package Application;


import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class ProgramaRetangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle rectangle = new Rectangle();

		System.out.println("Entre com a largura e altura do ret�ngulo:");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		
		
		System.out.printf("AREA = %.2f\n", rectangle.area());
		System.out.printf("PERIMETRO = %.2f\n", rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f\n",rectangle.diagonal());
		
		sc.close();
		
		
		

	}

}
