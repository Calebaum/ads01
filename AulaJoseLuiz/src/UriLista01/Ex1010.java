package UriLista01;
import java.util.Scanner;

public class Ex1010 {
	public static void main(String[] args) {
		
//			int codigo1, codigo2, Qtpecas1, Qtpecas2;
//	        double Vunitario1, Vunitario2;
//	        double T1, T2, VTotal;
//	                
//	        Scanner input = new Scanner(System.in);
//	        
//	        codigo1 = input.nextInt(); 
//	        Qtpecas1 = input.nextInt();
//	        Vunitario1 = input.nextDouble();
//	        T1 = Qtpecas1 * Vunitario1;
//	        
//	        codigo2 = input.nextInt(); 
//	        Qtpecas2 = input.nextInt();
//	        Vunitario2 = input.nextDouble();
//	        T2 = Qtpecas2 * Vunitario2;
//	        
//	        VTotal = T1 + T2;
//	        System.out.printf("VALOR A PAGAR: R$ %.2f\n",VTotal); //%.2f\n",T)
	
		int cod1,cod2, qnt1, qnt2;
		double valor1, valor2, total1, total2,soma;

		Scanner entrada = new Scanner(System.in);
		
		cod1 = entrada.nextInt();
		qnt1 = entrada.nextInt();
		valor1 = entrada.nextDouble();
		total1 = qnt1 * valor1;
		
		cod2 = entrada.nextInt();
		qnt2 = entrada.nextInt();
		valor2 = entrada.nextDouble();
		
		total2 = qnt2 * valor2;
		soma = total1+total2;
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", soma);
				
	}
}