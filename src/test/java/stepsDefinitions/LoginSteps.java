package stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pageObjects.LoginPage;
import utils.Utils;
import static utils.Utils.*;

import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginSteps {

	@After
	public void setupDown() {
		driver.quit();
	}
	
	@Dado("que na pagina inicial e clicar em acessar")
	public void queNaPaginaInicialEClicarEmAcessar() {
		Utils.acessarSistema();
	}

	@Dado("insiro o usuario {string}")
	public void insiroOUsuario(String usuario) {
		Na(LoginPage.class).userName(usuario);
	}

	@Dado("a senha {string}")
	public void aSenha(String senha) {
		Na(LoginPage.class).passWord(senha);
	}

	@Dado("clico em login")
	public void clicoEmLogin() {
		Na(LoginPage.class).btnLogin();
	}

	@Entao("aparece mensagem que o usuario esta bloqueado")
	public void apareceMensagemQueOUsuarioEstaBloqueado() {
		String texto = driver.findElement(By.xpath("//h3[contains(@data-test,'error')]")).getText();
		Assert.assertEquals("Epic sadface: Sorry, this user has been locked out.", texto);
	}
	
	@Entao("aparece mensagem solicitando o usurario")
	public void apareceMensagemSolicitandoOUsurario() {
		String texto = driver.findElement(By.xpath("//h3[contains(@data-test,'error')]")).getText();
		Assert.assertEquals("Epic sadface: Username is required", texto);
	}
	
	@Entao("aparece mensagem que senha e usuario nao correspondem")
	public void apareceMensagemQueSenhaEUsuarioNaoCorrespondem() {
		String texto = driver.findElement(By.xpath("//h3[contains(@data-test,'error')]")).getText();
		Assert.assertEquals("Epic sadface: Username and password do not match any user in this service", texto);
	}
	
	@Entao("carrega pagina principal com produtos")
	public void carregaPaginaPrincipalComProdutos() {
		String texto = driver.findElement(By.xpath("//span[contains(@class,'title')]")).getText();
		Assert.assertEquals("Products", texto);
	}
	
	
}
