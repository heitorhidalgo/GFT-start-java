package entities;

public class Ingresso {
	
	protected double valor;
	protected String nomeFilme;
	protected String tipoExibicao;
	
	public Ingresso(double valor, String nomeFilme, String tipoExibicao) {
		this.valor = valor;
		this.nomeFilme = nomeFilme;
		this.tipoExibicao = tipoExibicao;
	}
	
	public double getValorFinal() {
		return this.valor;
	}
	
	public void exibirDetalhes() {
		System.out.println("Filme: " + this.nomeFilme);
		System.out.println("Tipo: " + this.tipoExibicao);
		System.out.printf("Valor Base: R$%.2f\n", this.valor);
	}
	
}
