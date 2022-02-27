import java.util.Locale;
import java.util.Scanner;

public class tabuada {
 public static void main(String[] args) {
	
	 Locale.setDefault(Locale.US);
	 Scanner sc = new Scanner(System.in);
	 
	 
	 
	 int n, r, i = 0;
	  
	 System.out.println("Deseja a tabuada para qual valor?");
	 n = sc.nextInt();
	 
	 
	 for (i= 0; i<=10; i++ ) {
		 
		 r = n * i;
	 
		 System.out.printf("%d x %d = %d\n", n, i, r);
		 
}
	 
	 sc.close();
}

}
