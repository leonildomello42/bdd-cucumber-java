import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AprenderCucumber {
	
	@Given("que criei o arquivocorretamente")
	public void que_criei_o_arquivocorretamente() {
	    System.out.println("O teste passou");
	}

	@When("executá-lo")
	public void executá_lo() {
	}

	@Then("a especificação deve finalizar com sucesso")
	public void a_especificação_deve_finalizar_com_sucesso() {
	}

}
