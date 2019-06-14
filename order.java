package com.weborder;

import com.github.javafaker.CreditCardType;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class order {
    static WebDriver driver;

    public static void main(String[] args) {

        Faker faker = new Faker();
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx";
        driver.navigate().to(url);

        WebElement login = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        login.sendKeys("Tester");
        WebElement passwd = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));

        passwd.sendKeys("test");

        WebElement submit = driver.findElement(By.xpath("//input [@type='submit']"));
        submit.click();

        WebElement orderlink = driver.findElement(By.xpath("//a[@href='Process.aspx']"));
        orderlink.click();


        WebElement quantity = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']"));
        quantity.sendKeys(Keys.BACK_SPACE);
        int number = faker.number().numberBetween(1, 100);
        quantity.sendKeys("" + number);

        String middleName = faker.name().firstName();
        String fullName = String.format("John %s Smith", middleName);

        WebElement customerName = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']"));
        customerName.sendKeys(fullName);

        String street = faker.address().streetAddress();
        WebElement streetWeb = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox2']"));
        streetWeb.sendKeys(street);

        String city = faker.address().city();
        WebElement cityWeb = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox3']"));
        cityWeb.sendKeys(city);

        String state = faker.address().state();
        WebElement stateWeb = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox4']"));
        stateWeb.sendKeys(state);

        String zip = faker.address().zipCode();
        String newzip = zip.substring(0, 5);
        WebElement zipWeb = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox5']"));
        zipWeb.sendKeys(newzip);

        WebElement visa = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_cardList_0']"));
        WebElement masterCard = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_cardList_1']"));
        WebElement americanExpress = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_cardList_2']"));
        WebElement cardNumber = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox6']"));
        int fakerNum = faker.number().numberBetween(0, 3);

        switch (fakerNum) {
            case 0:
                visa.click();
                String visaNum = faker.number().digits(15);
                visaNum = '4'+visaNum;
                cardNumber.sendKeys(visaNum);
                break;

            case 1:
                masterCard.click();
                String masterNum = faker.number().digits(15);
                cardNumber.sendKeys(masterNum);
                masterNum = '5'+masterNum;
                break;
            case 2:
                americanExpress.click();
                String AEnum = faker.number().digits(14);
                AEnum = '3'+AEnum;
                cardNumber.sendKeys(AEnum);
                break;
        }

        WebElement exp = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox1']"));
        exp.sendKeys("03/22");

        WebElement Submit = driver.findElement(By.xpath("//a[@id='ctl00_MainContent_fmwOrder_InsertButton']"));
        Submit.click();

        WebElement actT = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder']/tbody/tr/td/div/strong"));
        String actualText=actT.getText();
        String expectedText="New order has been successfully added.";


        if(actualText.equals(expectedText)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}