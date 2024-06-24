package pages;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage extends BasePage {

    public SecurePage(WebDriver navegador) {
        super(navegador);
    }

    public SecurePage confirmaLogin(){
        String loginConfirma = navegador.findElement(By.id("flash")).getText();
        assertTrue(loginConfirma.contains("You logged into a secure area!"));
        return this;
    }

    public LoginPage desloga(){
        navegador.findElement(By.xpath("/html/body/div[2]/div/div/a")).click();
        return new LoginPage(navegador);
    }
    
}
