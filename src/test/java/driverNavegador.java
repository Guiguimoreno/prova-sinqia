import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class driverNavegador {

    private final WebDriver driver;

    public driverNavegador(WebDriver driver) {
        this.driver = driver;
    }

    @Before
  public void driveTeste(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://www.grocerycrud.com/v1.x/demo/bootstrap_theme");

  }
@After
  public void quit(){

      driverNavegador driver = null;
      driver.quit();
  }

}
