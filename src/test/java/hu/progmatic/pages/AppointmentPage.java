package hu.progmatic.pages;

import hu.progmatic.driverfactory.DriverBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AppointmentPage extends DriverBaseTest {
    WebDriver driver;
    WebDriverWait wait;

    By usernameLoginBy = By.id("txt-username");
    By passwordLoginBy = By.id("txt-password");
    By loginButtonClickBy = By.id("btn-login");
    By visitDateBy = By.id("txt_visit_date");
    By bookAppointmentButtonBy = By.id("btn-book-appointment");
    By commentBy = By.id("txt_comment");

    public AppointmentPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void Login() throws InterruptedException{
        WebElement usernameLogin = driver.findElement(usernameLoginBy);
        WebElement passwordLogin = driver.findElement(passwordLoginBy);

        usernameLogin.sendKeys("John Doe");
        passwordLogin.sendKeys("ThisIsNotAPassword");

        WebElement LoginButtonClick = driver.findElement(loginButtonClickBy);
        LoginButtonClick.click();
        Thread.sleep(2000);
    }

    public void AppointmentTest()  {


        WebElement visitDate = driver.findElement(visitDateBy);
        visitDate.sendKeys("16/06/2023");

        WebElement comment = driver.findElement(commentBy);
        comment.sendKeys("----------------------");

        WebElement bookAppointmentButton = driver.findElement(bookAppointmentButtonBy);
        bookAppointmentButton.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/appointment.php#summary");
        System.out.println("AppointmentTest Ok");

    }
}
