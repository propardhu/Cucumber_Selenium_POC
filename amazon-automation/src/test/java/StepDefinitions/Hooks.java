package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
  public static WebDriver driver;

  @Before
  public void OpenDriver() {
    System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/mac/chromedriver");
    driver = new ChromeDriver();
  }

  @After
  public void closeDriver() {
    driver.close();
  }
}
