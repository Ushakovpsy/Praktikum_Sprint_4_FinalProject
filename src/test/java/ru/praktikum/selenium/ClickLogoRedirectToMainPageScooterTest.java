package ru.praktikum.selenium;

import org.junit.Test;
import ru.praktikum.selenium.pageobject.MainPage;

public class ClickLogoRedirectToMainPageScooterTest extends Base {
    MainPage mainPage;

    String expectedURL = "https://qa-scooter.praktikum-services.ru/";

    @Test
    public void ClickLogoRedirectToMainPageScooter() {
        mainPage = new MainPage(webDriver);

    mainPage.clickLogoMainPageScooter();
    mainPage.checkUrlRedirectMainPageScooter(expectedURL);
    }
}
