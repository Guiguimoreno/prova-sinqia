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

import java.time.Duration;



public class TesteProva {



        @Test
        public void TestAbrirLink(){

            PageTelaInicial Pagina = new PageTelaInicial();


            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.grocerycrud.com/v1.x/demo/bootstrap_theme");
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));



            Pagina.SelecionarCombo();


            //WebElement element = driver.findElement(By.id("switch-version-select"));
            //Select combo = new Select(element);
            //combo.selectByVisibleText("Bootstrap V4 Theme");



            driver.findElement(By.className("btn-default")).click();
            driver.findElement(By.id("field-customerName")).sendKeys("Teste Sinqia");
            driver.findElement(By.id("field-contactLastName")).sendKeys("Teste");
            driver.findElement(By.id("field-contactFirstName")).sendKeys("Moreno");
            driver.findElement(By.id("field-phone")).sendKeys("51 99999-9999");
            driver.findElement(By.id("field-addressLine1")).sendKeys("Av Sinqia, 1995");
            driver.findElement(By.id("field-addressLine2")).sendKeys("Torre D");
            driver.findElement(By.id("field-city")).sendKeys("Porto Alegre");
            driver.findElement(By.id("field-state")).sendKeys("RS");
            driver.findElement(By.id("field-postalCode")).sendKeys("91000-000");
            driver.findElement(By.id("field-country")).sendKeys("Brasil");
            driver.findElement(By.id("field-creditLimit")).sendKeys("200");
            WebElement Lista = driver.findElement(By.id("field_salesRepEmployeeNumber_chosen"));
            Lista.click();
            driver.findElement(By.xpath("//*[@id=\"field_salesRepEmployeeNumber_chosen\"]/div/ul/li[8]")).click();
            driver.findElement(By.id("form-button-save")).click();




            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"report-success\"]/p")));
            String actualString = driver.findElement(By.xpath("//*[@id=\"report-success\"]/p")).getText();
            Assertions.assertTrue(actualString.contains("Your data has been successfully stored into the database. Edit Customer or Go back to list"));
            driver.findElement(By.xpath("//*[@id=\"report-success\"]/p/a[2]")).click();


            WebElement Box = driver.findElement(By.className("form-control"));
            Box.click();
            Box.sendKeys("Teste Sinqia");

            wait.until(ExpectedConditions.elementToBeClickable(By.className("select-all-none")));

            driver.findElement(By.className("select-all-none")).click();

            Thread.sleep(1500);

            driver.findElement(By.className("select-all-none")).click();
            driver.findElement(By.className("delete-selected-button")).click();


            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert-delete-multiple-one")));

            String popUP = driver.findElement(By.className("alert-delete-multiple-one")).getText();
            Assertions.assertTrue(popUP.contains("Are you sure that you want to delete this 1 item?"));



            driver.findElement(By.className("delete-multiple-confirmation-button")).click();


            //System.out.println(driver.getPageSource());


            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert-success")));

            String greenBoX = driver.findElement(By.className("alert-success")).getText();
            Assertions.assertTrue(greenBoX.contains("Your data has been successfully deleted from the database."));

            driver.quit();

            /* <div data-growl="container" class="alert alert-success growl-animated animated bounceInDown" role="alert" data-growl-position="top-right" style="position: fixed; margin: 0px; z-index: 1031; display: inline-block; top: 20px; right: 20px;">…</div> */

            //  /html/body/div[3]










        }




    }
