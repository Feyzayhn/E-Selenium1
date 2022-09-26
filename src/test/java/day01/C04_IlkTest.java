package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_IlkTest {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
1- Amazon sayfasına gidiniz
2- Başlığın "Amazon" içerdiğini test ediniz
3- Url'nin amazon içerdiğini test ediniz
4- Sayfayı kapatınız
 */

        driver.get("https://www.amazon.com");

        //todo 2- Başlığın "Amazon" içerdiğini test ediniz
        String arananKelime = "Amazon";
        String sayfaBasligi = driver.getTitle();
        if (sayfaBasligi.contains(arananKelime)) {
            System.out.println("Title Amazon PASSED");
        } else
            System.out.println("Title Amazon FAILED");

        // todo 3- Url'nin Amazon içerdiğini test ediniz
        String actualUrl = driver.getCurrentUrl();
        String arananUrlKelime = "Amazon";

        if (actualUrl.contains(arananUrlKelime)) {
            System.out.println("Url amazon PASSED");
        } else
            System.out.println("Url amazon FAILED");

        driver.close();

    }
}
