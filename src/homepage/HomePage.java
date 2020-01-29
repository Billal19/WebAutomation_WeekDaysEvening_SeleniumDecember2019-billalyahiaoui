package homepage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

    //Url for navigation;
    static String GoogleUrl = "https://www.google.com/";
    static String AmazonUrl = "https://www.amazon.com/";
    //static WebDriver driver; // if we make the webdriver static , then we will be able to execute the codes in the main method , however we can run all the codes in the other method if the webdriver is not static.

    public static void main(String[] args) throws InterruptedException {
        HomePage.navigateTo();


//        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Macbook Pro");
//        driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();

        Thread.sleep(2000);// Thread. sleep() is basically a static wait, it partially solves the problem.


    }


    public static void navigateTo(){

        System.setProperty("webdriver.chrome.driver","BrowserDriver/chromedriver"); // first we should get a path of the chrome driver, this used for chrome browser
        WebDriver driver=new ChromeDriver(); // in here we created an object for the webdriver , its called webdriver reference Variable
        driver.get(GoogleUrl); // this one is used to to launch the Url
        driver.get(AmazonUrl);// this one is used to to launch the Url
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        //driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("phone case");
        //driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Macbook Pro"); // in here we wanted to send keys or type our concern in search box, xpath was the only unique locator
        //driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click(); // in here we get the xpath by clicking on the search button in the amazon search box


        // these are the 8 locators:
//        driver.findElement(By.id("value1")).click();
//        driver.findElement(By.name("value2")).click();
//        driver.findElement(By.className("value3")).click();
//        driver.findElement(By.tagName("value4")).click();
//        driver.findElement(By.linkText("value5")).click();
//        driver.findElement(By.partialLinkText("value6")).click();
//        driver.findElement(By.cssSelector("value7")).click();
//        driver.findElement(By.xpath("value8")).click();

        // Dynamic CSS Selector
        // Dynamic Xpath

        // Web Elements ;
        String searchfield="#twotabsearchtextbox"; // we created a variable to use instead of the value for the cssSelector
        String searchItem="phone case";
        String searchButon="//*[@id=\"nav-search\"]/form/div[2]/div/input";
        String selectcase="//*[@id=\"anonCarousel1\"]/ol/li[1]/div/div/div[2]/h2/a/span";
        String  addtocart="//*[@id=\"add-to-cart-button\"]";

        driver.findElement(By.cssSelector(searchfield)).sendKeys(searchItem);
        //driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Macbook Pro");
        driver.findElement(By.xpath(searchButon)).click();
        driver.findElement(By.xpath(selectcase)).click();
        driver.findElement(By.xpath(addtocart)).click();
        //driver.navigate().back();// this navigates back to the blank search box




        String title=driver.getTitle(); // this code is used to get the title the website we were using
        System.out.println(title);
        if (title.equals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")){
            System.out.println("title is correct");
        }else {
            System.out.println("the title is not correct");
        }

        //close the browser that is active/current
       // driver.close(); // this is used to close the page
        //Close all the tab open / all the windows close
        //driver.quit();
    }



}
