//escreva um código que receba o tamanho do lado de um quadrado, calcule  sua área e exiba na tela
//fórmula área quadrado: lado * lado

package exercicios;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o valor do primeiro lado do quadrado: ");
		int lado1 = sc.nextInt();
		System.out.println("digite o valor do segundo lado do quadrado: ");
		int lado2 = sc.nextInt();
		
		int area = lado1 * lado2;
		
		System.out.printf("Area do quadrado: %s \n", area);
		
		sc.close();
	}

}