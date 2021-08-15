import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    static WebDriver driver;
    public static WebDriver getDriver() {
        return driver;
    }

    @Before
    public void driverSetup (){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
@After
    public void driverQuit(){
        driver.quit();
}



}
