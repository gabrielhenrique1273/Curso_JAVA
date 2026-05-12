package aula09;
import java.util.Scanner;
public class aula9 {
	void main() {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int soma = 0;
		while (x != 0) {
			soma = soma + x;
			//nesse caso pode usar o += tirando uma das variaveis soma.
			x = sc.nextInt();
		}
		
		IO.println("os números somados foi: "+ soma);

		sc.close();
	}
}
