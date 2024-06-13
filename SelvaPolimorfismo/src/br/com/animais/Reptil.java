package br.com.animais;

public class Reptil extends Animais{
	private String corEscama;
	@Override
	public void locomover() {
		System.out.println("Se move Rastejando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Animais, Peixe, flores até Sementes.");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de Reptil");
		
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

}
