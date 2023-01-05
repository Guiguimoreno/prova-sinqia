package pageObject;

import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.Duration;


public class loginPage {


    public WebDriver driver;

    public loginPage(WebDriver driver) {
        this.driver = driver;

        wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
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

    public void preencherAddress2(String address2) {
        driver.findElement(Address2).sendKeys(address2);
    }

    public void preencherCity(String city) {
        driver.findElement(City).sendKeys(city);
    }

    public void preencherState(String state) {
        driver.findElement(State).sendKeys(state);
    }

    public void preencherPostalCode(String post) {
        driver.findElement(PostalCode).sendKeys(post);
    }

    public void preencherCountry(String country) {
        driver.findElement(Country).sendKeys(country);
    }

    public void preencherCredit(String credit) {
        driver.findElement(Credit).sendKeys(credit);
    }


    public void Lista() {

        WebElement Lista = driver.findElement(By.id("field_salesRepEmployeeNumber_chosen"));
        Lista.click();
        driver.findElement(By.xpath("//*[@id=\"field_salesRepEmployeeNumber_chosen\"]/div/ul/li[8]")).click();

    }
    WebDriverWait wait;


    public void ClicarSaveButton() {
        driver.findElement(By.id("form-button-save")).click();
        wait.until(ExpectedConditions.elementToBeClickable(mensagemEsperada));
    }


}
