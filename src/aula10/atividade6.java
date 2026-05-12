package aula10;
import java.util.Scanner;
public class atividade6 {
	void main () {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			if(N % i == 0) {
				IO.println(i);
			}
			
		sc.close();
		
	}

}}
