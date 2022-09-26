package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class odev01 {
    //    1-https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    //    2- Add Element butonuna 10 kez basinız
    //    3- 10 kez Add element butonuna basıldığını test ediniz
    //    4 -Delete butonuna görünmeyene kadar basınız
    //    5- Delete butonunun görünmediğini test ediniz
    //    6- Sayfayı kapatınız

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



        // 1-https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");


        //  2- Add Element butonuna 10 kez basinız.
        WebElement addElementButton = driver.findElement(By.xpath("//*[@onclick='addElement()']"));
        Thread.sleep(2000);

        for (int i = 0; i < 10; i++) {
            addElementButton.click();
        }


        // 3- 10 kez Add element butonuna basıldığını test ediniz
        List<WebElement> deleteButtonList = driver.findElements(By.xpath("//*[@onclick='deleteElement()']"));

        if (deleteButtonList.size() == 10){
            System.out.println("10 tane delete butonu izlenebilir");
        }else System.out.println("10 tane delete butonu izlenemez");

        // 4 - Delete butonuna görünmeyene kadar basınız
        for (int i = 0; i < deleteButtonList.size(); i++) {
            deleteButtonList.get(i).click();
        }

        // 5- Delete butonunun görünmediğini test ediniz
        String actualResult = driver.findElement(By.className("no-js")).getText();

        System.out.println(actualResult);
        if (!actualResult.contains("Delete")){
            System.out.println("Test PASSED");
        }else
            System.out.println("Test FAILED");

        // 6- Sayfayı kapatınız
        driver.close();
    }

    }

