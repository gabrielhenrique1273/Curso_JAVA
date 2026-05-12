package aula06;
import java.util.Locale;
import java.util.Scanner;
public class atividade4 {
	void main() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num,horas;
		double salario, recebe_hora;
		
		num = sc.nextInt();
		horas = sc.nextInt();
		recebe_hora = sc.nextDouble();
		
		salario = recebe_hora * horas;

		System.out.println("NUMBER = "+num);
		System.out.printf("SALARY = U$%.2f%n",salario);
		
		sc.close();
	}
	
}
