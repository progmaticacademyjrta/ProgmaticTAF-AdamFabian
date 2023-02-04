package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.AppointmentPage;
import hu.progmatic.pages.HomePage;
import hu.progmatic.pages.LoginPage;
import org.testng.annotations.Test;

public class AppointmentPageTest extends DriverBaseTest {
    HomePage homePage;
    AppointmentPage appointmentPage;

    @Test
    public void AppointmentFullTest() throws InterruptedException{
        homePage = new HomePage(driver, wait);
        appointmentPage = new AppointmentPage(driver,wait);
        homePage.loadHomePage();
        homePage.checkMakeAppointmentButton();
        appointmentPage.Login();
        appointmentPage.AppointmentTest();

    }
}
