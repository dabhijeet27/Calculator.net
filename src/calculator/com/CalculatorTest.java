package calculator.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {

  WebDriver driver;

  @BeforeClass
  public void setup() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "chromedriver\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://www.calculator.net/");
    driver.manage().window().maximize();
    Thread.sleep(3000);
  }

  @Test
  public void Multiplication() throws InterruptedException {
	
	String expectedOutput = "222075";
	
    // Delay by 1 second
	Thread.sleep(1000);
	
	// clear result
    driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
	
    // Enter the first number
    driver.findElement(By.xpath("//span[normalize-space()='4']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
    
    // Delay by 1 second
    Thread.sleep(1000);

    // Select the multiplication operation
    driver.findElement(By.xpath("//span[normalize-space()='×']")).click();

    // Enter the second number
    driver.findElement(By.xpath("//span[normalize-space()='5']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='5']")).click();

    // Click on the equals button
    driver.findElement(By.xpath("//span[normalize-space()='=']")).click();

    // Get the result and verify it
    String output = driver.findElement(By.cssSelector("div[id='sciOutPut']")).getText().trim();
    
    // Check output is present or not
    Assert.assertNotNull(output);
    
    // Check output is equal or not
    Assert.assertEquals(expectedOutput, output);
    
    // Check output is equal or not
    Assert.assertSame(expectedOutput, output);
    
    // Print Result
    System.out.println("Test: Multiplication");
    System.out.println("N1: " + "423");
    System.out.println("N2: " + "525");
    System.out.println("Expected Output: " + expectedOutput + " - Desired Output: " + output);
  }

  @Test
  public void Division() throws InterruptedException {
	
	String expectedOutput = "20";
	
	// clear result
    driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
    
    // Delay by 1 second
    Thread.sleep(1000);
	
    // Enter the first number
    driver.findElement(By.xpath("//span[normalize-space()='4']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='0']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='0']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='0']")).click();
    
    // Delay by 1 second
    Thread.sleep(1000);

    // Select the division operation
    driver.findElement(By.xpath("//span[normalize-space()='/']")).click();

    // Enter the second number
    driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='0']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='0']")).click();

    // Click on the equals button
    driver.findElement(By.xpath("//span[normalize-space()='=']")).click();

    // Get the result and verify it
    String output = driver.findElement(By.cssSelector("div[id='sciOutPut']")).getText().trim();
    
    // Check output is present or not
    Assert.assertNotNull(output);
    
    // Check output is equal or not
    Assert.assertEquals(expectedOutput, output);
    
    // Check output is equal or not
    Assert.assertSame(expectedOutput, output);
    
    // Print Result
    System.out.println("Test: Division");
    System.out.println("N1: " + "4000");
    System.out.println("N2: " + "200");
    System.out.println("Expected Output: " + expectedOutput + " - Desired Output: " + output);
  }

  @Test
  public void Addition() throws InterruptedException {
	
	String expectedOutput = "111111";
	
	// clear result
    driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
    
    // Delay by 1 second
    Thread.sleep(1000);
	
    // Enter the first number
    driver.findElement(By.xpath("//span[@onclick=\"r('-')\"]")).click();
    driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='4']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='4']")).click();
    
    // Delay by 1 second
    Thread.sleep(1000);

    // Select the addition operation
    driver.findElement(By.xpath("//span[normalize-space()='+']")).click();

    // Enter the second number
    driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='4']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='5']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='4']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='5']")).click();

    // Click on the equals button
    driver.findElement(By.xpath("//span[normalize-space()='=']")).click();

    // Get the result and verify it
    String output = driver.findElement(By.cssSelector("div[id='sciOutPut']")).getText().trim();
    
    // Check output is present or not
    Assert.assertNotNull(output);
    
    // Check output is equal or not
    Assert.assertEquals(expectedOutput, output);
    
    // Check output is equal or not
    Assert.assertSame(expectedOutput, output);
    
    // Print Result
    System.out.println("Test: Addition");
    System.out.println("N1: " + "-234234");
    System.out.println("N2: " + "345345");
    System.out.println("Expected Output: " + expectedOutput + " - Desired Output: " + output);
  }
  
  @Test
  public void Subtraction() throws InterruptedException {
	
	String expectedOutput = "23329646";
	
	// clear result
    driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();

    // Delay by 1 second
    Thread.sleep(1000);
	
    // Enter the first number
    driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='4']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='8']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
    
    // Delay by 1 second
    Thread.sleep(1000);

    // Select the subtraction operation
    driver.findElement(By.xpath("//span[@onclick=\"r('-')\"]")).click();

    // Enter the second number
    driver.findElement(By.xpath("//span[@onclick=\"r('(')\"]")).click();
    driver.findElement(By.xpath("//span[@onclick=\"r('-')\"]")).click();
    driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='0']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='9']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='4']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='8']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
    driver.findElement(By.xpath("//span[@onclick=\"r(')')\"]")).click();

    // Click on the equals button
    driver.findElement(By.xpath("//span[normalize-space()='=']")).click();

    // Get the result and verify it
    String output = driver.findElement(By.cssSelector("div[id='sciOutPut']")).getText().trim();
    
    // Check output is present or not
    Assert.assertNotNull(output);
    
    // Check output is equal or not
    Assert.assertEquals(expectedOutput, output);
    
    // Check output is equal or not
    Assert.assertSame(expectedOutput, output);
    
    // Print Result
    System.out.println("Test: Subtraction");
    System.out.println("N1: " + "234823");
    System.out.println("N2: " + "-23094823");
    System.out.println("Expected Output: " + expectedOutput + " - Desired Output: " + output);
  }
}