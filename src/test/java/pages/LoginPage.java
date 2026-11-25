package pages;

import org.openqa.selenium.By;
import runner.RunCucumberTest;

import static support.Utils.esperarElementoSerPresente;

public class LoginPage extends RunCucumberTest {

    private static final By botao_cadastro = By.linkText("Cadastro");

    public void acessarPaginaInicial() {
        getDriver().get("https://automationpratice.com.br/");
        esperarElementoSerPresente(botao_cadastro, 10);
    }

    public void clicarNoBotaoCadastro() {
        getDriver().findElement(botao_cadastro).click();
    }
}
