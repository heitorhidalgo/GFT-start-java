//Escreva um código onde temos o controle de banho de um petshop, a maquina de banhos dos pets deve ter as seguintes operações:
//Dar banho no pet;
//Abastecer com água;
//Abastecer com shampoo;
//verificar nivel de água;
//verificar nivel de shampoo;
//verificar se tem pet no banho;
//colocar pet na maquina;
//retirar pet da máquina;
//limpar maquina.
//Siga as seguintes regras para implementação
//
//A maquina de banho deve permitir somente 1 pet por vez;
//Cada banho realizado irá consumir 10 litros de água e 2 litros de shampoo;
//A máquina tem capacidade máxima de 30 litros de água e 10 litros de shampoo;
//Se o pet for retirado da maquina sem estar limpo será necessário limpar a máquina para permitir a entrada de outro pet;
//A limpeza da máquina ira consumir 3 litros de água e 1 litro de shampoo;
//O abastecimento de água e shampoo deve permitir 2 litros por vez que for acionado;

package application;

import java.util.Scanner;

import entities.Pet;
import entities.PetMachine;

public class Program {

	private final static Scanner sc = new Scanner(System.in);

	private final static PetMachine petMachine = new PetMachine();

	public static void main(String[] args) {

		var option = -1;

		do {
			System.out.println("===Escolha uma das opcoes===");
			System.out.println("1 - Dar banho no pet");
			System.out.println("2 - Abastecer a maquina com agua");
			System.out.println("3 - Abastecer a maquina com shampoo");
			System.out.println("4 - Verificar agua da maquina");
			System.out.println("5 - Verificar shampoo da maquina");
			System.out.println("6 - Verificar se tem pet no banho");
			System.out.println("7 - Colocar pet na maquina");
			System.out.println("8 - Retirar pet da maquina");
			System.out.println("9 - Limpar a maquina");
			System.out.println("0 - Sair");
			option = sc.nextInt();

			switch (option) {
			case 1 -> petMachine.takeAShower();
			case 2 -> setWater();
			case 3 -> setShampoo();
			case 4 -> verifyWater();
			case 5 -> verifyShampoo();
			case 6 -> checkIfHasPetInMachine();
			case 7 -> setPetInPetMachine();
			case 8 -> petMachine.removePet();
			case 9 -> petMachine.wash();
			case 0 -> System.exit(0);
			default -> System.out.println("opcao invalida");
			}

		} while (option != 0);

	}
	
	private static void setWater() {
		System.out.println("Tentando colocar agua na maquina");
		petMachine.addWater();
	}
	
	private static void setShampoo() {
		System.out.println("Tentando colocar shampoo na maquina");
		petMachine.addShampoo();
	}
	
	private static void verifyWater() {
		var amount = petMachine.getWater();
		System.out.println("A maquina esta no momento com  " + amount + " litro(s) de agua");
	}
	
	private static void verifyShampoo() {
		var amount = petMachine.getShampoo();
		System.out.println("A maquina esta no momento com  " + amount + " litro(s) de shampoo");
	}
	
	
	private static void checkIfHasPetInMachine() {
		var hasPet = petMachine.hasPet();
		System.out.println(hasPet ? "Tem pet na maquina" : "Nao tem pet na maquina");
	}

	private static void setPetInPetMachine() {
		var name = "";
		while (name == null || name.isEmpty()) {
			System.out.println("Informe o nome do pet");
			name = sc.next();
		}
		var pet = new Pet(name);
		petMachine.setPet(pet);
		System.out.println("O pet " + pet.getName() + " foi colocado na maquina");
	}

}
