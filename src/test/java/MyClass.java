import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static com.codeborne.selenide.Selenide.*;

public class MyClass {

//    private WebDriver driver;
    @BeforeClass
    public static void configuration() {
        Configuration.remote = "http://10.254.0.131:4444/wd/hub/";
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);
        Configuration.browserCapabilities = capabilities;
//        Configuration.timeout = 999;
    }

//    @Before
//    public void openDriver() throws MalformedURLException {
////        final DesiredCapabilities browser = DesiredCapabilities.chrome();
////        browser.setCapability("enableVNC", true);
////        browser.setCapability("screenResolution", "1920x1080x24");
////        driver = new RemoteWebDriver(new URL("http://localhost:8081/"), browser);
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().setSize(new Dimension(1920, 1080));
//    }

    @Test
    public void trueTest() {
        Assert.assertTrue(true);
    }

    @Test
    public void nextTrueTest() {
        Assert.assertTrue(true);
    }

    @Test
    public void openPage() throws InterruptedException {
        open("https://google.com/");
//        driver.get("https://google.com/");
        Thread.sleep(20000);

//        $x("//title[text()='Google']").shouldBe(Condition.exist);
    }
}
