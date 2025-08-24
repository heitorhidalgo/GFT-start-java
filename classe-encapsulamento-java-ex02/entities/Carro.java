package entities;

public class Carro {

	private boolean ligado;
	private int velocidadeAtual;
	private int marchaAtual;
	
	public Carro() {
		this.ligado = false;
		this.velocidadeAtual = 0;
		this.marchaAtual = 0;
		System.out.println("Novo carro criado. Ele esta desligado, em ponto morto e a 0 km/h.");
	}
	
	public void ligar() {
		if(!this.ligado) {
			this.ligado = true;
			System.out.println("Carro ligado.");
		}else {
			System.out.println("O carro ja esta ligado.");
		}
	}
	
	public void desligar() {
		if(!this.ligado) {
			System.out.println("Carro ja esta desligado.");
			return;
		}
		
		if(this.velocidadeAtual == 0 && this.marchaAtual == 0) {
			this.ligado = false;
			System.out.println("Carro desligado.");
		} else {
			System.out.println("O carro precisa estar parado e em ponto morto para desligar.");
		}
	}
	
	public void acelerar() {
		if(!this.ligado) {
			System.out.println("Nao e possivel acelerar com o carro desligado.");
			return;
		}
		
		if (this.marchaAtual == 0) {
	        System.out.println("Nao e possivel acelerar em ponto morto.");
	        return;
	    }
		
		if (this.velocidadeAtual == 0 && this.marchaAtual > 1) {
	        System.out.println("Velocidade incompatível. Reduza para a 1ª marcha para poder arrancar.");
	        return;
		}
		
		if(this.velocidadeAtual < 120) {
			if(isVelocidadeCompativelComMarcha(this.velocidadeAtual + 1, this.marchaAtual)) {
				this.velocidadeAtual++;
				System.out.println("Acelerando... Velocidade atual: " + this.velocidadeAtual + " km/h");
			}else {
				System.out.println("Velocidade maxima para marcha " + this.marchaAtual + " atingida. Troque a marcha para acelerar mais.");
			}
		}else {
			System.out.println("Velocidade maxima atingida de 120 km/h.");
		}
		
	}
	
	public void frear() {
		if(!this.ligado) {
			System.out.println("O carro esta desligado.");
			return;
		}
		
		if(this.velocidadeAtual > 0) {
			this.velocidadeAtual--;
			System.out.println("Freando... Velocidade atual: " + this.velocidadeAtual + " km/h");
		} else {
			System.out.println("O carro ja esta parado.");
		}
	}
	
	public void trocarMarcha(int novaMarcha) {
		if(!this.ligado) {
			System.out.println("Nao e possivel trocar a marcha, pois o carro esta desligado.");
			return;
		}
		
		if(Math.abs(novaMarcha - this.marchaAtual) !=1) {
			System.out.println("Nao e permitido pular marchas, mude para a marcha seguinte.");
			return;
		}
		
		if(novaMarcha < 0 || novaMarcha > 6) {
			System.out.println("Marcha invalida.");
			return;
		}
		
		if(isVelocidadeCompativelComMarcha(this.velocidadeAtual, novaMarcha)) {
			this.marchaAtual = novaMarcha;
			System.out.println("Marcha trocada para: " + (this.marchaAtual == 0 ? "Ponto morto" : this.marchaAtual + "a"));
		}else {
			System.out.println("A velocidade atual (" + this.velocidadeAtual + "km/h) nao e compativel com a " + novaMarcha + "a marcha.");
		}
	}
	
	private boolean isVelocidadeCompativelComMarcha(int velocidade, int marcha) {
		switch(marcha) {
		case 0:
			return true;
		case 1:
			return velocidade >= 0 && velocidade <= 20;
		case 2:
			return velocidade >= 20 && velocidade <= 40;
		case 3:
			return velocidade >= 40 && velocidade <= 60;
		case 4:
			return velocidade >= 60 && velocidade <= 80;
		case 5:
			return velocidade >= 80 && velocidade <= 100;
		case 6:
			return velocidade >= 100 && velocidade <= 120;
		default:
			return false;
		}
	}
	
	public void virar(String direcao) {
		if(!this.ligado) {
			System.out.println("O carro esta desligado.");
			return;
		}
		
		if(this.velocidadeAtual >= 1 && this.velocidadeAtual <= 40) {
			if(direcao.equalsIgnoreCase("esquerda") || direcao.equalsIgnoreCase("direita")) {
				System.out.println("Virando para a " + direcao + ".");
			} else {
				System.out.println("Direcao invalida. Use 'esquerda' ou 'direita'.");
			}
		} else {
			System.out.println("Nao e possivel virar nessa velocidade (" + this.velocidadeAtual + " km/h). Reduza para menos de 40 km/h.");
		}
	}
	
	public void exibirStatus() {
		System.out.println("Status do carro");
		System.out.println("Ligado: " + (this.ligado ? "Sim" : "Nao"));
		System.out.println("Velocidade: " + this.velocidadeAtual + " km/h");
		System.out.println("Marcha: " + (this.marchaAtual == 0 ? "Ponto morto" : this.marchaAtual + "a"));
	}
}