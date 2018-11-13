import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = getDriver();
        driver.manage().window().maximize();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");

        WebElement emailInput = driver.findElement(By.id("email"));
        WebElement passwordInput = driver.findElement(By.id("passwd"));
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/button"));

        emailInput.sendKeys("webinar.test@gmail.com");
        passwordInput.sendKeys("Xcg7299bnSmMuRLp9ITw");
        loginButton.click();

        Thread.sleep(3000);

        //Select employeeIcon = new Select(driver.findElement(By.id("header_employee_box")));
        //employeeIcon.selectByIndex(0);

        WebElement employeeIcon = driver.findElement(By.id("header_employee_box"));
        employeeIcon.click();

        Thread.sleep(1000);

        WebElement logoutLink = driver.findElement(By.id("header_logout"));
        logoutLink.click();

        Thread.sleep(3000);

        driver.quit();

    }


    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//resourses//chromedriver.exe");
        return new ChromeDriver();
    }
}
