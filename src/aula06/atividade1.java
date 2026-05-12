package aula06;
import java.util.Scanner;
public class atividade1 {
	void main() {

		Scanner sc = new Scanner(System.in);
		
		int num1,num2,soma;
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		soma = num1 + num2;
		
		IO.println("SOMA = " + soma);
		
		
		sc.close();

	}
}

