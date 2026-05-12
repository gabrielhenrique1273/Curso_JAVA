package aula02;
import java.util.Locale;
public class aula2 {

void main () {
String nome = "Victor";
int idade = 25;
	double salario = 4.500;
	int y = 32;
	double x = 10.35784;
	
	IO.println(y);
	
	System.out.printf("%.2f%n",x);
	
	Locale.setDefault(Locale.US);
	
	System.out.printf("%.4f%n",x);
	
	IO.println("Resultado " + x + " Metros");
	
	System.out.printf("RESULTADO = %.2f METROS%n",x);
	
	System.out.printf("%s tem %d anos e ganha R$%.3f reais%n",nome,idade,salario);
	
}}
	// %f = número flutuante
	// %d = inteiro 
	// %s = texto
	// %n = quebra de linha
	// Locale.setDefault(Locale.US); =  trocar virgula por ponto
	//"%.4f%n" = casa decimais 
	


