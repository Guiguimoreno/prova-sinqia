import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.PageTelaInicial;
import pageObject.loginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class TesteProva {



        @Test
        public void TestAbrirLink() throws InterruptedException {

            WebDriver driver = new ChromeDriver();


            driverNavegador Nav = new driverNavegador(driver);
             /*WebDriverManager.chromedriver().setup();
            driver.manage().window().maximize();
            driver.get("https://www.grocerycrud.com/v1.x/demo/bootstrap_theme"); */





            PageTelaInicial Home = new PageTelaInicial(driver);


            Home.SelecionarCombo();
            Home.AdicionarUsuario();

            loginPage Login  = new loginPage(driver);
            Login.preencherName("Teste Sinqia");
            Login.preencherLastName("Teste");
            Login.preencherContactFirstName("Moreno");
            Login.preencherPhone("51 99999-9999");
            Login.preencherAddress1("Av Sinqia, 1995");
            Login.preencherAddress2("Torre D");
            Login.preencherCity("Porto Alegre");
            Login.preencherState("RS");
            Login.preencherPostalCode("91000-000");
            Login.preencherCountry("Brasil");
            Login.preencherCredit("200");


            Login.Lista();

            Login.ClicarSaveButton();


            String actualString = driver.findElement(By.xpath("//*[@id=\"report-success\"]/p")).getText();
            assertTrue(actualString.contains("Your data has been successfully stored into the database. Edit Customer or Go back to list"));
            driver.findElement(By.xpath("//*[@id=\"report-success\"]/p/a[2]")).click();

            Home.Botao();



            Home.CheckBox();

            Thread.sleep(1500);

            Home.CheckBox();
            Home.BotaoDelete();




            String popUP = driver.findElement(By.className("alert-delete-multiple-one")).getText();
            assertTrue(popUP.contains("Are you sure that you want to delete this 1 item?"));



            Home.BotaoDelete2();





            String greenBoX = driver.findElement(By.className("alert-success")).getText();
            assertTrue(greenBoX.contains("Your data has been successfully deleted from the database."));

            driver.quit();

            /* <div data-growl="container" class="alert alert-success growl-animated animated bounceInDown" role="alert" data-growl-position="top-right" style="position: fixed; margin: 0px; z-index: 1031; display: inline-block; top: 20px; right: 20px;">…</div> */

            //  /html/body/div[3]










        }




    }
