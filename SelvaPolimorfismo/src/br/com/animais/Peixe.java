package br.com.animais;

public class Peixe extends Animais{
	
	private String CorEscamas;
	
	@Override
	public void locomover() {
		System.out.println("se move Nadando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("larvas,algas,fungos,peixes");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Nenhum");
		
	}
	public void soltaBolha() {
		System.out.println("Soltou uma bolha");
		
	}

	public String getCorEscamas() {
		return CorEscamas;
	}

	public void setCorEscamas(String CorEscamas) {
		this.CorEscamas = CorEscamas;
	}

}
