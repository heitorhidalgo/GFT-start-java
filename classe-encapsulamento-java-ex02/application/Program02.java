//Escreva um código onde controlamos as funções de um carro, ele deve ter as seguintes funções:
//Ligar o carro;
//Desligar o carro;
//Acelerar;
//diminuir velocidade;
//virar para esquerda/direita
//verificar velocidade;
//trocar a marcha
//Siga as seguintes regras na implementação
//
//Quando o carro for criado ele deve começar desligado, em ponto morto e com sua velocidade em 0
//O carro desligado não pode realizar nenhuma função;
//Quando o carro for acelerado ele deve incrementar 1km em sua velocidade (pode chegar no máximo a 120km);
//Quando diminuir a velocidade do carro ele deve decrementar 1 km de sua velocidade (pode chegar no minimo a 0km);
//o carro deve possuir 6 marchas, não deve ser permitido pular uma marcha no carro;
//A velocidade do carro deve respeitar os seguintes limites para cada velocidade
//se o carro estiver na marcha 0 (ponto morto) ele não pode acelerar
//se estiver na 1ª marcha sua velocidade pode estar entre 0km e 20km
//se estiver na 2ª marcha sua velocidade pode estar entre 21km e 40km
//se estiver na 3ª marcha sua velocidade pode estar entre 41km e 60km
//se estiver na 4ª marcha sua velocidade pode estar entre 61km e 80km
//se estiver na 5ª marcha sua velocidade pode estar entre 81km e 100km
//se estiver na 6ª marcha sua velocidade pode estar entre 101km e 120km
//O carro podera ser desligado se estiver em ponto morto (marcha 0) e sua velocidade em 0 km
//O carro só pode virar para esquerda/direita se sua velocidade for de no mínimo 1km e no máximo 40km;

package application;

import java.util.Scanner;

import entities.Carro;

public class Program02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Carro car = new Carro();
		
		int opcao;
		
		do {
			System.out.println("PAINEL DE CONTROLE");
			System.out.println("Escolha uma opcao: ");
			System.out.println("1 -> Ligar");
			System.out.println("2 -> Acelerar");
			System.out.println("3 -> Frear");
			System.out.println("4 -> Trocar a marcha");
			System.out.println("5 -> Virar");
			System.out.println("6 -> Desligar");
			System.out.println("0 -> Sair");
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 1: 
				car.ligar();
				break;
			case 2: 
				car.acelerar();
				break;
			case 3: 
				car.frear();
				break;
			case 4: 
				System.out.println("Qual marcha deseja trocar(0-6)?: ");
				int novaMarcha = sc.nextInt();
				car.trocarMarcha(novaMarcha);
				break;
			case 5: 
				System.out.println("Qual direcao deseja virar(esquerda ou direita)?: ");
				String direcao = sc.next();
				car.virar(direcao);
				break;
			case 6: 
				car.desligar();
				break;
			case 0: 
				System.out.println("Saindo... Obrigado por usar o simulador.");
				break;
			default:
				System.out.println("Opcao invalida.");
				break;		
			}
			
			if(opcao != 0) {
				car.exibirStatus();
			}	
		} while (opcao != 0);
		
		sc.close();
	}
}