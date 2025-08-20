//Uma loja online deseja calcular o valor final de um produto após aplicar um desconto percentual.
//
//Entrada
//A entrada deve conter:
//
//O valor original do produto (double).
//A porcentagem de desconto (double).
//Saída
//Deverá retornar o valor final do produto, formatado com duas casas decimais. 
//Caso a porcentagem de desconto seja inválida (menor que 0 ou maior que 100), deverá retornar a mensagem Desconto invalido
//
//Retorno numérico formatado ou mensagem de erro: Desconto invalido

package exercicios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// TODO: Leia o valor original do produto:
		double valorOriginal = sc.nextDouble();

		// TODO: Leia a porcentagem de desconto:
		double percentDesconto = sc.nextDouble();

		// TODO: Verifique se o desconto está dentro de um intervalo válido:
		if (percentDesconto < 0 || percentDesconto > 100) {
			System.out.println("Desconto invalido");
		} else {
			// TODO: Calcule o valor final do produto:
			double valorFinal = valorOriginal - (valorOriginal * (percentDesconto / 100.00));

			// Formata e exibe o valor com duas casas decimais
			DecimalFormat df = new DecimalFormat("0.00");
			System.out.println(df.format(valorFinal));
		}

		sc.close();
	}
}