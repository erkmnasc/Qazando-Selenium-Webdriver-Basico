package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.CadastroPage;
import runner.RunCucumberTest;

public class CadastroSteps extends RunCucumberTest {

    CadastroPage cadastroPage = new CadastroPage();

    @Quando("^preencho todos os campos obrigatorios$")
    public void preencho_o_formulario_de_cadastro() {
        cadastroPage.preenchoOsDadosDeCadastro();
    }

    @Quando("^clico em cadastrar$")
    public void clico_em_cadastrar() {
        cadastroPage.clicarNoBotaoCadastrar();
    }

    @E("^vejo mensagem de usuário cadastrado com sucesso$")
    public void visualizo_a_mensagem_de_cadastro_realizado_com_sucesso() {
        cadastroPage.visualizoMensagemDeCadastroRealizado();
    }

    @Então("^clico no botão Ok e vejo meu nome logado$")
    public void clico_no_botao_ok() {
        cadastroPage.clicarNoBotaoOK();
    }
}
