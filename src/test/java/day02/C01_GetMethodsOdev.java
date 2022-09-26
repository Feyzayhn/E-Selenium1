package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_GetMethodsOdev {
   // Yeni bir package olusturalim : day01
    //    Yeni bir class olusturalim : C03_GetMethods
    //    Amazon sayfasina gidelim. https://www.amazon.com/
    //    Sayfa basligini(title) yazdirin
    //    Sayfa basliginin “Amazon” icerdigini test edin
    //    Sayfa adresini(url) yazdirin
    //    Sayfa url’inin “amazon” icerdigini test edin.
    //    Sayfa handle degerini yazdirin
    //    Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
    //    Sayfayi kapatin.

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        //    Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());

        //    Sayfa basliginin “Amazon” icerdigini test edin
        String arananKelime="Amozon";
        String title=driver.getTitle();
        if (title.contains(arananKelime)){
            System.out.println("Title PASSED");
        }else
            System.out.println("Title FAILED");

        //    Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());

        //    Sayfa url’inin “amazon” icerdigini test edin.
        String arananUrlKelime="amazon";
        String actualUrl= driver.getCurrentUrl();

        if (actualUrl.contains(arananUrlKelime)){
            System.out.println("Url PASSED");
        }else
            System.out.println("Url FAILED");

        //    Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());

        //    Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String istenenKelime="Gateway";

        if(driver.getPageSource().contains(istenenKelime)){
            System.out.println("PageSourse testi PASSED");
        }else
            System.out.println("PageSourse testi FAILED");
        driver.close();
    }
}
