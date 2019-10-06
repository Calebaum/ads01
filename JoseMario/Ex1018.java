package JoseMario;
import java.util.Scanner;

public class Ex1018 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int valor, aux;
		int n100, n50, n20, n10, n5, n2, n1;
		valor = entrada.nextInt();
		n100 = valor / 100;
		aux = valor % 100;
		n50 = aux / 50;
		aux = aux % 50;
		n20 = aux / 20;
		aux = aux % 20;
		n10 = aux / 10;
		aux = aux % 10;
		n5 = aux / 5;
		aux = aux % 5;
		n2 = aux / 2;
		aux = aux % 2;
		n1 = aux / 1;
		System.out.printf("%d\n",valor);
		System.out.printf("%d nota(s) de R$ 100,00\n",n100);
		System.out.printf("%d nota(s) de R$ 50,00\n",n50);
		System.out.printf("%d nota(s) de R$ 20,00\n",n20);
		System.out.printf("%d nota(s) de R$ 10,00\n",n10);
		System.out.printf("%d nota(s) de R$ 5,00\n",n5);
		System.out.printf("%d nota(s) de R$ 2,00\n",n2);
		System.out.printf("%d nota(s) de R$ 1,00\n",n1);
	}
}
