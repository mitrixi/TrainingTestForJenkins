import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class MyClass {
    @Test
    public void trueTest() {
        Assert.assertTrue(true);
    }

    @Test
    public void falseTest() {
        Assert.assertTrue(false);
    }

    @Test
    public void openPage() {
        open("https://jediru.net/");
    }
}
