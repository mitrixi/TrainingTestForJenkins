//import com.codeborne.selenide.Configuration;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import static com.codeborne.selenide.Selenide.*;

public class MyClass {
    static WebDriver driver;

    @BeforeClass
    public static void configuration() {
//        Configuration.browser = "chrome";
//        Configuration.timeout = 999;
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\geckodriver-v0.27.0-linux64.tar.gz.asc");
        driver = new FirefoxDriver();
    }

    @Test
    public void trueTest() {
        Assert.assertTrue(true);
    }

    @Test
    public void nextTrueTest() {
        Assert.assertTrue(true);
    }

    @Test
    public void openPage() {
//        open("https://google.com/");
        driver.get("https://google.com/");
//        $x("//title[text()='Google']").shouldBe(Condition.exist);
        driver.close();
    }


}
