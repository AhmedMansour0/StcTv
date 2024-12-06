package test_cases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.P01_SubscriptionPage;

import java.time.Duration;

public class TC01{
    private WebDriver driver;
    public void checkTitle(){
        Assert.assertTrue(new P01_SubscriptionPage(driver).verifyLiteTitle());
        Assert.assertTrue(new P01_SubscriptionPage(driver).verifyClassicTitle());
        Assert.assertTrue(new P01_SubscriptionPage(driver).verifyPremiumTitle());
    }

    public void checkPrice()
    {
        Assert.assertTrue(new P01_SubscriptionPage(driver).verifyLitePrice());
        Assert.assertTrue(new P01_SubscriptionPage(driver).verifyClassicPrice());
        Assert.assertTrue(new P01_SubscriptionPage(driver).verifyPremiumPrice());
    }

    public void checkCurrency()
    {
        Assert.assertTrue(new P01_SubscriptionPage(driver).verifyLiteCurrency());
        Assert.assertTrue(new P01_SubscriptionPage(driver).verifyClassicCurrency());
        Assert.assertTrue(new P01_SubscriptionPage(driver).verifyPremiumCurrency());
        Click_On_Country_Menu();
    }

    @BeforeTest
    public void setUp() {

        driver = new ChromeDriver();
        driver.get("https://subscribe.jawwy.tv/eg-en");
        driver.manage().window().maximize();
    }
    @Test
    public void Click_On_Country_Menu()
    {
        new P01_SubscriptionPage(driver).click_on_country_menu();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
    }
    @Test
    public void Click_On_Egypt()
    {
        new P01_SubscriptionPage(driver).Select_Egypt();
        checkTitle();
        checkPrice();
        checkCurrency();
    }

    @Test
    public void Click_On_Lebanon()
    {
        new P01_SubscriptionPage(driver).Select_Lebanon();
        checkTitle();
        checkPrice();
        checkCurrency();
    }

    @Test
    public void Click_On_UAE()
    {
        new P01_SubscriptionPage(driver).Select_UAE();
        checkTitle();
        checkPrice();
        checkCurrency();
    }
    @AfterClass
    void Tear_down(){
        driver.quit();
    }

}
