package aula10;
import java.util.Scanner;
public class atividade5 {
	void main() {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int fatorial = 1;

		for (int i = 1; i <= N; i++) {
			fatorial = fatorial * i;
		}
		
			if (N==0){
				IO.println("1");
				
			}else 
				IO.println(fatorial);

		

		sc.close();

	}

}
