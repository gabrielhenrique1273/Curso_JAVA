package aula10;

import java.util.Scanner;

public class aula10 {

	void main() {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int soma = 0;
		
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			soma = soma + x;
			
		}
		
		IO.println(soma);
		
		sc.close();
		

	}

}