package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import runner.RunCucumberTest;
import support.Utils;

public class CadastroPage extends RunCucumberTest {

    private static final By preencher_nome = By.id("user");
    private static final By preencher_email = By.id("email");
    private static final By preencher_password = By.id("password");
    private static final By botao_cadastrar = By.id("btnRegister");
    private static final By titulo_mensagem = By.id("swal2-title");
    private static final By clicar_botao_ok = By.cssSelector("div.swal2-actions button");
    private static final By logged_in_user = By.id("userLogged");

    public void preenchoOsDadosDeCadastro() {
        Utils.esperarElementoSerPresente(preencher_nome, 10);
        getDriver().findElement(preencher_nome).sendKeys("Erick");
        getDriver().findElement(preencher_email).sendKeys(Utils.emailAleatorio());
        getDriver().findElement(preencher_password).sendKeys("testeteste");
    }

    public void clicarNoBotaoCadastrar() {
        Utils.esperarElementoSerPresente(botao_cadastrar, 10);
        getDriver().findElement(botao_cadastrar).click();
    }

    public void visualizoMensagemDeCadastroRealizado() {
        Utils.esperarElementoSerVisivel(titulo_mensagem, 20);
        Assert.assertEquals("Cadastro realizado!", getDriver().findElement(titulo_mensagem).getText());
    }

    public void clicarNoBotaoOK() {
        getDriver().findElement(clicar_botao_ok).click();
        Utils.esperarElementoSerVisivel(logged_in_user, 20);
        String resultado_atual = getDriver().findElement(logged_in_user).getText();
        Assert.assertEquals("Erick", resultado_atual);
    }
}
