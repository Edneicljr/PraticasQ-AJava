package stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static utils.Utils.*;


public class Hooks {

	
	@Before(value = "@login")
	public void setUp() {
		acessarSistema();
	}

	
	
	@After void tearDown() {
		
	}
	
	
	
	
}
