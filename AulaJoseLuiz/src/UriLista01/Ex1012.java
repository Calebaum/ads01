package UriLista01;
import java.util.Scanner;

public class Ex1012 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double A, B, C, areaTriangulo, circuloRaio, areaTrapezio, areaQuadrado, areaRetangulo;
		double pi=3.14159;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		areaTriangulo = (C * A) / 2;
		circuloRaio =  (pi * (C * C));
		areaTrapezio = (A + B) * C / 2;
		areaQuadrado = (B * B);
		areaRetangulo = (A * B);
		System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
		System.out.printf("CIRCULO: %.3f\n", circuloRaio);
		System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f\n", areaRetangulo);

	}
}
