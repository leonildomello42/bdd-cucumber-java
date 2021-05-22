package br.ce.wcaquino.entidades;

import java.io.Serializable;

public class Filme implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int estoque;
	private int aluguel;

	public void setEstoque(int estoque) {
		
		this.estoque = estoque;
	}

	public void setAluguel(int aluguel) {
		
		this.aluguel=aluguel;	
	}

	public int getEstoque() {
		return estoque;
	}

	public int getAluguel() {
		return aluguel;
	}
	
	

}
