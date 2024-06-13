package br.com.animais;

public abstract class Animais {
	// atributos:
	private float Peso;
	private int Idade;
	
	
	// metodos:
	
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
	
	//Gets & Sets:
	//Get-> Retorna o valor enquanto set você colocar o valor:
	
	public float getPeso() {
		return Peso;
	}
	public void setPeso(float peso) {
		Peso = peso;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}
	
}
