package stepsDefinitions;

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
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Entao("o sistema exibe o usuario logado")
	public void oSistemaExibeOUsuarioLogado() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

}
	

