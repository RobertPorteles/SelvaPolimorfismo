package br.com.animais;

public class Ave extends Animais{
	private String corPena;

	@Override
	public void locomover() {
		System.out.println("Voando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("larvas,peixes e incetos");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de Ave");
		
	}

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

}
