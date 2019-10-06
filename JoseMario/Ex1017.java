package JoseMario;
import java.util.Scanner;

public class Ex1017 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int h,km;
	float lt,aut=12;
	h=sc.nextInt();
	km=sc.nextInt();
	lt=((h*km)/aut);
	System.out.printf("%.3f\n", lt);	
}
}
