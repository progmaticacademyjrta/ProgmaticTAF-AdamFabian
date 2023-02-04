package hu.progmatic.pages;

import hu.progmatic.driverfactory.DriverBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProfilePage extends DriverBaseTest {

    WebDriver driver;
    WebDriverWait wait;

    By clickMenuButtonBy = By.xpath("//*[@id=\"menu-toggle\"]/i");
    By ProfileButtonBy = By.xpath("//*[@id=\"sidebar-wrapper\"]/ul/li[4]/a");

    By LogoutButtonBy = By.linkText("Logout");

    public ProfilePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void ProfilePageButtonTest(){
        WebElement clickMenuButton = driver.findElement(clickMenuButtonBy);
        clickMenuButton.click();
        WebElement ProfileButton = driver.findElement(ProfileButtonBy);
        ProfileButton.click();
        WebElement LogoutButton = driver.findElement(LogoutButtonBy);
        LogoutButton.click();

        System.out.println("ProfilePage Ok");
    }
}
