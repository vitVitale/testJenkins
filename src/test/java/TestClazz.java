import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestClazz {


    private static String Base_Url = "https://www.facebook.com";
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drv/chromedriver");
        driver = new ChromeDriver();
        driver.get(Base_Url);
    }

    @After
    public void after() {
        driver.quit();
    }

    @Test
    public void testCasePassed() {
        Assert.assertTrue(driver.findElement(By.xpath("//form[@id='login_form']")).isDisplayed());
    }

    @Test
    public void testCasePassed2() {
        Assert.assertTrue(driver.findElement(By.xpath("//form[@id='login_form']")).isDisplayed());
    }

    @Test
    public void testCasePassed3() {
        Assert.assertTrue(driver.findElement(By.xpath("//form[@id='login_form']")).isDisplayed());
    }

    //@Test
    public void testCaseFailed() {
        Assert.assertTrue(driver.findElement(By.xpath("//form[@id='failed case']")).isDisplayed());
    }

    //@Ignore
    //@Test
    public void testCaseIgnored() {
        Assert.assertTrue(driver.findElement(By.xpath("//form[@id='ignored case']")).isDisplayed());
    }
}
