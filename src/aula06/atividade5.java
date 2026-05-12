package aula06;
import java.util.Locale;
import java.util.Scanner;
public class atividade5 {	
	void main() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtd1,qtd2;
		double preço1,preço2,total;
		
		qtd1 = sc.nextInt();
		preço1 = sc.nextDouble();
		
		qtd2 = sc.nextInt();
		preço2 = sc.nextDouble();
		
		total = preço1 * qtd1 + preço2 * qtd2;
		
		System.out.printf("Valor a pagar: R$%.2f%n",total);
		
		
		sc.close();
	}
	
	
}
