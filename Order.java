package com.weborder;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Order extends faker {
    static WebDriver driver;




    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        driver= new ChromeDriver();

        driver.manage().window().maximize();




        String url ="http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx";
        driver.get(url );

        WebElement login = driver.findElement( By.xpath("//*[@id='ctl00_MainContent_username']") );
        login.sendKeys("Tester");

        WebElement password =driver.findElement( By.xpath("//*[@id='ctl00_MainContent_password']"));
        password.sendKeys("test");

        WebElement submit= driver.findElement( By.xpath( "//*[@id='ctl00_MainContent_login_button']"));
        submit.click();

        WebElement OrderLink= driver.findElement( By.xpath( "//*[@id='ctl00_menu']/li[3]/a" ) );
        OrderLink.click();


        WebElement Quantity= driver.findElement( By.xpath( "//*[@id='ctl00_MainContent_fmwOrder_txtQuantity']"));
    Quantity.sendKeys( Keys.BACK_SPACE );

        Faker faker = new Faker();
        Integer number=faker.number().numberBetween( 1,100 );
        Quantity.sendKeys(""+number);

        WebElement CustomerName= driver.findElement( By.xpath( "//*[@id='ctl00_MainContent_fmwOrder_txtName']"));
        String name=faker.name().firstName();
        String middle=faker.name().firstName();
        CustomerName.sendKeys("John "+ middle +" Smith");

        WebElement Street=driver.findElement( By.xpath( "//*[@id='ctl00_MainContent_fmwOrder_TextBox2']" ) );
        String streetAddress=faker.address().streetAddress();
        Street.sendKeys( ""+streetAddress );

        WebElement city=driver.findElement( By.xpath( "//*[@id='ctl00_MainContent_fmwOrder_TextBox3']" ) );
        String city1 =faker.address().city();
        city.sendKeys( city1 );

        WebElement State=driver.findElement( By.xpath( "//*[@id='ctl00_MainContent_fmwOrder_TextBox4']" ) );
        String states=faker.address().state();
        State.sendKeys( states );

        WebElement zip=driver.findElement( By.xpath( "//*[@id='ctl00_MainContent_fmwOrder_TextBox5']" ) );
        String zips= faker.address().zipCode();
        String newZip=zips.substring( 0,5 );
        zip.sendKeys( newZip );



        WebElement visa = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_cardList_0']"));
        WebElement mastercard = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_cardList_1']"));
        WebElement amex = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_cardList_2']"));

        WebElement cardNr=driver.findElement( By.xpath( "//*[@id='ctl00_MainContent_fmwOrder_TextBox6']" ) );


        int fakerNum=faker.number().numberBetween( 1,3 );

        switch (fakerNum){
            case 1:
                visa.click();
             String Visa = faker.number().digits( 16 );
             Visa='4'+Visa;
             cardNr.sendKeys(Visa );


                visa.sendKeys( Visa );
                break;

            case 2:
                mastercard.click();
                String master = faker.number().digits( 16 );
              master='5'+master;
              cardNr.sendKeys( master );

            break;
            case 3:
                amex.click();
                String ameX = faker.number().digits( 15 );
                ameX='3'+ameX;
                cardNr.sendKeys(ameX );
                break;
        }

        WebElement exp=driver.findElement( By.xpath( "//*[@id='ctl00_MainContent_fmwOrder_TextBox1']" ) );
         String expiration="03/14";

        exp.sendKeys(expiration  );


        WebElement Proccess= driver.findElement(By.xpath( "//*[@id='ctl00_MainContent_fmwOrder_InsertButton']" ) );
        Proccess.click();





    }
}
