package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;


public class PageTelaInicial {

        protected WebDriver driver;

        public PageTelaInicial(WebDriver driver) {
                this.driver = driver;
                 wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        }
        WebDriverWait wait;

        public void SelecionarCombo(){
                WebElement element = driver.findElement(By.id("switch-version-select"));
                Select combo = new Select(element);
                combo.selectByVisibleText("Bootstrap V4 Theme");
        }
        By AdicionarUsuario = By.className("btn-default");
        public void AdicionarUsuario(){
                driver.findElement(By.className("btn-default")).click();
        }
        public void Botao(){
                WebElement Box = driver.findElement(By.className("form-control"));
                Box.click();
                Box.sendKeys("Teste Sinqia");
        }
        By CheckBox = By.className("select-all-none");
        By BotaoDelete = By.className("delete-selected-button");
        By BotaoDelete2 = By.className("delete-multiple-confirmation-button");
        By DeletePopUp = By.className("alert-delete-multiple-one");
        public void CheckBox(){
                wait.until(ExpectedConditions.elementToBeClickable(By.className("select-all-none")));
                driver.findElement(CheckBox).click();
        }
        public void BotaoDelete(){
                driver.findElement(BotaoDelete).click();
        }
        public void BotaoDelete2(){
                driver.findElement(BotaoDelete2).click();
        }





}
