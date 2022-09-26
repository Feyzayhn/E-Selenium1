package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) {

         /*
        En temel haliyle bir otomasyon yapmak için
        Class'ımıza otomasyon için gerekli olan webdriver'in yerini göstermemiz gerekir
        bunun için java kutuphanesinde System.setProperty() method'unu kullanırız
        ve metthod'un içine ilk olarak driver'i yazarız. İkinci olarak onun fiziki yolunu kopyalarız
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver(); //TODO  WebDriver interface old icin tek basina obje olusturamiyoruz
                                             // bu sebeple ChromeDriver ı kullandik
                                             // bu sadece pencere acar

        driver.get("https://www.amazon.com"); // burada ise gitmek istedigimiz sayfayi yazariz
        System.out.println("Actual Title :" +driver.getTitle()); // TODO baslik yazdirir
        System.out.println("Actual Url :"+driver.getCurrentUrl()); //TODO sayfa Url'ini getirir

        System.out.println(driver.getPageSource()); //TODO gittigimiz sitedeki kaynak kodlarini getirir
                                                    // cok kullanilmaz


    }
}
