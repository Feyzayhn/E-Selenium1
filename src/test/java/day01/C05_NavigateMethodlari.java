package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_NavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("https://amazon.com");
        //todo driver.navigate().to() methodu sayfada ileri geri yapicaksak kullanilir
        // todo driver.get() methodu gibi bizi istedigimiz Url'e goturur

        driver.navigate().to("https://techproeducation.com");

        //todo tekrar amazon a donelim
        Thread.sleep(3000);
        driver.navigate().back(); // geri

        // todo tekrar techproed sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().forward(); // ileri

        // todo Techproed sayfasini yenileyelim
        Thread.sleep(3000);
        driver.navigate().refresh();
        // todo sayfayi kapatiniz
        driver.quit();
    }

}
