//Uma empresa de logística precisa calcular o valor total de um frete com base no peso da carga e no valor do frete por quilo.
//
//Entrada
//A entrada deve conter:
//
//O peso em quilos (double).
//O valor do frete por quilo (double).
//Saída
//O programa deverá retornar o valor total do frete, formatado com duas casas decimais.
//
//Retorno numérico formatado.

package exercicios;

import java.util.Scanner;

public class ex09 {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: Leia o peso em quilos:
        double peso = sc.nextDouble();
        

        // TODO: Leia o valor do frete por quilo:
        double valorFrete = sc.nextDouble();
        

        // TODO: Calcule o valor total do frete:
        double valorTotal = peso*valorFrete;
        

        // TODO: Exiba o valor formatado com duas casas decimais:
        System.out.printf("%.2f", valorTotal);
        

        sc.close();
    }
}