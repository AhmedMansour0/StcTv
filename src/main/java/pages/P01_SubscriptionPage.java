package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class P01_SubscriptionPage {

    WebDriver driver ;
    public P01_SubscriptionPage(WebDriver driver){

        this.driver = driver;
    }
    private final By COUNTRY_ICON = By.id("country-name");
    private final By EGYPT = By.xpath("//div[@id='eg-contry-flag']");
    private final By UAE = By.xpath("//div[@id='ae-contry-flag']");
    private final By LEBANON = By.xpath("//div[@id='lb-contry-flag']");
    private final By LITE_TITLE = By.id("name-lite");
    private final By LITE_CURRENCY = By.id("currency-lite");
    private final By LITE_PRICE = By.xpath("//*[@id=\"currency-lite\"]/b");
    private final By CLASSIC_TITLE = By.id("name-classic");
    private final By CLASSIC_CURRENCY = By.id("currency-classic");
    private final By CLASSIC_PRICE = By.xpath("//*[@id=\"currency-classic\"]/b");
    private final By PREMIUM_TITLE = By.id("name-premium");
    private final By PREMIUM_CURRENCY = By.id("currency-premium");
    private final By PREMIUM_PRICE = By.xpath("//*[@id=\"currency-premium\"]/b");



    public void click_on_country_menu(){
        driver.findElement(this.COUNTRY_ICON).click();
    }
    public void Select_Egypt(){
        driver.findElement(this.EGYPT).click();
    }

    public void Select_UAE(){
        driver.findElement(this.UAE).click();
    }
    public void Select_Lebanon(){
        driver.findElement(this.LEBANON).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
    }

    public boolean verifyLiteTitle() {

        return driver.findElement(this.LITE_TITLE).isDisplayed();
    }
    public boolean verifyClassicTitle() {

        return driver.findElement(this.CLASSIC_TITLE).isDisplayed();
    }
    public boolean verifyPremiumTitle() {

        return driver.findElement(this.PREMIUM_TITLE).isDisplayed();
    }
    public boolean verifyLitePrice() {

        return driver.findElement(this.LITE_PRICE).isDisplayed();
    }
    public boolean verifyClassicPrice() {

        return driver.findElement(this.CLASSIC_PRICE).isDisplayed();
    }
    public boolean verifyPremiumPrice() {

        return driver.findElement(this.PREMIUM_PRICE).isDisplayed();
    }

    public boolean verifyLiteCurrency() {

        return driver.findElement(this.LITE_CURRENCY).isDisplayed();
    }
    public boolean verifyClassicCurrency() {

        return driver.findElement(this.CLASSIC_CURRENCY).isDisplayed();
    }
    public boolean verifyPremiumCurrency() {

        return driver.findElement(this.PREMIUM_CURRENCY).isDisplayed();
    }

}
