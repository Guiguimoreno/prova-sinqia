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

                WebElement element = driver.findElement(By.id("switch-version-select"));
                Select combo = new Select(element);
                combo.selectByVisibleText("Bootstrap V4 Theme");



        }
        By AdicionarUsuario = By.className("btn-default");


        public void AdicionarUsuario(){

                driver.findElement(By.className("btn-default")).click();


        }
}
