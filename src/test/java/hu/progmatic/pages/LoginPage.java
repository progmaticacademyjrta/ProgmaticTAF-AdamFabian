package hu.progmatic.pages;

import hu.progmatic.driverfactory.DriverBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage extends DriverBaseTest {

    WebDriver driver;
    WebDriverWait wait;
    By usernameLoginBy = By.id("txt-username");
    By passwordLoginBy = By.id("txt-password");
    By loginButtonClickBy = By.id("btn-login");
    By errorMessageBy = By.xpath("//*[@id=\"login\"]/div/div/div[1]/p[2]");

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void LoginTest(){
        WebElement usernameLogin = driver.findElement(usernameLoginBy);
        WebElement passwordLogin = driver.findElement(passwordLoginBy);

        usernameLogin.sendKeys("Login");
        passwordLogin.sendKeys("PSWD");

        WebElement LoginButtonClick = driver.findElement(loginButtonClickBy);
        LoginButtonClick.click();

        WebElement errorMessage = driver.findElement(errorMessageBy);
        Assert.assertEquals(errorMessage.getText(), "Login failed! Please ensure the username and password are valid.");
        System.out.println("Login Ok");
    }

}
