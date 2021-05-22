package br.ce.wcaquino.runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/aprender_cucumber.feature",
		glue = "br.ce.wcaquino.steps",
		tags = {"@tipo2", "@tipo1"},
		plugin = "pretty",
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false, //validar se o mapeamento esta correto
		strict = false) //validar se tiver passo faltando quebra os testes
public class Runner {
	
	//"~@ignore" - ignora
	// {"@tipo2, @tipo1"} -tipo1 ou tipo2

}
