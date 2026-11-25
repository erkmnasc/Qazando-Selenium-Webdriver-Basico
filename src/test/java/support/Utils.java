package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

import java.time.Duration;
import java.util.Random;

public class Utils extends RunCucumberTest {

    public static void esperarElementoSerPresente(By element, int segundos) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(segundos));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void esperarElementoSerVisivel(By element, int segundos) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(segundos));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public static String emailAleatorio() {

        String email_init = "qazando";
        String email_final = "@qazando.com.br";

        Random random = new Random();
        int minimo = 1;
        int maximo = 999999;

        int resultado = random.nextInt(maximo - minimo) + minimo;

        return email_init + resultado + email_final;
    }
}
