package entities;

public class RelogioBrasileiro extends Relogio {

	@Override
	public void sincronizar(Relogio outroRelogio) {
		System.out.println("Sincronizando relogio brasileiro...");
		this.setHora(outroRelogio.getHora());
		this.setMinuto(outroRelogio.getMinuto());
		this.setSegundo(outroRelogio.getSegundo());
	}
}
