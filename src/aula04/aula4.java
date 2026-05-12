package aula04;
import java.util.Locale;
import java.util.Scanner;
public class aula4 {
void main () {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);
	
	String x;
	x = sc.next();
	System.out.println("Você digitou: "+ x);
	
	int y;
	y = sc.nextInt();
	IO.println("Sua idade é: "+ y);
	
	double z;
	z = sc.nextDouble();
	System.out.printf("Sua altura é:%.2f%n ", z);
	
	char ç;
	ç = sc.next().charAt(0);
	IO.println("A primeira letra é: "+ ç);
	
	
	sc.close();
}
}
