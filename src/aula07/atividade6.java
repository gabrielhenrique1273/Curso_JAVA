package aula07;
import java.util.Locale;
import java.util.Scanner;
public class atividade6 {
	void main() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 

		System.out.println("Digite um número : ");
		double num = sc.nextDouble();
		
		if (num <0.0 || num >100.0) {
			IO.println("FORA DE INTERVALO");
			
	    }else if (num  >= 0 && num <=25) {
			IO.println("Intervalo de [0,25]");
			
		}else if (num <=50) {
			IO.println("Intervalo de [25,50]");
			
		}else if (num <=75) {
			IO.println("Intervalo de [50,75]");
			
		}else{
			IO.println("Intervalo de [75,100]");
			
		}
		
		sc.close();
		
	}
}
