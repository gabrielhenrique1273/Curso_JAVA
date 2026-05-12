package aula06;
import java.util.Locale;
import java.util.Scanner;
public class atividade2 {
	
	void main() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double R,PI,A;
		
		R = sc.nextDouble();
		PI = sc.nextDouble();
		
		A = PI * R * R;
		
		System.out.printf("O tamanho da area é = %.4f%n", A);
		
		sc.close();

	}
}
