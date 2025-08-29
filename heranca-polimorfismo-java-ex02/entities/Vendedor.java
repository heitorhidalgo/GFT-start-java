package entities;

public class Vendedor extends Usuario {
	
	private int quantidadeVendas;

	public Vendedor(String nome, String email, String senha) {
		super(nome, email, senha, false);
		this.quantidadeVendas = 0;
	}

	public void realizarVendas() {
		this.quantidadeVendas++;
		System.out.println("Vendedor '" + this.getNome() + "' realizou uma nova venda! Total de: " + this.quantidadeVendas);
	}

	public void consultarVendas() {
		System.out.println("Vendedor '" + this.getNome() + "' consultou sua(s) " + this.quantidadeVendas + " venda(s)");
	}

	public int getQuantidadeVendas() {
		return this.quantidadeVendas;
	}
	
}
