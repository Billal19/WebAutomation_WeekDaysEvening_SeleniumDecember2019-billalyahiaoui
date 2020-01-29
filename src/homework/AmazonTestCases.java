package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.JsonOutput;

public class AmazonTestCases {

    //We declared the Url :
     static String AmazonUrl ="https://www.amazon.com/";

     // Static WebDriver ;
     static WebDriver driver;

     // Web Elements :
     static String CreateAccount="#nav-signin-tooltip > a > span";
     static String searchBoxXpath="//*[@id=\"twotabsearchtextbox\"]";
     static String typeCologne ="//*[@id=\"twotabsearchtextbox\"]";
     static String clickSearchCologne ="#nav-search > form > div.nav-right > div > input";

    public static void main(String[] args) throws InterruptedException {
        NavigateTo();
        SignIn();
        SearchBox();
        clickSearch();
        SelectCologne();
        AmazonPrime();
        AddToCart();
        Checkout();
        enterEmail();
        tryPrime();


    }

    public static void NavigateTo() throws InterruptedException {
        // We set the path of the chrome Driver
        System.setProperty("webdriver.chrome.driver","BrowserDriver/chromedriver");
        // we declared the web driver reference variable
        driver = new ChromeDriver();
        driver.get(AmazonUrl);
        Thread.sleep(5000);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println("Amazon.com");

        if (title.equals("Amazon.com")){
            System.out.println("title is correct");
        }else {
            System.out.println("the title is not correct");
        }
        driver.close();


    }
    public static void SignIn(){
        driver = new ChromeDriver();
        driver.get(AmazonUrl);
        driver.findElement(By.cssSelector(CreateAccount)).click();
        driver.navigate().back();
        driver.close();


    }

    public static void enterEmail(){
        driver = new ChromeDriver();
        driver.get(AmazonUrl);
        driver.findElement(By.cssSelector(CreateAccount)).click();
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("billal_yahiaoui@hotmail.com");

    }

    public static void SearchBox(){

        driver = new ChromeDriver();
        driver.get(AmazonUrl);
        driver.findElement(By.xpath(searchBoxXpath)).sendKeys("colognes");
        driver.close();

    }

    public static void clickSearch(){
        driver = new ChromeDriver();
        driver.get(AmazonUrl);
        driver.findElement(By.xpath(typeCologne)).sendKeys("colognes");
        driver.findElement(By.cssSelector(clickSearchCologne)).click();
        driver.close();
    }

    public static void SelectCologne(){
        driver= new ChromeDriver();
        driver.get(AmazonUrl);
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("colognes for men");
        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
        driver.findElement(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.sg-row > div.sg-col-20-of-24.sg-col-28-of-32.sg-col-16-of-20.sg-col.s-right-column.sg-col-32-of-36.sg-col-8-of-12.sg-col-12-of-16.sg-col-24-of-28 > div > span:nth-child(5) > div.s-result-list.s-search-results.sg-row > div:nth-child(2) > div > span > div > div > div > div > div:nth-child(3) > h2 > a > span")).click();
       driver.close();

    }

    public static void AmazonPrime(){
        driver = new ChromeDriver();
        driver.get(AmazonUrl);
        driver.findElement(By.xpath("//*[@id=\"nav-logo\"]/a[1]/span[1]")).click();
        driver.close();

    }

    public static void AddToCart(){
        driver = new ChromeDriver();
        driver.get(AmazonUrl);
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("colognes for men");
        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
        driver.findElement(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.sg-row > div.sg-col-20-of-24.sg-col-28-of-32.sg-col-16-of-20.sg-col.s-right-column.sg-col-32-of-36.sg-col-8-of-12.sg-col-12-of-16.sg-col-24-of-28 > div > span:nth-child(5) > div.s-result-list.s-search-results.sg-row > div:nth-child(2) > div > span > div > div > div > div > div:nth-child(3) > h2 > a > span")).click();
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        driver.close();

    }

    public static void Checkout(){
        driver= new ChromeDriver();
        driver.get(AmazonUrl);
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("colognes for men");
        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
        driver.findElement(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.sg-row > div.sg-col-20-of-24.sg-col-28-of-32.sg-col-16-of-20.sg-col.s-right-column.sg-col-32-of-36.sg-col-8-of-12.sg-col-12-of-16.sg-col-24-of-28 > div > span:nth-child(5) > div.s-result-list.s-search-results.sg-row > div:nth-child(2) > div > span > div > div > div > div > div:nth-child(3) > h2 > a > span")).click();
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        driver.findElement(By.cssSelector("#hlb-ptc-btn-native")).click();
        driver.close();
        driver.quit();

    }

    public static void tryPrime(){
        driver = new ChromeDriver();
        driver.get(AmazonUrl);
        driver.findElement(By.xpath("//*[@id=\"nav-link-prime\"]/span[2]")).click();
    }





}
