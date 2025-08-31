package entities;

public abstract class Relogio {
	private int hora;
	private int minuto;
	private int segundo;
	
	public int getHora() {
		return hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public int getSegundo() {
		return segundo;
	}
	
	public void setHora(int hora) {
		if(hora >= 0 && hora <= 23) {
			this.hora = hora;
		} else {
			System.out.println("Hora invalida! Definido para 0.");
			this.hora = 0;
		}
	}
	
	public void setMinuto(int minuto) {
		if(minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
		} else {
			System.out.println("Minuto invalido! Definido para 0.");
			this.minuto = 0;
		}
	}

	public void setSegundo(int segundo) {
		if(segundo >= 0 && segundo <= 59) {
			this.segundo = segundo;
		} else {
			System.out.println("Segundo invalido! Definido para 0.");
			this.segundo = 0;
		}
	}
	
	public String getHoraFormatada() {
		return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
	}
	
	public abstract void sincronizar(Relogio outroRelogio);
}
