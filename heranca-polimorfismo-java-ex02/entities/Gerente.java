package entities;

public class Gerente extends Usuario {

	public Gerente(String nome, String email, String senha) {
		super(nome, email, senha, true);
	}

	public void gerarRelatorioFinanceiro() {
		System.out.println("Gerente '" + this.getNome() + "' esta gerando o relatorio financeiro...");
		System.out.println("Relatorio gerado.");
	}
	
	public void consultarVendas() {
		System.out.println("Gerente '" + this.getNome() + "' esta consultando as vendas do sistema.");
	}
}