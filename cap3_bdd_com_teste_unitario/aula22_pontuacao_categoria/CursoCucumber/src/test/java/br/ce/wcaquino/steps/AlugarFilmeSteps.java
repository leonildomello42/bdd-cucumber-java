package br.ce.wcaquino.steps;

import static org.junit.Assert.assertEquals;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.NotaAluguel;
import br.ce.wcaquino.servicos.AluguelService;
import br.ce.wcaquino.utils.DateUtils;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class AlugarFilmeSteps {
	
	
	private Filme filme;
	private AluguelService aluguelService =  new AluguelService();
	private NotaAluguel nota;
	
	private String erro;
	private String tipoAluguel;
	
	@Dado("^um filme com estoque de (\\d+) unidades$")
	public void um_filme_com_estoque_de_unidades(int int1) {
		
		filme = new Filme();
		filme.setEstoque(int1);
	}

	@Dado("^que o preço do aluguel seja R\\$ (\\d+)$")
	public void que_o_preço_do_aluguel_seja_R$(int int1) {
		
		filme.setAluguel(int1);
	}

	@Quando("alugar")
	public void alugar() {
		
		try {
			
			nota = aluguelService.alugar(filme, tipoAluguel);
		}
		catch (RuntimeException e) {
			erro = e.getMessage();
		}
		
	}

	@Então("^o preço do aluguel será R\\$ (\\d+)$")
	public void o_preço_do_aluguel_será_R$(int int1) {
		
		assertEquals(int1, nota.getPreco());
	}

//	@Então("a data de entrega será no dia seguinte")
//	public void a_data_de_entrega_será_no_dia_seguinte() {
//		
//		Calendar cal = Calendar.getInstance();
//		cal.add(Calendar.DAY_OF_MONTH, 1);
//		
//		Date dataRetorno = nota.getDataEntrega();
//		Calendar calRetorno = Calendar.getInstance();
//		calRetorno.setTime(dataRetorno);
//		
//		Assert.assertEquals(cal.get(Calendar.DAY_OF_MONTH), calRetorno.get(Calendar.DAY_OF_MONTH));
//		Assert.assertEquals(cal.get(Calendar.MONTH), calRetorno.get(Calendar.MONTH));
//		Assert.assertEquals(cal.get(Calendar.YEAR), calRetorno.get(Calendar.YEAR));
//	}

	@Então("^o estoque do filme será (\\d+) unidade$")
	public void o_estoque_do_filme_será_unidade(int int1) {
		
		Assert.assertEquals(int1, filme.getEstoque());
	}
	
	@Então("não será possível por falta de estoque")
	public void nãoSeráPossívelPorFaltaDeEstoque() {
		
		Assert.assertEquals("Filme sem estoque", erro);
	}
	
	
	@Dado("^que o tipo do aluguel seja (.*)$")
	public void queOTipoDoAluguelSejaExtendido(String tipo) {
		
		tipoAluguel = tipo;
	}

	@Então("^a data de entrega será em (\\d+) dias?$")
	public void aDataDeEntregaSeráEmDias(int int1) {
		
		Date dataEsperada = DateUtils.obterDataDiferencaDias(int1);
		Date dataReal = nota.getDataEntrega();
		
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		
		Assert.assertEquals(formatador.format(dataEsperada), formatador.format(dataReal));
	}

	@Então("^a pontuação sera de (\\d+) pontos$")
	public void aPontuaçãoSeraDePontos(int int1) {
		
		Assert.assertEquals(int1, nota.getPontuacao());
	}

}
