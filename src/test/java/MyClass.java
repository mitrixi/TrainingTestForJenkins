import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import static com.codeborne.selenide.Selenide.*;

public class MyClass {
    @BeforeClass
    public static void configuration() {
//        Configuration.browser = "SelenoidDriverProvider";
        Configuration.browser = "firefox";
        Configuration.timeout = 999;
        WebDriverManager.firefoxdriver().setup();
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
    public void openPage() throws InterruptedException {
        Thread.sleep(5000);
        open("https://google.com/");
        Thread.sleep(5000);

//        $x("//title[text()='Google']").shouldBe(Condition.exist);
    }
}
