#language: pt
@funcionais
Funcionalidade: Cadastro de contas

Como um usuário 
Gostaria de cadastrar contas
Para que eu possa distribuir meu dinheiro de uma forma mais organizada

Contexto:
	Dado que estou acessando a aplicação
	Quando informo o usuário leonildo.mello@gmail.com
	E a senha leoteste
	E seleciono entrar
	Então visualizo a página inicial
	Quando seleciono Contas
	E seleciono Adicionar

Esquema do Cenário: Deve validar regras cadastro contas
	Quando adiciono a conta <conta>
	Então recebo a mensagem <mensagem>

Exemplos:
   | conta 						| mensagem 														| 
   | Conta de Teste 	| Conta adicionada com sucesso! 			|
   |    							| Informe o nome da conta 						|
   | Conta mesmo nome | Já existe uma conta com esse nome! 	|


