package aula07;
import java.util.Locale;
import java.util.Scanner;
public class atividade5 {
	void main () {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o codigo do produto: ");
		int cod = sc.nextInt();
		
		System.out.println("Digite a quantidade do produto: ");
		int qtd = sc.nextInt();
		
		double total;
		
		if (cod == 1) {
			total = qtd * 4.0;
			
		}else if (cod == 2){
			total = qtd * 4.5;
			
		}else if (cod == 3) {
			total = qtd * 5.0;
			
		}else if (cod == 4) {
			total = qtd * 2.0;
			
		}else {
			total = qtd * 1.5;
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
	}

}
