import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class AprenderCucumber {
	
	@Dado("que criei o arquivocorretamente")
	public void queCrieiOArquivocorretamente() {
	}

	@Quando("executá-lo")
	public void executáLo() {
	}

	@Então("a especificação deve finalizar com sucesso")
	public void aEspecificaçãoDeveFinalizarComSucesso() {
	}
	
	private int contador = 0;
	
	@Dado("^que o valor do contador é (\\d+)$")
	public void queOValorDoContadorÉ(int int1) {
		
		contador=int1;
	}

	@Quando("^eu incrementar em (\\d+)$")
	public void euIncrementarEm(int int1) {
		
		contador = contador+int1;
	}

	@Então("^o valor do contador será (\\d+)$")
	public void oValorDoContadorSerá(int int1) {
		
		//Assert.assertTrue(int1 == contador);
		Assert.assertEquals(int1, contador);	
	}
	
	/**
	 * Calcular atraso na entrega
	 */
	
	Date entrega = new Date();
	
	@Dado("^que a entrega é dia (\\d+)/(\\d+)/(\\d+)$")
	public void queAEntregaÉDia(int dia, int mes, int ano) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, dia);
		cal.set(Calendar.MONTH, mes-1);
		cal.set(Calendar.YEAR, ano);
		
		entrega = cal.getTime();
	}

	//a entrega atrasar em (\\d+) (.+)
	@Quando("^a entrega atrasar em (\\d+) (dias|dias|mes|meses)$")
	public void aEntregaAtrasarEmDias(int int1, String tempo) {
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(entrega);
		
		if(tempo.equals("dias")) {
			
			cal.add(Calendar.DAY_OF_MONTH, int1);
		}
		if(tempo.equals("meses")) {
			
			cal.add(Calendar.MONTH, int1);
		}
		
		entrega = cal.getTime();
	}

	@Então("^a entrega será efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
	public void aEntregaSeráEfetuadaEm(String data) {
		
		SimpleDateFormat formatData = new SimpleDateFormat("dd/MM/yyyy");
		
		String dataFormatada = formatData.format(entrega);
		
		Assert.assertEquals(data, dataFormatada);
	}
	
	/**
	 * Desafio regex
	 */
	
	@Dado("^que o ticket( especial)? é (A.\\d{3})$")
	public void queOTicketÉAF(String tipo, String arg1) {
	}

	@Dado("^que o valor da passagem é R\\$ (\\d+),(\\d+)$")
	public void queOValorDaPassagemÉR$(int int1, int int2) {
	}

	@Dado("^que o nome do passageiro é \"({5,20})\"$")
	public void queONomeDoPassageiroÉ(String string) {
	}

	@Dado("^que o telefone do passageiro é (9\\d{3}-\\d{4})$")
	public void queOTelefoneDoPassageiroÉ(String telefone) {
	}

	@Quando("criar os steps")
	public void criarOsSteps() {
	}

	@Então("o teste vai funcionar")
	public void oTesteVaiFuncionar() {
	}
	
}
