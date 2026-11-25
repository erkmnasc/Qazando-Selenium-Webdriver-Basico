package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class RunBase {

    static WebDriver driver;

    public enum Browser {CHROME, FIREFOX, EDGE}

    // -Dheadless=true roda o Chrome sem abrir a janela (usado no CI)
    private static final boolean HEADLESS = Boolean.parseBoolean(System.getProperty("headless", "false"));

    public static WebDriver getDriver() {
        if (driver == null) {
            return getDriver(Browser.CHROME);
        }
        return driver;
    }

    public static WebDriver getDriver(Browser browser) {

        if (driver != null) {
            driver.quit();
        }

        // O Selenium Manager baixa o driver certo para o navegador instalado
        switch (browser) {
            case CHROME:
                ChromeOptions options = new ChromeOptions();
                if (HEADLESS) {
                    options.addArguments("--headless=new", "--window-size=1280,1024");
                }
                driver = new ChromeDriver(options);
                break;
            case FIREFOX:
                driver = new FirefoxDriver();
                break;
            case EDGE:
                driver = new EdgeDriver();
                break;
            default:
                throw new IllegalArgumentException("Navegador não encontrado! Passe um navegador existente: Chrome, Firefox ou Edge.");
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
