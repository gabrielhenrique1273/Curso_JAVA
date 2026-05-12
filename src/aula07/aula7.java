package aula07;
import java.util.Scanner;
public class aula7 {
	void main() {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Que horas são ? ");
			int hora = sc.nextInt();
			
			if (hora < 12) {
				System.out.println("Bom dia");
				
			}else if (hora < 18) {
				System.out.println("Boa tarde");
			
			}else 
				System.out.println("boa noite");
		}

	}

}
