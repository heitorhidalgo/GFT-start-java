//Escreve uma hierarquia de classes para criação de relógios para diferentes lugares do mundo, defina uma classe pai que tenha as propriedades Hora, 
//minuto e segundo com seus respectivos getters e setters (atendendo as regras do funcionamento de um relógio) 
//e um método que deverá retornar a hora no formato HH:MM:SS, a partir dessa classe crie 2 implementações, 
//uma chamada relógio Americando e outra chamada relógio Brasileiro, lembrando que para o relógio americano não existem as horas de 13 até 24. 
//Defina também na super classe um método que ficará por responsabilidade da classe que extende-la definir seu funcionamemnto, 
//esse método deve receber um relógio ( independente da implementação) e deve-se extrair as informações dele e usa-la no objeto que recebeu 
//para setar as novas informações do relógio.

package application;

import entities.Relogio;
import entities.RelogioAmericano;
import entities.RelogioBrasileiro;

public class Program05 {

	public static void main(String[] args) {
		
		Relogio relogioSP = new RelogioBrasileiro();
		Relogio relogioNY = new RelogioAmericano();
		
		System.out.println("---AJUSTANDO A HORA EM SP---");
		relogioSP.setHora(16);
		relogioSP.setMinuto(04);
		relogioSP.setSegundo(45);
		
		System.out.println("Hora em SP: " + relogioSP.getHoraFormatada());
		System.out.println("Hora em NY: " + relogioNY.getHoraFormatada());
		
		System.out.println("\n---SINCRONIZANDO RELOGIO DE NY COM SP---");
		
		relogioNY.sincronizar(relogioSP);
		
		System.out.println("\n---HORAS APOS A SINCRONIZACAO---");
		System.out.println("Hora em SP: " + relogioSP.getHoraFormatada());
		System.out.println("Hora em NY: " + relogioNY.getHoraFormatada());
		
		System.out.println("\n---TESTANDO OUTRO HORARIO (PERIODO DA MANHA)---");
		relogioSP.setHora(9);
		relogioNY.sincronizar(relogioSP);
		
		System.out.println("Hora em SP: " + relogioSP.getHoraFormatada());
		System.out.println("Hora em NY: " + relogioNY.getHoraFormatada());
	}

}
