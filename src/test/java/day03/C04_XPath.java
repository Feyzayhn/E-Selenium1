package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_XPath {
    public static void main(String[] args) throws InterruptedException {

        // 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        //         2- Add Element butonuna basin
        //         3- Delete butonu’nun gorunur oldugunu test edin
        //         4- Delete tusuna basin
        //         5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(3000);
        // 2- Add Element butonuna basin
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();

        // 3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton =driver.findElement(By.xpath("//*[text()='Delete']"));
        if (deleteButton.isDisplayed()){
            System.out.println("Delete button PASSED");
        }else
            System.out.println("Delete button FAILED");

          /*
        Locate alırken sadece text kullanıcaksak //*[text()='Add Element'] bu formatt kullanılır
        Atribute kullanıcaksak //*[@onclick='addElement()'] bu format kullanılır
         */


        // 4- Delete tusuna basin
        deleteButton.click();

        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveButton=driver.findElement(By.xpath("//h3"));
        if (addRemoveButton.isDisplayed()){
            System.out.println("AddRemove PASSED");
        }else
            System.out.println("AddRemove FAILED");

        //driver.close();
    }
}
