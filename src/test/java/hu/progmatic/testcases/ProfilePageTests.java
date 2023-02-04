package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.AppointmentPage;
import hu.progmatic.pages.HomePage;
import hu.progmatic.pages.ProfilePage;
import org.testng.annotations.Test;

public class ProfilePageTests extends DriverBaseTest {
    HomePage homePage;
    AppointmentPage appointmentPage;
    ProfilePage profilePage;

    @Test
    public void ProfileButtonTest() throws InterruptedException{
        homePage = new HomePage(driver, wait);
        appointmentPage = new AppointmentPage(driver,wait);
        profilePage = new ProfilePage(driver,wait);

        homePage.loadHomePage();
        homePage.checkMakeAppointmentButton();
        appointmentPage.Login();
        profilePage.ProfilePageButtonTest();

    }
}
