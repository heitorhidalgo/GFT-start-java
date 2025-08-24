//Escreva um código onde temos uma conta bancaria que possa realizar as seguintes operações:
//Consultar saldo
//consultar cheque especial
//Depositar dinheiro;
//Sacar dinheiro;
//Pagar um boleto.
//Verificar se a conta está usando cheque especial.
//Siga as seguintes regras para implementar
//
//A conta bancária deve ter um limite de cheque especial somado ao saldo da conta;
//O o valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação;
//Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque especial deve ser de R$50,00
//Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor depositado;
//Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor usado do cheque especial.

package application;

import java.util.Scanner;

import entities.ContaBancaria;

public class Program01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Criando conta bancaria");
		System.out.println("Digite o valor do deposito inicial: R$");
		double depositoInicial = sc.nextDouble();
		
		ContaBancaria cb = new ContaBancaria(depositoInicial);
		
		int opcao;
		
		do {
			System.out.println("Digite a opcao desejada");
			System.out.println("1 -> Consultar saldo");
			System.out.println("2 -> Consultar cheque especial");
			System.out.println("3 -> Depositar");
			System.out.println("4 -> Sacar");
			System.out.println("5 -> Pagar boleto");
			System.out.println("0 -> Sair");
			opcao = sc.nextInt();
			
			switch(opcao) {
			case 1:
				cb.consultarSaldo();
				break;
			case 2:
				cb.consultarChequeEspecial();
				break;
			case 3:
				System.out.println("Digite o valor que deseja depositar");
				double valorDeposito = sc.nextDouble();
				cb.depositar(valorDeposito);
				break;
			case 4:
				System.out.println("Digite o valor que deseja sacar");
				double valorSaque = sc.nextDouble();
				cb.sacar(valorSaque);
				break;
			case 5:
				System.out.println("Digite o valor do boleto que deseja pagar");
				double valorBoleto = sc.nextDouble();
				cb.pagarBoleto(valorBoleto);
				break;
			case 0:
				System.out.println("Obrigado por usar nosso banco. Programa encerrado");
				break;
			default:
				System.out.println("Opcao invalida, tente novamente");
				break;
			}
			
		} while(opcao != 0);
				
		sc.close();
	}
}