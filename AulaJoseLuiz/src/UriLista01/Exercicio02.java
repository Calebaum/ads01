package UriLista01;
import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {

		int A, B, AUX;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o valor de A: ");
		A = entrada.nextInt();
		System.out.println("Informe o valor de B: ");
		B = entrada.nextInt();

		// Utilizando 2 vari�veis A e B
		// A = A + B;
		// B = A - B;
		// A = A - B;

		// Utilizando 3 vari�veis A,B,AUX
		AUX = A;
		A = B;
		B = AUX;

		System.err.println("Valor de B �: " + B);
		System.out.println("Valor de A �: " + A);
	}
}
