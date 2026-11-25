package steps;

import io.cucumber.java.pt.Dado;
import pages.LoginPage;
import runner.RunCucumberTest;

public class LoginSteps extends RunCucumberTest {

    LoginPage loginPage = new LoginPage();

    @Dado("^que estou na pagina inicial$")
    public void que_estou_na_pagina_inicial() {
        getDriver(Browser.CHROME);
        loginPage.acessarPaginaInicial();
    }

    @Dado("^clico no botao cadastro$")
    public void clico_no_botao_de_cadastro() {
        loginPage.clicarNoBotaoCadastro();
    }
}
