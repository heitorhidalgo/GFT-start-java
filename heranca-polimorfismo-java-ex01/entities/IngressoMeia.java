package entities;

public class IngressoMeia extends Ingresso {

	public IngressoMeia(double valor, String nomeFilme, String tipoExibicao) {
		super(valor, nomeFilme, tipoExibicao);
	}

	@Override
	public double getValorFinal() {
		return super.valor / 2;
	}
}
