package HW3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        //driver.get to navigate to fb
        driver.get("https://www.facebook.com/");

        // maximize the screen
        driver.manage().window().maximize();

        //click on create new account
        WebElement createNewAccount = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewAccount.click();

        Thread.sleep(2000);

        //enter the first name
        WebElement firstname = driver.findElement(By.cssSelector("input[name='firstname']"));
        firstname.sendKeys("Duncan");

        WebElement lastName = driver.findElement(By.xpath("//input[@name = 'lastname']"));
        lastName.sendKeys("Botty");

        WebElement contactNumber = driver.findElement(By.xpath("//input[contains(@name,'reg')]"));
        contactNumber.sendKeys("6614867799");

        WebElement password = driver.findElement(By.xpath("//input[@id = 'password_step_input']"));
        password.sendKeys("DookieBooty2");

        WebElement Birthmonth = driver.findElement(By.xpath("//select[@id = 'month']"));
        Birthmonth.sendKeys("October");
        WebElement day = driver.findElement(By.xpath("//select[@name = 'birthday_day']"));
        day.sendKeys("20");

        WebElement year = driver.findElement(By.xpath("//select[@name = 'birthday_year']"));
        year.sendKeys("2012");
        Thread.sleep(2000);

        WebElement genderOfThePerson = driver.findElement(By.xpath("//label[text() = 'Male']"));
        genderOfThePerson.click();

        WebElement signUp = driver.findElement(By.xpath("//button[text() = 'Sign Up']"));
        signUp.click();
        Thread.sleep(2000);

        driver.quit();




    }
}

/*
HW (only use XPATH) navigate to fb.com click on create new account fill up all the textboxes close the popup close the browser
Note : in order for ur code to work u have to put Thread.sleep(2000) after clicking on Create new account
what is the reason, will discuss in next lecture

 */
