package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class PageTelaInicial {

        protected WebDriver driver;

        public PageTelaInicial(WebDriver driver) {
                this.driver = driver;

        }


        public void SelecionarCombo(){

                By comboBoxElement = (By) driver.findElement(By.id("switch-version-select"));
                Select combo = new Select((WebElement) comboBoxElement);
                combo.selectByVisibleText("Bootstrap V4 Theme");



        }


}
