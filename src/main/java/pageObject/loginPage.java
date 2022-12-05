package pageObject;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class loginPage {


    protected WebDriver driver;

    public loginPage(WebDriver driver) {
        this.driver = driver;

    }

    By Name =  By.id("field-customerName");
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



public void Name(){
    driver.findElement(By.id("field-customerName")).sendKeys("Teste Sinqia");
}
    public void LastName() {
        driver.findElement(By.id("field-contactLastName")).sendKeys("Teste");
    }
    public void ContactFirstName(){
        driver.findElement(By.id("field-contactFirstName")).sendKeys("Moreno");
    }
    public void Phone(){
        driver.findElement(By.id("field-phone")).sendKeys("51 99999-9999");
    }
    public void Address1(){
        driver.findElement(By.id("field-addressLine1")).sendKeys("Av Sinqia, 1995");
    }
    public void Address2(){
        driver.findElement(By.id("field-addressLine2")).sendKeys("Torre D");
    }public void City(){
    driver.findElement(By.id("field-city")).sendKeys("Porto Alegre");
}
    public void State(){
    driver.findElement(By.id("field-state")).sendKeys("RS");
}
    public void PostalCode(){
        driver.findElement(By.id("field-postalCode")).sendKeys("91000-000");
    }
    public void Country(){
        driver.findElement(By.id("field-country")).sendKeys("Brasil");
    }
    public void Credit(){
        driver.findElement(By.id("field-creditLimit")).sendKeys("200");
    }


   public void Lista(){

       WebElement Lista = driver.findElement(By.id("field_salesRepEmployeeNumber_chosen"));
       Lista.click();
       driver.findElement(By.xpath("//*[@id=\"field_salesRepEmployeeNumber_chosen\"]/div/ul/li[8]")).click();

   }

   public void SaveButton(){
       driver.findElement(By.id("form-button-save")).click();
   }






    
}
