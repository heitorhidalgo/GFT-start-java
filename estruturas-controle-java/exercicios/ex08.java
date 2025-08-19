//Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, 
//a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão, 
//números menores que o primeiro número devem ser ignorados

package exercicios;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número: ");
		int number1 = sc.nextInt();
		
		if(number1 == 0) {
			System.out.println("O número inicial não pode ser zero.");
			sc.close();
			return;
		}
		
		System.out.println("Digite números maiores ou iguais a " + number1);
		System.out.println("O programa se encerra quando um número não múltiplo de " + number1 + " for digitado.");
		
		while(true) {
			System.out.print("Informe o próximo número: ");
			int number2 = sc.nextInt();
			
			if(number2<number1) {
				System.out.println("O número " + number2 + " será ignorado por ser menor do que o número inicial " + number1);
				continue;
			}
			if(number2 % number1 != 0) {
				System.out.println("O número " + number2 + " não é múltiplo de " + number1);
				break;
			}
			System.out.println("O número " + number2 + " é múltiplo de " + number1 + ". Continue com o processo...");
		}
		
		System.out.println("Programa encerrado.");
		
		sc.close();
	}
}
