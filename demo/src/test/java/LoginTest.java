import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages.LoginPage;
import pages.SecurePage;
import suport.Web;

public class LoginTest {

    private WebDriver navegador;

    @BeforeTest
    public void setUp(){
        navegador = Web.criarChrome();
    }

    @Test
    public void efetuarLogin(){
        new LoginPage(navegador)
        .username("tomsmith")
        .senha("SuperSecretPassword!")
        .botaoLogin();

        new SecurePage(navegador)
        .confirmaLogin()
        .desloga();
    }

    @AfterTest
    public void tearDown(){
        navegador.quit();
    }
}