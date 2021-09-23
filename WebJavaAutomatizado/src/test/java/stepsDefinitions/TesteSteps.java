package stepsDefinitions;

import static utils.Utils.*;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class TesteSteps {
	
	@Dado("Que eu estou acessando o sistema")
	public void que_eu_estou_acessando_o_sistema() 
	   {
	   	acessarSistema();
	   }
	
	@Quando("eu informar usuario")
	public void euInformarUsuario() {
	
	}

	@Quando("informar a senha")
	public void informarASenha() {

	}

	@Entao("o sistema apresenta o usuario logado")
	public void oSistemaApresentaOUsuarioLogado() {
	
	}

	


}
