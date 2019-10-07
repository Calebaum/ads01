package UriLista01;
import java.util.Scanner;

public class Ex1044 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a, b;
		a = entrada.nextInt();
		b = entrada.nextInt();
		if (a % b == 0 || b % a == 0) {
			System.out.print("Sao Multiplos\n");
		} else {
			System.out.print("Nao sao Multiplos\n");
		}
	}
}
