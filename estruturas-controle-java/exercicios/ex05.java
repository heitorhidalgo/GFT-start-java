//Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;

package exercicios;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int number = sc.nextInt();
		System.out.printf("A tabuada do %s sera: \n", number);
		
		for(int i=1; i<=10;i++) {
			int result = number*i;
			System.out.println(number + "x" + i + "=" + result);
		}
		
		sc.close();
	}

}
