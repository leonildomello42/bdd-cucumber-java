Feature: Aprender Cucumber
	Como um aluno
	Eu quero aprender a utilizar Cucumber
	Para que eu possa automatizar critérios de aceitação


Scenario: Deve excutar especificação

	Given que criei o arquivocorretamente
	When executá-lo
	Then a especificação deve finalizar com sucesso
	
	#Estados dos passos:
	#
	# 1- undefined: nao encontrou os passos
	# 2- pending: falta implementar o metodo - lanca uma excecao do tipo pending
	# 3- skipped: nao tentou executar os passos
	# 4- failed: um dos passos falhou
	# 5- passed: o teste passou