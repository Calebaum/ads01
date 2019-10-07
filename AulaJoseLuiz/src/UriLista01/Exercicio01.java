package UriLista01;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float A, B, C, DELTA;
		System.out.println("Informe o valor de A: ");
		A = entrada.nextFloat();
		System.out.println("Informa o valor de B: ");
		B = entrada.nextFloat();
		System.out.println("Informe o valor de C: ");
		C = entrada.nextFloat();
		DELTA = B * B - 4 * A * C;
		System.err.printf("O coeficiente são: %.2f, %.2f e %.2f\n", A, B, C);
		System.out.println("Valor de Delta é " + DELTA + " teste espaço");
		System.out.printf("Valor de Delta é %.2f\n", DELTA);
	}
}
