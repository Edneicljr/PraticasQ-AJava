package stepsDefinitions;

import static utils.Utils.*;
import io.cucumber.java.pt.Dado;

public class TesteSteps {
	
	@Dado("Que eu estou acessando o sistema")
	public void que_eu_estou_acessando_o_sistema() {
	   	acessarSistema();
		
	}


}
