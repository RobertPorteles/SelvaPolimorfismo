package br.com.animais;

public class Cobra extends Reptil{
	private String corEscama;
	public String getCorEscama() {
		return corEscama;
		
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public void locomover() {
		System.out.println("Rastejando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Animais");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("shshh!!!");
		
	}
}
