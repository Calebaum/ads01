package UriLista01;
import java.util.Scanner;

public class Ex1042 {

	public static void main(String[] args) {

		   Scanner sc = new Scanner(System.in);
	        int a, A, b, B, c, C, aux;

	        a = A = sc.nextInt();
	        b = B = sc.nextInt();
	        c = C = sc.nextInt();

	        if (b < a || c < a) {
	            if (b < c) {
	                aux = a;
	                a = b;
	                b = aux;
	            } else {
	                aux = a;
	                a = c;
	                c = aux;
	            }
	        }

	        if (b > c) {
	            aux = b;
	            b = c;
	            c = aux;
	        }
	        
	        System.out.println(a);
	        System.out.println(b);
	        System.out.println(c);
	        System.out.println();
	        System.out.println(A);
	        System.out.println(B);
	        System.out.println(C);
	}
}
