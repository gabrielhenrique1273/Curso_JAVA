package aula10;
import java.util.Scanner;
public class atividade7 {
	void main() {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
	
		
		for (int i = 1; i <= N; i++) {
			int qua = i * i;
			int cubo = i * i * i;
			
			System.out.printf("%d %d %d%n",i, qua, cubo);

		}

		sc.close();

	}

}
