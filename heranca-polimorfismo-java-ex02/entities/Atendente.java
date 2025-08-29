package entities;

public class Atendente extends Usuario {
	
	private double valorEmCaixa;

	public Atendente(String nome, String email, String senha) {
		super(nome, email, senha, false);
		this.valorEmCaixa = 0.0;
	}
	
	public void receberPagamentos(double valor) {
		this.valorEmCaixa += valor;
		System.out.println("Atendente '" + this.getNome() + "' recebeu um pagamento de R$" + valor + ".");
		System.out.printf("Novo valor em caixa: R$%.2f\n", this.valorEmCaixa);
	}

	public void fecharCaixa() {
		System.out.println("Atendente '" + this.getNome() + "' esta fechando o caixa...");
		System.out.printf("Valor total a ser recolhido: R$%.2f\n", this.valorEmCaixa);
		this.valorEmCaixa = 0.0;
		System.out.println("Caixa fechado e zerado.");
		
	}

	public double getValorEmCaixa() {
		return valorEmCaixa;
	}

}