/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import java.io.File;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author NicolasSotoPerez
 */
public class ProductoControllerITest {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    
    public ProductoControllerITest(){
        
    }

    @Before
    public void setUp() throws Exception {
        //File file = new File("E:\\Usach 2016\\2sem\\tingeso\\Herramientas\\seleniumDrivers\\geckodriver.exe");
        //File file = new File("E:/Usach 2016/2sem/tingeso/Herramientas/seleniumDrivers/geckodriver.exe");
        File file = new File("C:/geckodriver/geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
        driver = new FirefoxDriver();
        baseUrl = "http://localhost:8080/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Before Selenium Test");
  }
    
    @Test
    public void testSimple() throws Exception {
        // Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
        //WebDriver driver = new FirefoxDriver();

        // And now use this to visit NetBeans
        //driver.get("http://www.netbeans.org");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.netbeans.org");

        // Check the title of the page
        // Wait for the page to load, timeout after 10 seconds
        /*(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver d) {
                return d.getTitle().contains("NetBeans");
            }
        });
        */
        driver.get(baseUrl + "/mavenproject10-web/");
        
        /*
        List<WebElement> codeElems = driver.findElements(By.name("NombreProducto"));
        List<String> codes = new ArrayList<String>();
        for (WebElement codeElem : codeElems) {
            codes.add(codeElem.getAttribute("NombreProducto"));
        }
        assertEquals(2, codes.size());
        assertTrue(codes.contains("Producto1"));
        assertTrue(codes.contains("producto"));
        
        */
        driver.findElement(By.id("ProductoListForm:datalist:createButton")).click();
        driver.findElement(By.id("ProductoCreateForm:nombreProducto")).clear();
        driver.findElement(By.id("ProductoCreateForm:nombreProducto")).sendKeys("productoSelenium");
        driver.findElement(By.id("ProductoCreateForm:descripcion")).clear();
        driver.findElement(By.id("ProductoCreateForm:descripcion")).sendKeys("descripSelenium");
        driver.findElement(By.id("ProductoCreateForm:ciudad")).clear();
        driver.findElement(By.id("ProductoCreateForm:ciudad")).sendKeys("citySelenium");
        driver.findElement(By.id("ProductoCreateForm:nombreAnunciante")).clear();
        driver.findElement(By.id("ProductoCreateForm:nombreAnunciante")).sendKeys("anunSelenium");
        driver.findElement(By.id("ProductoCreateForm:telefonoAnunciante")).clear();
        driver.findElement(By.id("ProductoCreateForm:telefonoAnunciante")).sendKeys("1234");
        driver.findElement(By.id("ProductoCreateForm:precio")).clear();
        driver.findElement(By.id("ProductoCreateForm:precio")).sendKeys("200");
        driver.findElement(By.id("ProductoCreateForm:codigoProducto")).clear();
        driver.findElement(By.id("ProductoCreateForm:codigoProducto")).sendKeys("cod1Selenium");
        driver.findElement(By.id("ProductoCreateForm:id")).clear();
        driver.findElement(By.id("ProductoCreateForm:id")).sendKeys("5");
        driver.findElement(By.id("ProductoCreateForm:j_idt53")).click();
        System.out.println("Test Finished");
        //Close the browser
        //driver.quit();
    }
    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
        fail(verificationErrorString);
        }
        System.out.println("After seleniumTest");
    }
/*
    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
          } catch (NoSuchElementException e) {
            return false;
          }
    }*/

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
          } catch (NoAlertPresentException e) {
            return false;
          }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
              alert.accept();
            } else {
              alert.dismiss();
            }
            return alertText;
          } finally {
            acceptNextAlert = true;
          }
    }
    
}
