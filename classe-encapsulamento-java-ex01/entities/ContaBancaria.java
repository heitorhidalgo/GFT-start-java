package entities;

public class ContaBancaria {
	
	private double saldo;
	private double limiteChequeEspecial;
	private double valorUsadoChequeEspecial;
	
	public ContaBancaria(double depositoInicial) {
		this.saldo = depositoInicial;
		this.valorUsadoChequeEspecial = 0;
		
		if(depositoInicial <= 500.0) {
			this.limiteChequeEspecial = 50.0;
		}else {
			this.limiteChequeEspecial = depositoInicial * 0.50;
		}
	
	System.out.println("Conta criada com sucesso");
	System.out.println("Saldo inicial: R$" + this.saldo);
	System.out.println("Limite de cheque especial: R$" + this.limiteChequeEspecial);
	}
	
	public void consultarSaldo() {
		System.out.println("Saldo atual: R$" + this.saldo);
	}
	
	public void consultarChequeEspecial() {
		double disponivel = this.limiteChequeEspecial - this.valorUsadoChequeEspecial;
		System.out.println("Limite total do cheque especial: R$" + this.limiteChequeEspecial);
		System.out.println("Valor usado: R$" + this.valorUsadoChequeEspecial);
		System.out.println("Valor disponivel: R$" + disponivel);
	}
	
	public boolean estaUsandoChequeEspecial() {
		return this.valorUsadoChequeEspecial>0;
	}
	
	public void depositar(double valor) {
		if(valor <= 0) {
			System.out.println("Valor do deposito invalido");
			return;
		}
	
	if(this.estaUsandoChequeEspecial()) {
		double taxa = this.valorUsadoChequeEspecial * 0.20;
		double totalDevido = this.valorUsadoChequeEspecial + taxa;
		
		System.out.println("------------------");
		System.out.printf("Valor devido: R$ %.2f \n", this.valorUsadoChequeEspecial);
		System.out.printf("Taxa de 20%%: R$ %.2f\n", taxa);
		System.out.printf("Total a quitar: R$ %.2f\n", totalDevido);
		
		if(valor >= totalDevido) {
			this.saldo += (valor - totalDevido);
			this.valorUsadoChequeEspecial = 0;
			System.out.println("Dividas do cheque especial e taxas quitadas");
		}else {
			this.valorUsadoChequeEspecial -= valor;
			System.out.println("O deposito amortizou parte da divida do cheque especial");
		}
	}else {
		this.saldo += valor;
	}
		
	System.out.printf("Deposito de R$ %.2f realizado \n", valor);
	this.consultarSaldo();
	}
	
	public void sacar(double valor) {
		if(valor <= 0) {
			System.out.println("Valor de saque invalido");
			return;
		}
		
		double saldoDisponivelTotal = this.saldo + (this.limiteChequeEspecial - this.valorUsadoChequeEspecial);
		
		if(valor > saldoDisponivelTotal) {
			System.out.println("Saldo insuficiente");
		}else {
			this.saldo -= valor;
			System.out.printf("Saque de R$ %.2f realizado \n", valor);
			
			if(this.saldo < 0) {
				this.valorUsadoChequeEspecial = -this.saldo;
			}
		}
		this.consultarSaldo();
	}
	
	public void pagarBoleto(double valor) {
		System.out.println("Boleto pago");
		this.sacar(valor);
	}
	
}