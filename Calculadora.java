# Calculadora

//teste//
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//Variaveis//
		double num1, num2;
		String operacao1;
		String operacao2;
		
		//Calculadora//
		System.out.println("Digite o operador que vocé deseja utilizar no calculo:");
		System.out.println("Sendo os operadores: Soma(+), Subtração(-), Multiplicação(*), Divisão (/) e Outros (#)");
		operacao1 = ler.nextLine();
		
		System.out.println("Operadores especiais: Potencia (^) e Porcentagem (%)");
		operacao2 = ler.nextLine();
		
		System.out.println("Digite o primeiro valor:");
		num1 = ler.nextDouble();
		System.out.println("Digite o segundo valor:");
		num2 = ler.nextDouble();
		
		//Estrutura de controle//
		switch (operacao1) {
			case "+": System.out.printf("A soma deu: %.2f",num1+num2); break;
			case "-": System.out.printf("A subtração deu: %.2f",num1-num2); break;
			case "*": System.out.printf("A multiplicação deu: %.2f",num1*num2); break;
			case "/": System.out.printf("A divisão deu: %.2f",num1/num2); break;
			default: System.out.println("Operação invalida"); break;
		}
		
		//Estrutura de controle//
		switch (operacao2) {
			case "^": System.out.printf("A potenciação é: %.2f",Math.pow(num1, num2)); break;
			case "%": System.out.printf("A porcentagem é: %.2f",num1/100); break;
			default: System.out.println("Operação invalida"); break;
		}
		ler.close();
	}
}
