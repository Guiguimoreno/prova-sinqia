package pageObject;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.Duration;


public class loginPage {


    protected WebDriver driver;

    public loginPage(WebDriver driver) {
        this.driver = driver;

    }

    By Name = By.id("field-customerName");
    By LastName = By.id("field-contactLastName");
    By ContactFirstName = By.id("field-contactFirstName");
    By Phone = By.id("field-phone");
    By Address1 = By.id("field-addressLine1");
    By Address2 = By.id("field-addressLine2");
    By City = By.id("field-city");
    By State = By.id("field-state");
    By PostalCode = By.id("field-postalCode");
    By Country = By.id("field-country");
    By Credit = By.id("field-creditLimit");
    By SaveButton = By.id("form-button-save");
    By mensagemEsperada = By.xpath("//*[@id=\"report-success\"]/p");
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


    public void preencherName(String name) {

        driver.findElement(Name).sendKeys(name);
    }

    public void preencherLastName(String lastname) {
        driver.findElement(LastName).sendKeys(lastname);
    }

    public void preencherContactFirstName(String contact) {
        driver.findElement(ContactFirstName).sendKeys(contact);
    }

    public void preencherPhone(String phone) {
        driver.findElement(Phone).sendKeys(phone);
    }

    public void preencherAddress1(String address) {
        driver.findElement(Address1).sendKeys(address);
    }

    public void preencherAddress2() {
        driver.findElement(Address2).sendKeys("Torre D");
    }

    public void preencherCity() {
        driver.findElement(City).sendKeys("Porto Alegre");
    }

    public void preencherState() {
        driver.findElement(State).sendKeys("RS");
    }

    public void preencherPostalCode() {
        driver.findElement(PostalCode).sendKeys("91000-000");
    }

    public void preencherCountry() {
        driver.findElement(Country).sendKeys("Brasil");
    }

    public void preencherCredit() {
        driver.findElement(Credit).sendKeys("200");
    }


    public void Lista() {

        WebElement Lista = driver.findElement(By.id("field_salesRepEmployeeNumber_chosen"));
        Lista.click();
        driver.findElement(By.xpath("//*[@id=\"field_salesRepEmployeeNumber_chosen\"]/div/ul/li[8]")).click();

    }

    public void ClicarSaveButton() {
        driver.findElement(By.id("form-button-save")).click();
        wait.until(ExpectedConditions.elementToBeClickable(mensagemEsperada));
    }

    public void SaveButton(){
        driver.findElement(By.id("form-button-save")).click();
        wait.until(ExpectedConditions.elementToBeClickable(mensagemEsperada));
    }



}
