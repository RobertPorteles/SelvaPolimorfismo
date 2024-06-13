package br.com.animais;

public class Coelho extends Mamifero{

	@Override
	public void locomover() {
		System.out.println("Coelho se locomove Saltitando");
	}
	@Override
	public void alimentar() {
		System.out.println("Se alimenta mamando, comendo verduras e legumes.");
	}
	@Override
	public void emitirSom() {
	System.out.println("Som de mamifero");
}
	
}
