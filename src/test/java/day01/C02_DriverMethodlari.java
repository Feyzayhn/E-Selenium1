package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_DriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon'a gidin
        driver.get("https://www.amazon.com");

        // Kaynak kodlarin icinde "Gateway" kelimesinin oldugunu test ediniz
        // System.out.println(driver.getPageSource());
        String istenenKelime="Gateway";

        if(driver.getPageSource().contains(istenenKelime)){
            System.out.println("PageSourse testi PASSED");
        }else
            System.out.println("PageSourse testi FAILED");
        driver.close();
        // driver.quit(); todo birden fazla sayfa varsa hepsini kapatir
    }
}
