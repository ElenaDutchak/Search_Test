package search_test;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class Oscilograph {

    public void search(WebDriver driver) throws InterruptedException {

        driver.findElement(By.id("lst-ib")).clear();
        driver.findElement(By.id("lst-ib")).sendKeys("осциллограф");
        driver.findElement(By.id("lst-ib")).submit();

        int pageNumber = 1;

        if (driver.getPageSource().contains("vit") == true) {
            System.out.print("" + pageNumber);
        } else {

            do {

                // WebElement explicitWait = (new WebDriverWait(driver, 10))
                //.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//id='pnnext')")));


                Thread.sleep(5000);


                //explicitWait.click();


                driver.findElement(By.xpath("//*[@id='pnnext']")).click();
                pageNumber++;
            }

            while

                    (driver.getPageSource().contains("vit") == false);
            {
                System.out.print("" + pageNumber);
            }
        }
//        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(screenshot, new File("C:\\Selenium\\Screenshots\\Screen01.png"));

    }
}

