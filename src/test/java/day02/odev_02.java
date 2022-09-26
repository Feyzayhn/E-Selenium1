package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class odev_02 {
    // Yeni bir class olusturun (TekrarTesti)
    //2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
    //(verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
    //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
    //URL'yi yazdırın.
    //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
    //5. Youtube sayfasina geri donun
    //6. Sayfayi yenileyin
    //7. Amazon sayfasina donun
    //8. Sayfayi tamsayfa yapin
    //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
    //doğru başlığı(Actual Title) yazdırın.
    //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
    //URL'yi yazdırın
    //11.Sayfayi kapatin

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Thread.sleep(5000);


        // Yeni bir class olusturun (TekrarTesti)
        // Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın  (verify),
        driver.get("https://www.youtube.com");
        String actualTitle = driver.getTitle();
        String expectedTitle = "youtube";
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Test PASSED");
        }else
            //eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
            System.out.println("Sayfanin basligi " + driver.getTitle());


        //Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.
        String actualUrl = driver.getCurrentUrl();
        String exceptedUrl = "youtube";
        if (actualUrl.contains(exceptedUrl)){
            System.out.println("Test PASSED");
        }else{
            System.out.println(driver.getCurrentUrl());
        }

        // Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.get("https://www.amazon.com");

        // Youtube sayfasina geri donun
        driver.navigate().back();

        // Sayfayi yenileyin
        driver.navigate().refresh();

        // Amazon sayfasina donun
        driver.navigate().forward();

        // Sayfayi tamsayfa yapin
        driver.manage().window().maximize();

        // Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa  doğru başlığı(Actual Title) yazdırın.
        String actualTitle2 = driver.getTitle();
        String exceptedTitle2 = "amazon";
        if (actualUrl.contains(exceptedTitle2)){
            System.out.println("Test PASSED");
        }else{
            System.out.println(driver.getTitle());
        }
        //Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        //URL'yi yazdırın
        String actualUrl2 = driver.getCurrentUrl();
        String exceptedUrl2 = "amazon";
        if (actualUrl.contains(exceptedUrl)){
            System.out.println("Test PASSED");
        }else{
            System.out.println(driver.getCurrentUrl());
        }

        //Sayfayi kapatin
        driver.close();
    }

















}
