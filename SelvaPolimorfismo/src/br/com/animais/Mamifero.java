package br.com.animais;

public class Mamifero extends Animais {
	private String corPelo;

	@Override
	public void locomover() {
		System.out.println("se move Andando");
	}
	@Override
	public void alimentar() {
		System.out.println("se amamenta caso seja filhote");
	}
	@Override
	public void emitirSom() {
	System.out.println("Som de mamifero");
}
	public String getCorPelo() {
		return corPelo;
	}
	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
}
