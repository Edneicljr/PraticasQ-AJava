#language: pt
#encoding: UTF-8


@login
Funcionalidade: Login

	Cenario: usuario invalido
		Quando eu informar o usuario "Ad"
		E Informar a senha "asd"
		E clicar no botao login
		Entao o sistema exibe a mensagem usuario invalido
		
		@loginSucesso
			Cenario: usuario valido
		Quando eu informar o usuario "Admin"
		E Informar a senha "admin123"
		E clicar no botao login
		Entao o sistema exibe o usuario logado
		
