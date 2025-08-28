//Crie uma hierarquia de classes para tratar os tipos de ingresso que podem ser comercializados em um cinema. 
//O ingresso deve ter um valor, nome do filme e informar se é dublado ou legendado. 
//A partir desse ingresso devem ser criados os tipos Meia entrada e ingresso família. 
//Cada ingresso deve ter um método que retorna o seu valor real ( baseado no valor informado na criação do ingresso) 
//para os de meia entrada o seu valor deve ser de metade do valor, para os ingressos família deve-se retornar o valor multiplicado pelo 
//número de pessoas e fornecer um desconto de 5% quando o número de pessoas for maior que 3.

package application;

import java.util.ArrayList;

import entities.Ingresso;
import entities.IngressoFamilia;
import entities.IngressoMeia;

public class Program03 {

	public static void main(String[] args) {
		
		System.out.println("--- Bem-vindo ao Cinema! ---");
		
		Ingresso ingressoComum = new Ingresso(30.00, "Weapons", "Legendado");
		IngressoMeia ingressoEstudante = new IngressoMeia(30.00, "Weapons", "Legendado");
		IngressoFamilia ingressoFamiliaPequena = new IngressoFamilia(30.00, "Weapons", "Dublado", 3);
		IngressoFamilia ingressoFamiliaGrande = new IngressoFamilia(30.00, "Weapons", "Dublado", 4);
		
		ArrayList<Ingresso> carrinhoDeCompras = new ArrayList<>();
		carrinhoDeCompras.add(ingressoComum);
		carrinhoDeCompras.add(ingressoEstudante);
		carrinhoDeCompras.add(ingressoFamiliaPequena);
		carrinhoDeCompras.add(ingressoFamiliaGrande);
		
		double totalAPagar = 0;
		
		System.out.println("--- Detalhes da Compra ---");
		
		for(Ingresso ingresso : carrinhoDeCompras) {
			System.out.println("----------------");
			ingresso.exibirDetalhes();
			double valorFinal = ingresso.getValorFinal();
			System.out.printf("Valor Final a Pagar: R$%.2f\n", valorFinal);
			totalAPagar += valorFinal;
		}
		
		System.out.println("----------------");
		System.out.printf("Total geral da compra: R$%.2f\n", totalAPagar);
	}
}
