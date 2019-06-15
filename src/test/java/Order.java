package techtorialHero.src.test.java;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Order {
    static WebDriver driver;
    public static void main(String[]args){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        String url="http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx";
        driver.get(url);
        WebElement login=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        login.sendKeys("Tester");
        WebElement password=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        password.sendKeys("test");
        WebElement loginButton=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
        loginButton.click();
        WebElement orderLink=driver.findElement(By.xpath("//*[@id=\"ctl00_menu\"]/li[3]/a"));
        orderLink.click();
        //WebElement customerName=driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_txtName']"));
        Faker faker=new Faker();
        int number=faker.number().numberBetween(1,100);
        WebElement quantity=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtQuantity\"]"));
        quantity.sendKeys(Keys.BACK_SPACE);
        quantity.sendKeys(""+number);

        WebElement customerName=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtName\"]"));
        String name=faker.name().firstName();
        String middleName=faker.name().firstName();
        customerName.sendKeys("John "+middleName+" Smith");

        WebElement customerStreet=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox2\"]"));
        String street=faker.address().streetAddress();
        customerStreet.sendKeys(street);

        WebElement customerCity=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox3\"]"));
        String fakerCity=faker.address().city();
        customerCity.sendKeys(fakerCity);

        WebElement state=driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_TextBox4']"));
        String fakerState=faker.address().state();
        state.sendKeys(fakerState);

        WebElement zip=driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_TextBox5']"));
        String fakerZip=faker.address().zipCode();
        String newZip=fakerZip.substring(0,5);
        zip.sendKeys(""+newZip);

        WebElement viza=driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_fmwOrder_cardList_0\']"));
        WebElement masterCard=driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_fmwOrder_cardList_1\']"));
        WebElement americanExpress=driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_fmwOrder_cardList_2\']"));

        WebElement cardNR=driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_TextBox6']"));

        int fakerNum=faker.number().numberBetween(1,4);

        switch (fakerNum){
            case 1:
                viza.click();
                String vizaNum=faker.number().digits(15);
               // vizaNum=vizaNum.substring(1);
                vizaNum='4'+vizaNum;
                cardNR.sendKeys(vizaNum);
                break;
            case 2:
                masterCard.click();
                String masterNum=faker.number().digits(15);
                //masterNum=masterNum.substring(1);
                masterNum='5'+masterNum;
                cardNR.sendKeys(masterNum);
                break;
            case 3:
                americanExpress.click();
                String americanNum=faker.number().digits(14);
                //americanNum=americanNum.substring(1);
                americanNum='3'+americanNum;
                cardNR.sendKeys(americanNum);
                break;
        }
        System.out.println(fakerNum);

        WebElement expDate=driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_TextBox1']"));
        expDate.sendKeys("08/28");

        WebElement process=driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_InsertButton']"));
        process.click();

        String expectedResult="New order has been successfully added.";
        String actualResult=driver.findElement(By.xpath("//*[@id=" +
                "\'ctl00_MainContent_fmwOrder\']/tbody/tr/td/div/strong")).getText();
        if(expectedResult.equals(actualResult)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
















    }
}
