import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;

public class MyClass {

    @BeforeClass
    public static void configuration() {
        Configuration.browser = "firefox";
        Configuration.timeout = 999;
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
        open("https://google.com/");
        $x("//title[text()='Google']").shouldBe(Condition.exist);
    }
}
