package aula09;
import java.util.Scanner;
public class atividade1 {
	void main () {
		
		Scanner sc = new Scanner(System.in);
		
		IO.println("Digite a sua senha :");
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			IO.println("Senha invalida");	
			
			senha = sc.nextInt();
		}
		
		IO.println("Acesso Permitido");

		sc.close();
	}
}

		
		
		
		
		
		
		
	
