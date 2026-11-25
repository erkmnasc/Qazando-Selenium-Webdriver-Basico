# Selenium WebDriver com Java (básico)

[![E2E tests](https://github.com/erkmnasc/Qazando-Selenium-Webdriver-Basico/actions/workflows/ci.yml/badge.svg)](https://github.com/erkmnasc/Qazando-Selenium-Webdriver-Basico/actions/workflows/ci.yml)

Projeto do módulo básico de Selenium com Java do curso Trilha QA da Qazando.
Cenário BDD em Cucumber (Gherkin em português) com Page Objects, rodando no
site de prática [automationpratice.com.br](https://automationpratice.com.br).

## Stack

Java 17 · Selenium 4 · Cucumber 7 · JUnit 4 · Maven

## Cenário

`src/test/resources/features/cadastro_usuario.feature`: cadastro de usuário
com sucesso, conferindo a mensagem "Cadastro realizado!" e o nome do usuário
logado depois de fechar o alerta.

## Estrutura

```
src/test/java/
  pages/    page objects (LoginPage, CadastroPage)
  steps/    definições dos passos do Cucumber
  runner/   runner do JUnit e criação do driver
  support/  esperas e geração de e-mail
```

## Como rodar

Precisa de Java 17, Maven e Google Chrome. O driver do navegador é baixado
pelo Selenium Manager, não precisa instalar nada além disso.

```bash
mvn test                   # abre o Chrome
mvn test -Dheadless=true   # sem abrir o navegador
```

O relatório HTML do Cucumber fica em `target/reports/cucumber.html`.

## CI

O GitHub Actions roda os testes a cada push na `master`, em pull requests e
manualmente, e guarda o relatório como artefato (`.github/workflows/ci.yml`).
