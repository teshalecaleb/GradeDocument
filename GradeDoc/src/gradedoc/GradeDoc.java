/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradedoc;

import static com.google.common.base.Charsets.UTF_8;
import com.google.common.io.Files;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author hp
 */
public class GradeDoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();

        driver.get("https://portal.aait.edu.et/");

        System.out.println("Successfully opened the website localhost");

        driver.findElement(By.id("UserName")).sendKeys("ATE/8173/09");
        driver.findElement(By.id("Password")).sendKeys("6085");
        driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div[2]/div[2]/div[2]/form/div[4]/div/button")).click();
        driver.navigate().refresh();
        driver.findElement(By.xpath("//*[@id=\"ml2\"]")).click();
        // driver.findElement(By.id("m12")).click();

        String newout = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]")).getText();
        // File DestFile= new File("Desktop/grade.doc");

      try {
            FileWriter file1 = new FileWriter("MyGrade.doc");
            file1.write(newout);
            file1.close();
        }catch(IOException e){
            
            
        }
    }

}
