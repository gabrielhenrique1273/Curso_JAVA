package aula07;
import java.util.Scanner;
public class atividade1 {
	void main() {

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("digite um número");
			int num = sc.nextInt();

			if (num > 0) {
				System.out.println("Não é Negativo ");

			} else if (num < 0) {
				System.out.println("Negativo ");

			} else
				System.out.println("NEUTRO");
		}

	}
}
