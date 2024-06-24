package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver navegador) {
        super(navegador);
    }

    WebElement loginForm = navegador.findElement(By.id("login"));

    public LoginPage username(String username){
        loginForm.findElement(By.id("username")).sendKeys(username);
        return this;
    }

    public LoginPage senha(String senha){
        loginForm.findElement(By.id("password")).sendKeys(senha);
        return this;
    }

    public SecurePage botaoLogin(){
        loginForm.findElement(By.xpath("/html/body/div[2]/div/div/form/button/i")).click();
        return new SecurePage(navegador);
    }
    
}
