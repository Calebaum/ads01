package UriLista01;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1002 {

	public static void main(String[] args) {

//		String vendedor;
//		double salario, vendas, total;
//
//		Scanner entrada = new Scanner(System.in);
//		System.out.println("Digite o nome do vendedor");
//		vendedor = entrada.nextLine();
//		System.out.println("Digite o valor do salário");
//		salario = entrada.nextInt();
//		System.out.println("Digite o valor das vendas");
//		vendas = entrada.nextInt();
//		total = salario + (vendas * 0.15);
//		System.out.printf("TOTAL = R$ %.2f", total);
		
		
		
		
	
	//	public class Ex1009 {

	//	    public static void main(String[] args) {
		        // Variáveis

		        Scanner entrada = new Scanner(System.in);
		        double salario, vendas, total;

		        String nome = entrada.next();
		        salario = entrada.nextDouble();
		        vendas = entrada.nextDouble();
		        total = salario + (vendas * 0.15);
		        System.out.printf("TOTAL = R$ %.2f\n", total);
		

	}
}
