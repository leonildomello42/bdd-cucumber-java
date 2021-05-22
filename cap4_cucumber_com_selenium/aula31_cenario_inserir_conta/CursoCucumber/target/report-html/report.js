$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/inserir_conta.feature");
formatter.feature({
  "name": "Cadastro de contas",
  "description": "Como um usuário \nGostaria de cadastrar contas\nPara que eu possa distribuir meu dinheiro de uma forma mais organizada",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Deve inserir uma conta com sucesso",
  "description": "",
  "keyword": "Cenário"
});
formatter.step({
  "name": "que estou acessando a aplicação",
  "keyword": "Dado "
});
formatter.match({
  "location": "InserirContasSteps.queEstouAcessandoAAplicação()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo o usuário leonildo.mello@gmail.com",
  "keyword": "Quando "
});
formatter.match({
  "location": "InserirContasSteps.informoOUsuário(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a senha leoteste",
  "keyword": "E "
});
formatter.match({
  "location": "InserirContasSteps.aSenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono entrar",
  "keyword": "E "
});
formatter.match({
  "location": "InserirContasSteps.selecionoEntrar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visualizo a página inicial",
  "keyword": "Então "
});
formatter.match({
  "location": "InserirContasSteps.visualizoAPáginaInicial()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono Contas",
  "keyword": "Quando "
});
formatter.match({
  "location": "InserirContasSteps.selecionoContas()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono Adicionar",
  "keyword": "E "
});
formatter.match({
  "location": "InserirContasSteps.selecionoAdicionar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo a conta \"Conta de Teste\"",
  "keyword": "E "
});
formatter.match({
  "location": "InserirContasSteps.informoAConta(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono Salvar",
  "keyword": "E "
});
formatter.match({
  "location": "InserirContasSteps.selecionoSalvar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a conta é inserida com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "InserirContasSteps.aContaÉInseridaComSucesso()"
});
formatter.result({
  "status": "passed"
});
});