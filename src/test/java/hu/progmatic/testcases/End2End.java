package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.AppointmentPage;
import hu.progmatic.pages.HomePage;
import hu.progmatic.pages.LoginPage;
import hu.progmatic.pages.ProfilePage;
import org.testng.annotations.Test;

public class End2End extends DriverBaseTest {
    HomePage homePage;
    LoginPage loginPage;
    AppointmentPage appointmentPage;
    ProfilePage profilePage;

    @Test
    public void End2EndTest() throws InterruptedException{
        homePage = new HomePage(driver, wait);
        loginPage = new LoginPage(driver, wait);
        appointmentPage = new AppointmentPage(driver,wait);
        profilePage = new ProfilePage(driver,wait);

        homePage.loadHomePage();
        homePage.checkMakeAppointmentButton();
        loginPage.LoginTest();
        appointmentPage.Login();
        appointmentPage.AppointmentTest();
        profilePage.ProfilePageButtonTest();
    }
}
