package br.ce.wcaquino.runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/inserir_conta.feature",
		glue = "br.ce.wcaquino.steps",
		tags = {"not @ignote"},
		plugin = {"pretty", "html:target/report-html", "json:target/report-json/report.json"},
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false, //validar se o mapeamento esta correto
		strict = false) //validar se tiver passo faltando quebra os testes 
public class RunnerTest {
	
	//"~@ignore" - ignora
	// {"@tipo2, @tipo1"} -tipo1 ou tipo2

}
