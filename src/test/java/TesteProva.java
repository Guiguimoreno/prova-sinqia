import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.PageTelaInicial;
import pageObject.loginPage;

import java.sql.Driver;
import java.time.Duration;



public class TesteProva {



        @Test
        public void TestAbrirLink() throws InterruptedException {


            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.grocerycrud.com/v1.x/demo/bootstrap_theme");
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

            PageTelaInicial Home = new PageTelaInicial(driver);


            Home.SelecionarCombo();
            Home.AdicionarUsuario();

            loginPage Login = new loginPage(driver);
            Login.Name();
            Login.LastName();
            Login.ContactFirstName();
            Login.Phone();
            Login.Address1();
            Login.Address2();
            Login.City();
            Login.State();
            Login.PostalCode();
            Login.Country();
            Login.Credit();
            Login.Lista();

            Login.SaveButton();

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"report-success\"]/p")));
            String actualString = driver.findElement(By.xpath("//*[@id=\"report-success\"]/p")).getText();
            Assertions.assertTrue(actualString.contains("Your data has been successfully stored into the database. Edit Customer or Go back to list"));
            driver.findElement(By.xpath("//*[@id=\"report-success\"]/p/a[2]")).click();

            Home.Botao();


            wait.until(ExpectedConditions.elementToBeClickable(By.className("select-all-none")));

            Home.CheckBox();

            Thread.sleep(1500);

            Home.CheckBox();
            Home.BotaoDelete();


            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert-delete-multiple-one")));

            String popUP = driver.findElement(By.className("alert-delete-multiple-one")).getText();
            Assertions.assertTrue(popUP.contains("Are you sure that you want to delete this 1 item?"));



            Home.BotaoDelete2();



            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert-success")));

            String greenBoX = driver.findElement(By.className("alert-success")).getText();
            Assertions.assertTrue(greenBoX.contains("Your data has been successfully deleted from the database."));

            driver.quit();

            /* <div data-growl="container" class="alert alert-success growl-animated animated bounceInDown" role="alert" data-growl-position="top-right" style="position: fixed; margin: 0px; z-index: 1031; display: inline-block; top: 20px; right: 20px;">…</div> */

            //  /html/body/div[3]










        }




    }
