package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_SinifCalismasi {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //        a. http://a.testaddressbook.com adresine gidiniz.

        driver.get("http://a.testaddressbook.com");
        //        b. Sign in butonuna basin
        driver.findElement(By.id("sign-in")).click();
        //        c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTextbox=driver.findElement(By.id("session_email"));
        WebElement password=driver.findElement(By.id("session_password"));
        WebElement signin=driver.findElement(By.name("commit"));

        //        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //        i. Username : testtechproed@gmail.com
        driver.findElement(By.id("session_email")).sendKeys("testtechproed@gmail.com");
        //        ii. Password : Test1234!
        driver.findElement(By.id("session_password")).sendKeys("Test1234!");
        driver.findElement(By.name("commit")).click();
        //        e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement actualUser=driver.findElement(By.className("navbar-text"));
        String actualSonuc=actualUser.getText();
        String expectedUser="testtechproed@gmail.com";
        if (actualSonuc.contains(expectedUser)){
            System.out.println("Test PASSED");
        }else
            System.out.println("Test FAILED");
        //----- BASKA COZUMU
        if (actualUser.isDisplayed()) {
            System.out.println("ActualUser Testi PASSED" +actualUser.getText());
        }else
            System.out.println("ActualUser Testi FAILED");
/*
Bir Webelementin uzrindeki yaziyi konsolda yazdirabilmek icin getText() methodu kullanilir
 */

        //        f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement addresses = driver.findElement(By.linkText("Addresses"));
       if (addresses.isDisplayed()){
            System.out.println("Adresses testi PASSED");
        }else
           System.out.println("Adresses testi FAILED");

        WebElement signOut=driver.findElement(By.linkText("Sign out"));
        if (signOut.isDisplayed()){
            System.out.println("SignOut testi PASSED");
        }else
            System.out.println("SignOut testi FAILED");

        //        3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> linklerListesi=driver.findElements(By.tagName("a"));
        System.out.println("Linklerin sayisi : "+linklerListesi.size());

        // 4. Linkleri yazdiriniz
        for (WebElement each:linklerListesi
             ) {
            System.out.println("Linkler"+each.getText());

            // 5. Linkleri LAMBDA ile yazdirin
            linklerListesi.forEach(t-> System.out.println(t.getText()));

            driver.close();
        }
    }
}
