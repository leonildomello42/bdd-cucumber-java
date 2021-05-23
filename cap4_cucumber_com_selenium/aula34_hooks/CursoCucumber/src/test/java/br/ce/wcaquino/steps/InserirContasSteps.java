package br.ce.wcaquino.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class InserirContasSteps {
	
	


	WebDriver driver;
	
	public WebDriver setDriver() {
		
		System.setProperty("webdriver.chrome.driver", "/home/lmelo/desenv/chromedriver/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();		
		return driver;	
	}
	
	@Dado("que estou acessando a aplicação")
	public void queEstouAcessandoAAplicação() {
		
		driver = setDriver();		
		driver.get("https://seubarriga.wcaquino.me/login");
	}

	@Quando("^informo o usuário (.*)$")
	public void informoOUsuário(String string) {
		
		driver.findElement(By.id("email")).sendKeys(string);
	}

	@Quando("a senha (.*)")
	public void aSenha(String string) {
		
		driver.findElement(By.name("senha")).sendKeys(string);
		
	}

	@Quando("seleciono entrar")
	public void selecionoEntrar() {
		
		driver.findElement(By.tagName("button")).click();
		
	}

	@Então("visualizo a página inicial")
	public void visualizoAPáginaInicial() {
		
		String texto = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		
		Assert.assertEquals("Bem vindo, leoteste!", texto);
	}

	@Quando("seleciono Contas")
	public void selecionoContas() {
		
		driver.findElement(By.linkText("Contas")).click();
	}

	@Quando("seleciono Adicionar")
	public void selecionoAdicionar() {
		
		driver.findElement(By.linkText("Adicionar")).click();
	}

	@Quando("^informo a conta (.*)$")
	public void informoAConta(String string) {
		
		driver.findElement(By.id("nome")).sendKeys(string);
	}

	@Quando("seleciono Salvar")
	public void selecionoSalvar() {
		
		driver.findElement(By.tagName("button")).click();
	}

	@Então("a conta é inserida com sucesso")
	public void aContaÉInseridaComSucesso() {
		
		String texto = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		
		Assert.assertEquals("Conta adicionada com sucesso!", texto);
			
	}
	
	@Então("sou notificado que o nome da conta é obrigatório")
	public void souNotificarQueONomeDaContaÉObrigatório() {
		
		String texto = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
		
		Assert.assertEquals("Informe o nome da conta", texto);
		
	}
	
	
	@Então("sou notificado que já existe uma conta com esse nome")
	public void souNotificadoQueJáExisteUmaContaComEsseNome() {
		
		String texto = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
		
		Assert.assertEquals("Já existe uma conta com esse nome!", texto);
		
	}
	
	
	@After
	public void fecharBrowser() {
		
		driver.quit();	
	}

}
