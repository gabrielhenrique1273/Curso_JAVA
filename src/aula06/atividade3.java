package aula06;
import java.util.Locale;
import java.util.Scanner;
public class atividade3 {
	void main() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D,total;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		total = A * B - C * D;
	
		System.out.println("A diferença é: "+ total);
		
		sc.close();
	}

}
