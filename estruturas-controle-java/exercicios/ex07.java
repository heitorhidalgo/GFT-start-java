//Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar, 
//com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados, 
//incluindo os números informados e em ordem decrescente;

package exercicios;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int number1 = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		int number2 = sc.nextInt();
		System.out.print("Você quer verificar os números pares ou ímpares? Digite 'par' ou 'impar': ");
		String escolha = sc.next();
		
		if(number2<=number1){
			System.out.println("Erro: o segundo número deve ser maior que o primeiro. ");
			sc.close();
			return;
		}
		
		System.out.println("Resultado da busca para " + escolha + "em ordem decrescente");
		
		for(int i = number2; i>=number1; i--) {
			if(escolha.equalsIgnoreCase("par")) {
				if(i % 2 == 0) {
					System.out.println(i);
				}
			}else if(escolha.equalsIgnoreCase("impar")) {
				if(i % 2 != 0) {
					System.out.println(i);
				}
			}
		}
		
		if(!escolha.equalsIgnoreCase("par")&&!escolha.equalsIgnoreCase("impar")) {
			System.out.println("Erro: Por favor digite 'par' ou 'impar'.");
		}
		
		sc.close();
	}

}
