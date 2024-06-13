package br.com.animais;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Informações sobre Coelho!\n");
		
		Coelho coelho = new Coelho();
		coelho.alimentar();
		coelho.emitirSom();
		coelho.locomover();
		coelho.setPeso(30);
		coelho.setCorPelo("Branco");
		coelho.setIdade(3);
		
		System.out.println(coelho.getPeso());
		System.out.println(coelho.getCorPelo());
		System.out.println(coelho.getIdade());
		
		System.out.println("Informações sobre Peixe!\n");
		
		Betta betta = new Betta();
		betta.alimentar();
		betta.emitirSom();
		betta.locomover();
		betta.setPeso(7);
		betta.setCorEscamas("Azul-Claro");
		System.out.println("A cor de sua escama é "+betta.getCorEscamas());
		System.out.println("Este pequeno peixe pesa "+betta.getPeso()+" gramas\n");
		
		System.out.println("Informações sobre Canguru!\n");
		
		Canguru canguru = new Canguru();
		canguru.alimentar();
		canguru.emitirSom();
		canguru.locomover();
		canguru.setCorPelo("Marrom");
		canguru.setPeso(70);
		canguru.setIdade(5);
		System.out.println("A idade deste canguru é de: "+canguru.getIdade());
		System.out.println("Seu peso é de: "+canguru.getPeso());
		System.out.println("A cor de seu pelo é "+canguru.getCorPelo());
		
		System.out.println("\nInformações sobre Cobra!\n");
		
		Cobra cobra = new Cobra();
		cobra.alimentar();
		cobra.emitirSom();
		cobra.locomover();
		cobra.setCorEscama("Verde");
		cobra.setPeso(6);
		cobra.setIdade(2);
		System.out.println("A cor de sua Escama é "+cobra.getCorEscama());
		System.out.println("Esta cobra pesa: "+cobra.getPeso()+" kg ");
		System.out.println("A cor de sua Escama é "+cobra.getCorEscama());
		System.out.println("Sua idade é "+cobra.getIdade()+" Anos");
	}

}
