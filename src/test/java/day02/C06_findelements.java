package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C06_findelements {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amozonda "Nutella" aratiniz
        driver.get("https://www.amazon.com/");

        // Amazon sayfasindaki tag'lari link(a) olanlarin sayisini yazdiriniz
        List<WebElement> tag=driver.findElements(By.tagName("a")); // 258 cikti
        System.out.println("a tag'inin sayisi : "+tag.size());

        // findElements() aradigimiz tum tag'lari getirir
        // findElement() aradigimiz bir webElementin ilk elementini getirir


    }
}
