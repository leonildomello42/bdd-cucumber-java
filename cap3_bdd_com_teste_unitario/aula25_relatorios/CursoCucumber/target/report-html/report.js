$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/alugar_filme.feature");
formatter.feature({
  "name": "Alugar filme",
  "description": "\tComo um usuário\n\tEu quero cadastrar aluguéis de filmes\n\tPara controlar preços e datas de entrega",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Deve alugar um filme com sucesso",
  "description": "",
  "keyword": "Cenário"
});
formatter.step({
  "name": "um filme",
  "rows": [
    {
      "cells": [
        "estoque",
        "2"
      ]
    },
    {
      "cells": [
        "preco",
        "3"
      ]
    },
    {
      "cells": [
        "tipo",
        "comum"
      ]
    }
  ],
  "keyword": "Dado "
});
formatter.match({
  "location": "AlugarFilmeSteps.umFilme(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "alugar",
  "keyword": "Quando "
});
formatter.match({
  "location": "AlugarFilmeSteps.alugar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o preço do aluguel será R$ 3",
  "keyword": "Então "
});
formatter.match({
  "location": "AlugarFilmeSteps.o_preço_do_aluguel_será_R$(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a data de entrega será em 1 dia",
  "keyword": "E "
});
formatter.match({
  "location": "AlugarFilmeSteps.aDataDeEntregaSeráEmDias(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o estoque do filme será 1 unidade",
  "keyword": "E "
});
formatter.match({
  "location": "AlugarFilmeSteps.o_estoque_do_filme_será_unidade(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Não deve alugar filme sem estoque",
  "description": "",
  "keyword": "Cenário"
});
formatter.step({
  "name": "um filme com estoque de 0 unidades",
  "keyword": "Dado "
});
formatter.match({
  "location": "AlugarFilmeSteps.um_filme_com_estoque_de_unidades(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "alugar",
  "keyword": "Quando "
});
formatter.match({
  "location": "AlugarFilmeSteps.alugar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "não será possível por falta de estoque",
  "keyword": "Então "
});
formatter.match({
  "location": "AlugarFilmeSteps.nãoSeráPossívelPorFaltaDeEstoque()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o estoque do filme será 0 unidade",
  "keyword": "E "
});
formatter.match({
  "location": "AlugarFilmeSteps.o_estoque_do_filme_será_unidade(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Deve das condições conforme tipo de aluguel",
  "description": "",
  "keyword": "Esquema do Cenário"
});
formatter.step({
  "name": "um filme com estoque de 2 unidades",
  "keyword": "Dado "
});
formatter.step({
  "name": "que o preço do aluguel seja R$ \u003cpreco\u003e",
  "keyword": "E "
});
formatter.step({
  "name": "que o tipo do aluguel seja \u003ctipo\u003e",
  "keyword": "E "
});
formatter.step({
  "name": "alugar",
  "keyword": "Quando "
});
formatter.step({
  "name": "o preço do aluguel será R$ \u003cvalor\u003e",
  "keyword": "Então "
});
formatter.step({
  "name": "a data de entrega será em \u003cqtdDias\u003e dias",
  "keyword": "E "
});
formatter.step({
  "name": "a pontuação sera de \u003cpontuacao\u003e pontos",
  "keyword": "E "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Exemplos",
  "rows": [
    {
      "cells": [
        "preco",
        "tipo",
        "valor",
        "qtdDias",
        "pontuacao"
      ]
    },
    {
      "cells": [
        "4",
        "extendido",
        "8",
        "3",
        "2"
      ]
    },
    {
      "cells": [
        "4",
        "comum",
        "4",
        "1",
        "1"
      ]
    },
    {
      "cells": [
        "10",
        "extendido",
        "20",
        "3",
        "2"
      ]
    },
    {
      "cells": [
        "5",
        "semanal",
        "15",
        "7",
        "3"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Deve das condições conforme tipo de aluguel",
  "description": "",
  "keyword": "Esquema do Cenário"
});
formatter.step({
  "name": "um filme com estoque de 2 unidades",
  "keyword": "Dado "
});
formatter.match({
  "location": "AlugarFilmeSteps.um_filme_com_estoque_de_unidades(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "que o preço do aluguel seja R$ 4",
  "keyword": "E "
});
formatter.match({
  "location": "AlugarFilmeSteps.que_o_preço_do_aluguel_seja_R$(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "que o tipo do aluguel seja extendido",
  "keyword": "E "
});
formatter.match({
  "location": "AlugarFilmeSteps.queOTipoDoAluguelSejaExtendido(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "alugar",
  "keyword": "Quando "
});
formatter.match({
  "location": "AlugarFilmeSteps.alugar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o preço do aluguel será R$ 8",
  "keyword": "Então "
});
formatter.match({
  "location": "AlugarFilmeSteps.o_preço_do_aluguel_será_R$(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a data de entrega será em 3 dias",
  "keyword": "E "
});
formatter.match({
  "location": "AlugarFilmeSteps.aDataDeEntregaSeráEmDias(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a pontuação sera de 2 pontos",
  "keyword": "E "
});
formatter.match({
  "location": "AlugarFilmeSteps.aPontuaçãoSeraDePontos(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Deve das condições conforme tipo de aluguel",
  "description": "",
  "keyword": "Esquema do Cenário"
});
formatter.step({
  "name": "um filme com estoque de 2 unidades",
  "keyword": "Dado "
});
formatter.match({
  "location": "AlugarFilmeSteps.um_filme_com_estoque_de_unidades(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "que o preço do aluguel seja R$ 4",
  "keyword": "E "
});
formatter.match({
  "location": "AlugarFilmeSteps.que_o_preço_do_aluguel_seja_R$(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "que o tipo do aluguel seja comum",
  "keyword": "E "
});
formatter.match({
  "location": "AlugarFilmeSteps.queOTipoDoAluguelSejaExtendido(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "alugar",
  "keyword": "Quando "
});
formatter.match({
  "location": "AlugarFilmeSteps.alugar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o preço do aluguel será R$ 4",
  "keyword": "Então "
});
formatter.match({
  "location": "AlugarFilmeSteps.o_preço_do_aluguel_será_R$(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a data de entrega será em 1 dias",
  "keyword": "E "
});
formatter.match({
  "location": "AlugarFilmeSteps.aDataDeEntregaSeráEmDias(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a pontuação sera de 1 pontos",
  "keyword": "E "
});
formatter.match({
  "location": "AlugarFilmeSteps.aPontuaçãoSeraDePontos(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Deve das condições conforme tipo de aluguel",
  "description": "",
  "keyword": "Esquema do Cenário"
});
formatter.step({
  "name": "um filme com estoque de 2 unidades",
  "keyword": "Dado "
});
formatter.match({
  "location": "AlugarFilmeSteps.um_filme_com_estoque_de_unidades(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "que o preço do aluguel seja R$ 10",
  "keyword": "E "
});
formatter.match({
  "location": "AlugarFilmeSteps.que_o_preço_do_aluguel_seja_R$(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "que o tipo do aluguel seja extendido",
  "keyword": "E "
});
formatter.match({
  "location": "AlugarFilmeSteps.queOTipoDoAluguelSejaExtendido(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "alugar",
  "keyword": "Quando "
});
formatter.match({
  "location": "AlugarFilmeSteps.alugar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o preço do aluguel será R$ 20",
  "keyword": "Então "
});
formatter.match({
  "location": "AlugarFilmeSteps.o_preço_do_aluguel_será_R$(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a data de entrega será em 3 dias",
  "keyword": "E "
});
formatter.match({
  "location": "AlugarFilmeSteps.aDataDeEntregaSeráEmDias(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a pontuação sera de 2 pontos",
  "keyword": "E "
});
formatter.match({
  "location": "AlugarFilmeSteps.aPontuaçãoSeraDePontos(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Deve das condições conforme tipo de aluguel",
  "description": "",
  "keyword": "Esquema do Cenário"
});
formatter.step({
  "name": "um filme com estoque de 2 unidades",
  "keyword": "Dado "
});
formatter.match({
  "location": "AlugarFilmeSteps.um_filme_com_estoque_de_unidades(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "que o preço do aluguel seja R$ 5",
  "keyword": "E "
});
formatter.match({
  "location": "AlugarFilmeSteps.que_o_preço_do_aluguel_seja_R$(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "que o tipo do aluguel seja semanal",
  "keyword": "E "
});
formatter.match({
  "location": "AlugarFilmeSteps.queOTipoDoAluguelSejaExtendido(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "alugar",
  "keyword": "Quando "
});
formatter.match({
  "location": "AlugarFilmeSteps.alugar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o preço do aluguel será R$ 15",
  "keyword": "Então "
});
formatter.match({
  "location": "AlugarFilmeSteps.o_preço_do_aluguel_será_R$(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a data de entrega será em 7 dias",
  "keyword": "E "
});
formatter.match({
  "location": "AlugarFilmeSteps.aDataDeEntregaSeráEmDias(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a pontuação sera de 3 pontos",
  "keyword": "E "
});
formatter.match({
  "location": "AlugarFilmeSteps.aPontuaçãoSeraDePontos(int)"
});
formatter.result({
  "status": "passed"
});
});