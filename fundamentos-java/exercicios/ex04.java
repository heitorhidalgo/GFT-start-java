//escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas

package exercicios;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o nome da primeira pessoa: ");
		String nome1 = sc.next();
		System.out.println("Qual a idade da primeira pessoa: ");
		int idade1 = sc.nextInt();
		System.out.println("Qual o nome da segunda pessoa: ");
		String nome2 = sc.next();
		System.out.println("Qual a idade da segunda pessoa: ");
		int idade2 = sc.nextInt();
		
		int diff = Math.abs(idade1 - idade2);
		//valor da diferenca sempre sera positivo
		
		System.out.printf("A diferenca de idade entre %s e %s eh de: %s anos", nome1, nome2, diff);
			
		sc.close();
	}
}