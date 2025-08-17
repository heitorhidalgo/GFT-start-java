//escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela
//fórmula área do retângulo: base*altura

package exercicios;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("digite a base do retangulo: ");
		int base = sc.nextInt();
		System.out.println("digite a altura do retangulo: ");
		int altura = sc.nextInt();
		
		int area = base*altura;
		
		System.out.printf("Area do retangulo: %s", area);
		
		sc.close();
	}

}
