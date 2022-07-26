package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fisrtScript {
	
	WebDriver driver;

    public void lunch()
    {
        System.setProperty("webdriver.chrome.driver","D:\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://localhost:44365/PackageAdmin/Index");
        driver.findElement(By.name("Name")).sendKeys("Salman");
        driver.findElement(By.name("Password")).sendKeys("123456");
        driver.findElement(By.name("Submit")).click();
   
    }
    public static void main(String[] args) {
    	fisrtScript obj = new fisrtScript();
        obj.lunch();
    }
}


