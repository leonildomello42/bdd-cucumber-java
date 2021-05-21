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
	
}
