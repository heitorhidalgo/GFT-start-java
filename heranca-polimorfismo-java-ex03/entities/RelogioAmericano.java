package entities;

public class RelogioAmericano extends Relogio {
	
	@Override
	public String getHoraFormatada() {
		int horaAtual = this.getHora();
		String periodo = "AM";
		int horaFormatada = horaAtual;
		
		if(horaAtual == 0) {
			horaFormatada = 12;
		} else if(horaAtual == 12) {
			periodo = "PM";
		} else if(horaAtual > 12) {
			horaFormatada = horaAtual - 12;
			periodo = "PM";
		}
		
		return String.format("%02d:%02d:%02d %s", horaFormatada, this.getMinuto(), this.getSegundo(), periodo);
	}
	
	@Override
	public void sincronizar(Relogio outroRelogio) {
		System.out.println("Sincronizando relogio americano...");
		this.setHora(outroRelogio.getHora());
		this.setMinuto(outroRelogio.getMinuto());
		this.setSegundo(outroRelogio.getSegundo());
	}
	
}
