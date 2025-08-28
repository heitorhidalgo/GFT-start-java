package entities;

public class IngressoFamilia extends Ingresso {

	private int numeroPessoas;
	
	public IngressoFamilia(double valor, String nomeFilme, String tipoExibicao, int numeroPessoas) {
		super(valor, nomeFilme, tipoExibicao);
		this.numeroPessoas = numeroPessoas;
	}

	@Override
	public double getValorFinal() {
		double valorTotal = super.valor * this.numeroPessoas;
		
		if(this.numeroPessoas > 3) {
			valorTotal = valorTotal * 0.95;
		}
		return valorTotal;
	}
	
	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Numero de Pessoas: " + this.numeroPessoas);
	}
}
