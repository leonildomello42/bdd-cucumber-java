package br.ce.wcaquino.servicos;

import java.io.Serializable;
import java.util.Calendar;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.NotaAluguel;

public class AluguelService implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Filme filme;
	
	public NotaAluguel alugar(Filme filme) {
		
		NotaAluguel nota = new NotaAluguel();
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 1);
		nota.setDataEntrega(cal.getTime());
		
		nota.setPreco(filme.getAluguel());
		
		filme.setEstoque(filme.getEstoque() - 1);
		return nota;
	}

}
