package ru.praktikum.selenium.pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static ru.praktikum.selenium.config.AppConfig.APP_URL;

public class MainPage {

    WebDriver webDriver;

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriver.get(APP_URL);
    }

    //Верхняя кнопка "Заказать".
    private By orderTopButton = By.className("Button_Button__ra12g");
    //Блок с нижней кнопкой "Заказать".
    private By blockOrder = By.className("Home_RoadMap__2tal_");
    //Нижняя кнопка "Заказать".
    private By orderBottomButton = By.xpath("//div[@class='Home_FinishButton__1_cWm']//button[contains(text(), 'Заказать')]");
    //Блок с разделом "Вопросы о важном".
    private By blockFaq = By.className("Home_FourPart__1uthg");
    //Кнопка с вопросом "Сколько это стоит? И как оплатить?"
    private By textQuestionCoast = By.xpath("//*[@id='accordion__heading-0']");
    //Текст ответа на вопрос о стоимости.
    private By textAnswerCoast = By.cssSelector("div.App_App__15LM- div.Home_HomePage__ZXKIX div.Home_FourPart__1uthg div.Home_FAQ__3uVm4 div.accordion div.accordion__item:nth-child(1) div.accordion__panel > p:nth-child(1)");
    //Кнопка с вопросом "Хочу сразу несколько самокатов! Так можно?"
    private By textQuestionFewScooters = By.xpath("//*[@id='accordion__heading-1']");
    //Текст ответа на вопрос о количестве самокатов.
    private By textAnswerFewScooters = By.cssSelector("div.App_App__15LM- div.Home_HomePage__ZXKIX div.Home_FourPart__1uthg div.Home_FAQ__3uVm4 div.accordion div.accordion__item:nth-child(2) div.accordion__panel > p:nth-child(1)");
    //Кнопка с вопросом "Как рассчитывается время аренды?"
    private By textQuestionTimeRent = By.xpath("//*[@id='accordion__heading-2']");
    //Текст ответа на вопрос о времени аренды.
    private By textAnswerTimeRent = By.cssSelector("div.App_App__15LM- div.Home_HomePage__ZXKIX div.Home_FourPart__1uthg div.Home_FAQ__3uVm4 div.accordion div.accordion__item:nth-child(3) div.accordion__panel > p:nth-child(1)");
    //Кнопка с вопросом "Можно ли заказать самокат прямо на сегодня?"
    private By textQuestionRentToday = By.xpath("//*[@id='accordion__heading-3']");
    //Текст ответа на вопрос об аренде сегодня.
    private By textAnswerRentToday = By.cssSelector("div.App_App__15LM- div.Home_HomePage__ZXKIX div.Home_FourPart__1uthg div.Home_FAQ__3uVm4 div.accordion div.accordion__item:nth-child(4) div.accordion__panel > p:nth-child(1)");
    //Кнопка с вопросом "Можно ли продлить заказ или вернуть самокат раньше?"
    private By textQuestionExtendAndReturn = By.xpath("//*[@id='accordion__heading-4']");
    //Текст ответа на вопрос о продлении и возврате.
    private By textAnswerExtendAndReturn = By.cssSelector("div.App_App__15LM- div.Home_HomePage__ZXKIX div.Home_FourPart__1uthg div.Home_FAQ__3uVm4 div.accordion div.accordion__item:nth-child(5) div.accordion__panel > p:nth-child(1)");
    //Кнопка с вопросом "Вы привозите зарядку вместе с самокатом?"
    private By textQuestionAboutCharger = By.xpath("//*[@id='accordion__heading-5']");
    //Текст ответа на вопрос о зарядке.
    private By textAnswerAboutCharger = By.cssSelector("div.App_App__15LM- div.Home_HomePage__ZXKIX div.Home_FourPart__1uthg div.Home_FAQ__3uVm4 div.accordion div.accordion__item:nth-child(6) div.accordion__panel > p:nth-child(1)");
    //Кнопка с вопросом "Можно ли отменить заказ?"
    private By textQuestionDenyOrder = By.xpath("//*[@id='accordion__heading-6']");
    //Текст ответа на вопрос об отмене заказа.
    private By textAnswerDenyOrder = By.cssSelector("div.App_App__15LM- div.Home_HomePage__ZXKIX div.Home_FourPart__1uthg div.Home_FAQ__3uVm4 div.accordion div.accordion__item:nth-child(7) div.accordion__panel > p:nth-child(1)");
    //Кнопка с вопросом "Я живу за МКАДом, привезёте?"
    private By textQuestionDeliveryFurtherMKAD = By.xpath("//*[@id='accordion__heading-7']");
    //Текст ответа на вопрос о доставка за МКАД.
    private By textAnswerDeliveryFurtherMKAD = By.cssSelector("div.App_App__15LM- div.Home_HomePage__ZXKIX div.Home_FourPart__1uthg div.Home_FAQ__3uVm4 div.accordion div.accordion__item:nth-child(8) div.accordion__panel > p:nth-child(1)");
    // Логотип "Самоката" на главной странице.
    private By logoMainPageScooter = By.cssSelector(".Header_LogoScooter__3lsAR");
    // Логотип "Яндекса" на главной странице.
    private By logoMainPageYandex = By.cssSelector(".Header_LogoYandex__3TSOI");

    public void clickOrderTopButton() {
        webDriver.findElement(orderTopButton).click();
    }

    public void scrollBlockOrder() {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", webDriver.findElement(blockOrder));
    }

    public void clickOrderBottomButton() {
        webDriver.findElement(orderBottomButton).click();
    }

    public void scrollBlockFaq() {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", webDriver.findElement(blockFaq));
    }

    public void clickTextQuestionCoast() {
        webDriver.findElement(textQuestionCoast).click();
    }

    public void checkTextAnswerCoast(String expectedText) {
        String actualText = webDriver.findElement(textAnswerCoast).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    public void clickTextQuestionFewScooters() {
        webDriver.findElement(textQuestionFewScooters).click();
    }

    public void checkTextAnswerFewScooters(String expectedText) {
        String actualText = webDriver.findElement(textAnswerFewScooters).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    public void clickTextQuestionTimeRent() {
        webDriver.findElement(textQuestionTimeRent).click();
    }

    public void checkTextAnswerTimeRent(String expectedText) {
        String actualText = webDriver.findElement(textAnswerTimeRent).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    public void clickTextQuestionRentToday() {
        webDriver.findElement(textQuestionRentToday).click();
    }

    public void checkTextAnswerRentToday(String expectedText) {
        String actualText = webDriver.findElement(textAnswerRentToday).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    public void clickTextQuestionExtendAndReturn() {
        webDriver.findElement(textQuestionExtendAndReturn).click();
    }

    public void checkTextAnswerExtendAndReturn(String expectedText) {
        String actualText = webDriver.findElement(textAnswerExtendAndReturn).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    public void clickTextQuestionAboutCharger() {
        webDriver.findElement(textQuestionAboutCharger).click();
    }

    public void checkTextAnswerAboutCharger(String expectedText) {
        String actualText = webDriver.findElement(textAnswerAboutCharger).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    public void clickTextQuestionDenyOrder() {
        webDriver.findElement(textQuestionDenyOrder).click();
    }

    public void checkTextAnswerDenyOrder(String expectedText) {
        String actualText = webDriver.findElement(textAnswerDenyOrder).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    public void clickTextQuestionDeliveryFurtherMKAD() {
        webDriver.findElement(textQuestionDeliveryFurtherMKAD).click();
    }

    public void checkTextAnswerDeliveryFurtherMKAD(String expectedText) {
        String actualText = webDriver.findElement(textAnswerDeliveryFurtherMKAD).getText();
        Assert.assertEquals(expectedText, actualText);
    }
    public void clickLogoMainPageScooter() {
        webDriver.findElement(logoMainPageScooter).click();
    }
    public void checkUrlRedirectMainPageScooter(String expectedURL) {
        String actualURL = webDriver.getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);
    }
    public void clickLogoMainPageYandex() {
        webDriver.findElement(logoMainPageYandex).click();
    }
    public void checkUrlRedirectMainPageYandex(String expectedURL) {
        String actualURL = webDriver.getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);
    }
}