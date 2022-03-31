# Calculadora

//teste//
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//Variaveis//
		double num1, num2;
		String operacao1;
		
		//Calculadora//
		System.out.println("Digite o operador que vocé deseja utilizar no calculo:");
		System.out.println("Sendo os operadores: Soma(+), Subtração(-), Multiplicação(*) e Divisão (/). Outros: Potencia (^) mais em breve)");
		operacao1 = ler.nextLine();
		
		System.out.println("Digite o primeiro valor:");
		num1 = ler.nextDouble();
		System.out.println("Digite o segundo valor:");
		num2 = ler.nextDouble();
		
		//Estrutura de controle//
		switch (operacao1) {
			case "+": System.out.printf("%.1f + %.1f: %.2f",num1,num2,num1+num2); break;
			case "-": System.out.printf("%.1f - %.1f: %.2f",num1,num2,num1-num2); break;
			case "*": System.out.printf("%.1f * %.1f: %.2f",num1,num2,num1*num2); break;
			case "/": System.out.printf("%.1f / %.1f: %.2f",num1,num2,num1/num2); break;
			case "^": System.out.printf("%.1f ^ %.1f: %.2f",num1,num2,Math.pow(num1, num2)); break;
			default: System.out.println("Operação invalida"); break;
		}
		ler.close();
	}
}
