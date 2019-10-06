package JoseMario;
import java.util.Scanner;

public class Ex1038 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int codigo, quantidade;
		double preco, total;
		codigo = entrada.nextInt();
		quantidade = entrada.nextInt();
		switch (codigo) {
		case 1:
			preco = 4.0;
			break;
		case 2:
			preco = 4.5;
			break;
		case 3:
			preco = 5.0;
			break;
		case 4:
			preco = 2.0;
			break;
		case 5:
			preco = 1.5;
		default:
			preco = 0;
			break;
		}
		total = (double) (quantidade * preco);
		System.out.printf("Total: R$ %.2f\n", total);
	}
}
