package aula07;
import java.util.Scanner;
public class atividade3 {
	void main () {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu primeiro número: ");
		int A = sc.nextInt();
		System.out.println("Digite o seu segundo número: ");
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0 ) {
			System.out.println("Os números são multiplos");
			
		}else {
			System.out.println("Os números NÃO são multiplos");
		}
		
		sc.close();
		
	}
}
