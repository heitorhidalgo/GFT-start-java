//Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) 
//e seja exibida a mensagem de acordo com o resultado:
//
//Se for menor ou igual a 18,5 "Abaixo do peso";
//se for entre 18,6 e 24,9 "Peso ideal";
//Se for entre 25,0 e 29,9 "Levemente acima do peso";
//Se for entre 30,0 e 34,9 "Obesidade Grau I";
//Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
//Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";

package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite sua altura em metros: ");
		double alt = sc.nextDouble();
		System.out.print("Digite seu peso em kg: ");
		double peso = sc.nextDouble();
		
		double imc = peso / (alt*alt);
		System.out.printf("Seu imc é: %.2f\n", imc);
		
		String nivel = "";
		
		if(imc<=18.5) {
			nivel = "Abaixo do peso";
		} else if(imc<=24.9) {
			nivel = "Peso ideal";
		} else if(imc<=29.9) {
			nivel = "Levemente acima do peso";
		} else if(imc<=34.9) {
			nivel = "Obesidade nivel 1";
		} else if(imc<=39.9) {
			nivel = "Obesidade nivel 2(severa)";
		} else {
			nivel = "Obesidade nivel 3(mórbida)";
		}
		
		System.out.printf("Seu nivel é: %s", nivel);
		
		sc.close();
	}

}
