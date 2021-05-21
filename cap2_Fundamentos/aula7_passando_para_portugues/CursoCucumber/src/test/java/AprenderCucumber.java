import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class AprenderCucumber {
	
	@Dado("que criei o arquivocorretamente")
	public void que_criei_o_arquivocorretamente() {
	    System.out.println("O teste passou");
	}

	@Quando("executá-lo")
	public void executá_lo() {
	}

	@Entao("a especificação deve finalizar com sucesso")
	public void a_especificação_deve_finalizar_com_sucesso() {
	}
}
