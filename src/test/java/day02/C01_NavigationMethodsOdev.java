package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_NavigationMethodsOdev {
    //Yeni bir Class olusturalim.C05_NavigationMethods
    //Youtube ana sayfasina gidelim . https://www.youtube.com/
    //Amazon soyfasina gidelim. https://www.amazon.com/
    //Tekrar YouTube’sayfasina donelim
    //Yeniden Amazon sayfasina gidelim
    //Sayfayi Refresh(yenile) yapalim
    //Sayfayi kapatalim / Tum sayfalari kapatalim
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Youtube ana sayfasina gidelim . https://www.youtube.com/
        driver.navigate().to("https://www.youtube.com/");

        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://www.youtube.com/");

        //Tekrar YouTube’sayfasina donelim
        driver.navigate().back();

        //Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();

        //Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();

        //Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.close();



    }
}
