package aula07;
import java.util.Scanner;
public class atividade4 {
	void main () {
		Scanner  sc = new Scanner(System.in);
		
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int duraçao;
		
		if (horaInicial < horaFinal) {
			duraçao = horaFinal - horaInicial;
		}
		else {
			duraçao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duraçao + " HORA(S)");
		
		sc.close();
		
		
	}

}
