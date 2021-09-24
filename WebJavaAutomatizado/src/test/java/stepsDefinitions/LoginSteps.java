package stepsDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindAll;

import static utils.Utils.*;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

public class LoginSteps {

	LoginPage lp = new LoginPage();
	
	@Quando("eu informar o usuario {string}")
	public void euInformarOUsuario(String usuario) {
	    lp.informarCampoUsuario(usuario);
	}

	@Quando("Informar a senha {string}")
	public void informarASenha(String senha) {
	   lp.informarCampoSenha(senha);
	}

	@Quando("clicar no botao login")
	public void clicarNoBotaoLogin() {
	    lp.acionarBotaoLogin();
	}

	@Entao("o sistema exibe a mensagem usuario invalido")
	public void oSistemaExibeAMensagemUsuarioInvalido() {
		  assertEquals("Invalid credentials", driver.findElement(By.id("spanMessage")).getText());
	}

	@Entao("o sistema exibe o usuario logado")
	public void oSistemaExibeOUsuarioLogado() {
//		assertEquals("welcome Ram", driver.findElement(By.id("welcome").getText());
	  assertEquals("Welcome Ram", driver.findElement(By.id("welcome")).getText());
	}

}
	

