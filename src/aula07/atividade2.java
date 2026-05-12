package aula07;
import java.util.Scanner;
public class atividade2 {
	void main () {
		
		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("digite um número");
			int num = sc.nextInt();
			
			if (num %2 == 0) {
				System.out.println("Número par");
				
				
			}else
				System.out.println("Número impar");
		
	}

}}
