package stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static utils.Utils.*;


public class Hooks {

	
	@Before(value = "@login")
	public void setUp() {
		acessarSistema();
	}

	
	// O código será executado em todos os cenários que tiver a tag em diante, e também, será executado na ordem. 
	//É uma boa forma de gerenciar os testes. Before sempre antes, o After sempre depois do cenário. o After tem valor em contagem regressiva.
	//Diferente do Before, que é em ordem crescente
//	@Before(order = 1, value = "@login")
//	public void setUp() {
//		acessarSistema();
//	}
//	
//	@Before(order = 2, value = "@login")
//	public void setUp() {
//		acessarSistema();
//	}
//	
//	@Before(order = 3, value = "@login")
//	public void setUp() {
//		acessarSistema();
//	}
//	
	
	
	@After void tearDown() {
		
	}
	
	
	
	
}
