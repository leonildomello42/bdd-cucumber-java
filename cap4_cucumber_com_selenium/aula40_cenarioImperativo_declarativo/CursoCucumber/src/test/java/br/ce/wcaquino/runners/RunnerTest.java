package br.ce.wcaquino.runners;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/", //inserir_conta.feature",
		glue = {"br.ce.wcaquino.steps"},
		tags = {"@unitários"},
		plugin = {"pretty", "html:target/report-html", "json:target/report-json/report.json"},
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false, //validar se o mapeamento esta correto
		strict = false) //validar se tiver passo faltando quebra os testes 
public class RunnerTest {
	
	//"~@ignore" - ignora
	// {"@tipo2, @tipo1"} -tipo1 ou tipo2

}
