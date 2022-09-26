package day02;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class odev_03 {
    // ClasslassWork : L oginoginTest
    //        1. Bir class oluşturun: LoginTest
    //        2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
    //        a. http://a.testaddressbook.com adresine gidiniz.
    //        b. Sign in butonuna basin
    //        c. email textbox,password textbox, and signin button elementlerini locate
    //        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
    //        i. Username :
    //        testtechproed@gmail.com
    //        ii. Password : Test1234!
    //        e. Expected user id nin
    //        testtechproed@gmail.com oldugunu dogrulayin(verify).
    //        f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
    //        3. Sayfada kac tane link oldugunu bulun.

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");

        // Sign in butonuna basin
        WebElement signIn = driver.findElement(By.id("sign-in"));
        signIn.sendKeys("signIn", Keys.ENTER);

        // email textbox,password textbox, and signin button elementlerini locate ediniz..
        // Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        // Username : testtechproed@gmail.com
        WebElement username = driver.findElement(By.id("session_email"));
        username.sendKeys("testtechproed@gmail.com");
        Thread.sleep(5000);

        // Password : Test1234!
        driver.findElement(By.id("session_password")).sendKeys("Test1234!");

        driver.findElement(By.name("commit")).click();

        WebElement sonucYaziElementi=driver.findElement(By.xpath("//h1[text()='Welcome to Address Book']"));
        String expectedBulunacakKelime="Welcome to Address Book";
        String actualYaziStr= sonucYaziElementi.getText();
        if (actualYaziStr.contains(expectedBulunacakKelime)){
            System.out.println("test PASSED");
        }else System.out.println("test FAILED");

       WebElement Addresses = driver.findElement(By.xpath("//a[@class='nav-item nav-link']"));
       System.out.println(Addresses.isDisplayed());

       WebElement signOut=driver.findElement(By.xpath("//*[text()='Sign out']"));
       System.out.println(signOut.isDisplayed());

        // 3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> list=driver.findElements(By.tagName("a"));
        System.out.println("link sayisi =  " + list.size());
        driver.close();


    }
}
