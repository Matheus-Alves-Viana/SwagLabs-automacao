package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

//	================BOTOES==================

	@FindBy(id = "login-button")
	private WebElement botaoLogin;

//	================CAMPOS IMPUT==================

	@FindBy(id = "user-name")
	private WebElement campoUsuario;

	@FindBy(id = "password")
	private WebElement campoSenha;

//	================validacoes==================

// ==================metodos=============

	public void userName(String usuario) {
		campoUsuario.sendKeys(usuario);
	}

	public void passWord(String senha) {
		campoSenha.sendKeys(senha);
	}

	public void btnLogin() {
		botaoLogin.click();
	}

	public void Login() {
		userName("standard_user");
		passWord("secret_sauce");
		btnLogin();

	}

}
