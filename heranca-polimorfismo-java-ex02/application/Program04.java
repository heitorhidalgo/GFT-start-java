//Crie uma hierarquia de classes que definam os tipos de usuários de um sistema, use os seguintes requisitos:
//
//Classe Gerente que terá os atributos: Nome, Email, Senha e um atributo que informa se ele é administrador, 
//esse último deve ser sempre verdadeiro;
//Classe Vendedor que terá os seguintes atributos: Nome, Email, Senha, Quantidade de vendas e um atributo que informa se ele é administrador, 
//esse útimo deve ser sempre falso;
//Classe Atendente que terá os seguintes atributos: Nome, Email, Senha, Valor em caixa e um atributo que informa se ele é administrador, 
//esse ultimo deve ser sempre falso.
//Cada classe deve ter seus respectivos getters e setters ( para atributos que façam sentido ter) e as classes devem ter os seguintes métodos
//
//A classe Gerente deve ter os métodos Gerar relatório financeiro, Consultar vendas, Realizar login, Realizar logff, alterar dados, alterar senha;
//A classe Vendedor deve ter os métodos Realizar venda ( incrementar o número de vendas quando acionado), Consultar vendas, Realizar login, 
//Realizar logoff, alterar dados, alterar senha;
//A classe Atendente deve ter os métodos Receber pagamentos (onde o método recebe um valor que deve ser incrementado no valor em caixa), 
//Fechar o caixa, Realizar Login, Realizar logoff, alterar dados e alterar senha;

package application;

import java.util.ArrayList;

import entities.Atendente;
import entities.Gerente;
import entities.Usuario;
import entities.Vendedor;

public class Program04 {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente("Sasuke", "sasuke@gmail.com", "senha123");
		Vendedor vendedor = new Vendedor("Kakashi", "kakashi@gmail.com", "senha456");
		Atendente atendente = new Atendente("Gaara", "gaara@gmail.com", "senha789");
		
		System.out.println("---DEMONSTRANDO METODOS---");
		
		System.out.println("---GERENTE---");
		gerente.realizarLogin();
		gerente.gerarRelatorioFinanceiro();
		System.out.println("Gerente e admin? " + gerente.isAdministrador());
		gerente.realizarLogoff();
		
		System.out.println("---VENDEDOR---");
		vendedor.realizarLogin();
		vendedor.realizarVendas();
		vendedor.consultarVendas();
		System.out.println("Vendedor e admin? " + vendedor.isAdministrador());
		vendedor.realizarLogoff();
		
		System.out.println("---ATENDENTE---");
		atendente.realizarLogin();
		atendente.receberPagamentos(50.00);
		atendente.receberPagamentos(100.00);
		atendente.fecharCaixa();
		System.out.println("Atendente e admin? " + atendente.isAdministrador());
		atendente.realizarLogoff();
		
		
		System.out.println("---DEMONSTRANDO POLIMORFISMO---");
		
		ArrayList<Usuario> listaDeUsuarios = new ArrayList<>();
		listaDeUsuarios.add(gerente);
		listaDeUsuarios.add(vendedor);
		listaDeUsuarios.add(atendente);
		
		for(Usuario user : listaDeUsuarios) {
			System.out.println("Verificando " + user.getNome() + ": ");
			if(user instanceof Gerente) {
				Gerente grt = (Gerente) user;
				grt.consultarVendas();
			} else if (user instanceof Vendedor){
				Vendedor vnd = (Vendedor) user;
				vnd.consultarVendas();
			} else {
				System.out.println("Este usuario nao consulta vendas.");
			}
			
		}
	}

}
