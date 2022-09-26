package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_GetMethodlari {
    /*
    Amazon sayfasina gidiniz
    Arama kutusunu locate ediniz
    Arama kutusunun tagName'inin input old test ediniz
    Arama kutusunun name atributu'nun field-keywords oldugunu test ediniz
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://amazon.com");
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));

        //  Arama kutusunun tagName'inin input old test ediniz
        String expectedTagName="input";
        String actualTagName=searchBox.getTagName();
        if (actualTagName.equals(expectedTagName)){
            System.out.println("TagName testi PASSED"+actualTagName);
        }else
            System.out.println("TagName testi FAILED");

        //  Arama kutusunun name atributu'nun field-keywords oldugunu test ediniz
        String expectedAtributeName="field-keywords";
        String actualAtributeName=searchBox.getAttribute("name");
        if (actualAtributeName.equals(expectedAtributeName)){
            System.out.println("Atribute TESTI PASSED");
        }else
            System.out.println("Attribute TESTI FAILED");

        // Arama kutusunun konumunu yazdiriniz
        System.out.println("Arama kutusunun konumunu = " + searchBox.getLocation());

        driver.close();

    }
}
