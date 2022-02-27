import java.util.Locale;
import java.util.Scanner;

public class tempo_de_jogo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/* horaInicial = 10h00 da manha e vai até 23h59 */
		/*
		 * primeiro dia 10,11,12,13,14,15,16,17,18,19,20,21,22,23,24
		 */
		int horaInicial;

		/*
		 * segundo dia 01,02,03,04,05,06,07
		 */
		/* horaFinal = 00h00 ate 23h59 */

		int horaFinal;

		int duracao;

		System.out.println("Hora inicial:");
		horaInicial = sc.nextInt();
		System.out.println("Hora final:");
		horaFinal = sc.nextInt();

		if ( horaInicial < horaFinal ) {
			
			duracao = horaFinal - horaInicial;
			System.out.printf("O JOGOU DUROU %d HORA(S)\n", duracao);

		} else {

			duracao = (24 - horaInicial) + horaFinal;

			System.out.printf("O JOGOU DUROU %d HORA(S)\n", duracao);
		}

		sc.close();
	}

}
