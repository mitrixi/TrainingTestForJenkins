import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URI;

public class SelenoidDriverProvider implements WebDriverProvider {

    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("firefox");
        capabilities.setVersion("79.0");
        capabilities.setPlatform(Platform.LINUX);
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);

        try {
            return new RemoteWebDriver(
                    URI.create("http://localhost:4444/wd/hub").toURL(),
                    capabilities
            );
        } catch (MalformedURLException e) {
            throw new RuntimeException();
        }
    }
}
